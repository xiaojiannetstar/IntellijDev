package com.github.xiaojiannetstar.intellijdev.services

import com.intellij.openapi.project.Project
import com.github.xiaojiannetstar.intellijdev.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
