package org.hexastacks.heroesdesk.kotlin.impl

import arrow.core.getOrElse
import org.hexastacks.heroesdesk.kotlin.impl.scope.Name
import org.hexastacks.heroesdesk.kotlin.impl.scope.Scope
import org.hexastacks.heroesdesk.kotlin.impl.scope.ScopeKey
import org.hexastacks.heroesdesk.kotlin.impl.task.Description
import org.hexastacks.heroesdesk.kotlin.impl.task.Title
import org.hexastacks.heroesdesk.kotlin.impl.user.Hero
import org.hexastacks.heroesdesk.kotlin.impl.user.HeroId
import org.hexastacks.heroesdesk.kotlin.impl.user.UserName

object TestUtils {

    fun createScopeOrThrow(scopeKey: String): Scope =
        Scope(
            Name(scopeKey).getOrElse { throw RuntimeException("scope should be valid: $it") },
            createScopeKeyOrThrow(scopeKey)
        )

    fun createScopeKeyOrThrow(scopeKey: String): ScopeKey =
        ScopeKey(scopeKey).getOrElse { throw RuntimeException("scope should be valid: $it") }


    fun createTitleOrThrow(title: String): Title =
        Title(title).getOrElse { throw RuntimeException("title should be valid: $it") }

    fun createDescriptionOrThrow(description: String): Description =
        Description(description).getOrElse { throw RuntimeException("description should be valid: $it") }

    fun createHeroNameOrThrow(creator: String): UserName =
        UserName(creator).getOrElse { throw RuntimeException("$creator should be valid: $it") }

    fun createHeroIdOrThrow(heroId: String): HeroId =
        HeroId(heroId).getOrElse { throw RuntimeException("$heroId should be valid: $it") }

    fun createHeroOrThrow(creator: String, id: String): Hero =
        Hero(createHeroNameOrThrow(creator), createHeroIdOrThrow(id))

}