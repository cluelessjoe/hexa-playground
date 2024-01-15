package org.hexastacks.heroesdesk.kotlin.impl.task

import arrow.core.getOrElse
import org.hexastacks.heroesdesk.kotlin.impl.scope.Scope
import org.hexastacks.heroesdesk.kotlin.impl.user.Hero
import org.hexastacks.heroesdesk.kotlin.impl.user.Heroes

class DoneTaskTest : AbstractTaskTest<DoneTaskId, DoneTask>() {
    override fun createTaskOrThrow(
        scope: Scope,
        id: DoneTaskId,
        title: Title,
        description: Description,
        creator: Hero,
        assignees: Heroes
    ) =
        DoneTask(scope, id, title, description, assignees)

    override fun createTaskIdOrThrow(taskId: String): DoneTaskId =
        DoneTaskId(taskId).getOrElse { throw RuntimeException("$taskId should be valid") }

}