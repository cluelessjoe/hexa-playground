package org.hexastacks.heroesdesk.kotlin.impl

import arrow.core.Either
import arrow.core.NonEmptyList
import arrow.core.raise.either
import arrow.core.raise.ensure
import arrow.core.raise.zipOrAccumulate

class HeroName private constructor(value: String) : AbstractStringValue(value) {

    companion object {
        const val MIN_LENGTH = 1
        const val MAX_LENGTH = 36

        operator fun invoke(stringBetween1And36Chars: String): Either<NonEmptyList<HeroNameError>, HeroName> =
            either {
                zipOrAccumulate(
                    // TODO: see how to  consolidate
                    {
                        ensure(stringBetween1And36Chars.length >= MIN_LENGTH) {
                            BelowMinLengthError(
                                stringBetween1And36Chars
                            )
                        }
                    },
                    {
                        ensure(stringBetween1And36Chars.length <= MAX_LENGTH) {
                            AboveMaxLengthError(
                                stringBetween1And36Chars
                            )
                        }
                    },
                ) { _, _ ->
                    HeroName(stringBetween1And36Chars)
                }
            }
    }

    sealed interface HeroNameError : StringValueError
    data class BelowMinLengthError(val string: String) : HeroNameError {
        override val message: String =
            "HeroName must be above ${HeroId.MIN_LENGTH} characters, got ${string.length} in $string"
    }

    data class AboveMaxLengthError(val string: String) : HeroNameError {
        override val message: String =
            "HeroName must be below ${HeroId.MAX_LENGTH} characters, got ${string.length} in $string"
    }
}