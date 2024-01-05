package org.hexastacks.heroesdesk.kotlin.impl.task

import org.hexastacks.heroesdesk.kotlin.impl.Description
import org.hexastacks.heroesdesk.kotlin.impl.Hero
import org.hexastacks.heroesdesk.kotlin.impl.Heroes
import org.hexastacks.heroesdesk.kotlin.impl.Title

sealed interface Task<T : TaskId> {
    fun updateTitle(title: Title): Task<out TaskId> = when (this) {
        is PendingTask -> copy(title = title)
        is InProgressTask -> copy(title = title)
        is DoneTask -> copy(title = title)
        is DeletedTask -> copy(title = title)
    }

    fun updateDescription(description: Description): Task<out TaskId> = when (this) {
        is PendingTask -> copy(description = description)
        is InProgressTask -> copy(description = description)
        is DoneTask -> copy(description = description)
        is DeletedTask -> copy(description = description)
    }

    val taskId: T
    val title: Title
    val description: Description
    val creator: Hero
    val assignees: Heroes
}