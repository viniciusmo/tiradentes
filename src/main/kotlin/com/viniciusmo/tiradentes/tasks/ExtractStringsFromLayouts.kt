package com.viniciusmo.tiradentes.tasks

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class ExtractStringsFromLayouts : DefaultTask() {

    @TaskAction
    fun extractStringsFromLayouts() {
        val projectPath = project.projectDir.path
    }

}