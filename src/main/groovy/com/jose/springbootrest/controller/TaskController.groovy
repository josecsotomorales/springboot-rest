package com.jose.springbootrest.controller

import com.jose.springbootrest.model.Task
import com.jose.springbootrest.service.TaskService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/tasks")
class TaskController {

    @Autowired
    private final TaskService taskService

    @RequestMapping(method = RequestMethod.GET)
    List<Task> findAll() {
        taskService.findAll()
    }

    @RequestMapping(value = '/{id}', method = RequestMethod.GET)
    Task findById(@PathVariable('id') int id) {
        taskService.findById(id)
    }

    @RequestMapping(value = '/add', method = RequestMethod.POST)
    Task saveTask(@RequestBody Task task) {
        taskService.saveTask(task)
    }

}
