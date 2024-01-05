package org.hexastacks.heroesdesk.kotlin.impl.task

import org.hexastacks.heroesdesk.kotlin.impl.Description
import org.hexastacks.heroesdesk.kotlin.impl.Hero
import org.hexastacks.heroesdesk.kotlin.impl.Heroes
import org.hexastacks.heroesdesk.kotlin.impl.Title

data class DeletedTask(
    override val taskId: DeletedTaskId,
    override val title: Title,
    override val description: Description,
    override val creator: Hero,
    override val assignees: Heroes
) : Task<DeletedTaskId> {

}