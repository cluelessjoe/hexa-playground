package org.hexastacks.heroesdesk.kotlin.impl.scope

import arrow.core.getOrElse
import org.hexastacks.heroesdesk.kotlin.impl.user.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import kotlin.test.Test

class ScopeTest {
    @Test
    fun `scopes with same keys and different content are equals`() {
        val scopeKey = scopeKey("COD")
        val scope1 = Scope(name("Write code"), scopeKey)
        val scope2 = Scope(name("Read coode"), scopeKey)

        assertEquals(scope1, scope2)
    }

    @Test
    fun `scopes with different ids and same content aren't equals`() {
        val name = name("Write code")
        val assignees = Heroes.empty
        val scope1 = Scope(name, scopeKey("COD"))
        val scope2 = Scope(name, scopeKey("WRI"))

        assertNotEquals(scope1, scope2)
    }

    @Test
    fun `scopes with same ids and different content have same hashcode`() {
        val scopeKey = scopeKey("COD")
        val scope1 = Scope(name("Write code"), scopeKey).hashCode()
        val scope2 = Scope(name("Read coode"), scopeKey).hashCode()

        assertEquals(scope1, scope2)
    }

    private fun hero() =
        Hero(
            UserName("heroName").getOrElse { throw RuntimeException("HeroName should be valid") },
            HeroId("id").getOrElse { throw RuntimeException("HeroId should be valid") })


    private fun scopeKey(scopeKey: String): ScopeKey =
        ScopeKey(scopeKey).getOrElse { throw RuntimeException("ScopeKey should be valid") }

    private fun name(scopeName: String): Name =
        Name(scopeName).getOrElse { throw RuntimeException("ScopeName should be valid") }


}