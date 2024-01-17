package org.hexastacks.heroesdesk.kotlin.impl.task

import arrow.core.Either
import arrow.core.NonEmptyList
import arrow.core.raise.either
import arrow.core.raise.ensure
import arrow.core.raise.zipOrAccumulate
import org.hexastacks.heroesdesk.kotlin.impl.AbstractStringValue
import org.hexastacks.heroesdesk.kotlin.impl.scope.Scope
import org.hexastacks.heroesdesk.kotlin.impl.task.TaskId.*
import org.hexastacks.heroesdesk.kotlin.impl.task.TaskId.Companion.MAX_LENGTH
import org.hexastacks.heroesdesk.kotlin.impl.task.TaskId.Companion.MIN_LENGTH

class DoneTaskId private constructor(override val scope: Scope, value: String) : TaskId, AbstractStringValue(value) {

    companion object {
        operator fun invoke(
            scope: Scope,
            stringBetween1And36Chars: String
        ): Either<NonEmptyList<TaskIdError>, DoneTaskId> =
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
                    DoneTaskId(scope, stringBetween1And36Chars)
                }
            }
    }
}