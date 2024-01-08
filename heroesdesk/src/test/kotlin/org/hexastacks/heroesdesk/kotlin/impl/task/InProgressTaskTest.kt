package org.hexastacks.heroesdesk.kotlin.impl.task

import arrow.core.getOrElse
import org.hexastacks.heroesdesk.kotlin.impl.Description
import org.hexastacks.heroesdesk.kotlin.impl.Hero
import org.hexastacks.heroesdesk.kotlin.impl.Heroes
import org.hexastacks.heroesdesk.kotlin.impl.Title

class InProgressTaskTest : AbstractTaskTest<InProgressTaskId, InProgressTask>() {
    override fun createTaskOrThrow(id: InProgressTaskId, title: Title, description: Description, creator: Hero, assignees: Heroes) =
        InProgressTask(id, title, description, creator, assignees)

    override fun createTaskIdOrThrow(taskId: String): InProgressTaskId =
        InProgressTaskId(taskId).getOrElse { throw RuntimeException("$taskId should be valid") }

}