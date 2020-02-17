package com.jose.springbootrest.service

import com.jose.springbootrest.model.Task

interface TaskService {

    List<Task> findAll()

    Task findById(Integer id)

    Task saveTask(Task task)

}
