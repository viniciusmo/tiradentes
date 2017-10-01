package com.viniciusmo.tiradentes

import com.viniciusmo.tiradentes.tasks.ExtractStringsFromLayouts
import org.gradle.api.Plugin
import org.gradle.api.Project

class TiradentesPlugin : Plugin<Project> {

    internal val EXTRACT_STRINGS_FROM_LAYOUTS = "extractStringsFromLayouts"
    internal val EXTRACT_DIMENSIONS_FROM_LAYOUTS = "extractDimensionsFromLayouts"

    override fun apply(target: Project) {
        target.tasks.create(EXTRACT_STRINGS_FROM_LAYOUTS, ExtractStringsFromLayouts::class.java)
    }

}