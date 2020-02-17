package com.jose.springbootrest.service.impl

import com.jose.springbootrest.model.Task
import com.jose.springbootrest.repository.TaskRepository
import com.jose.springbootrest.service.TaskService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TaskServiceImpl implements TaskService {

    @Autowired
    private final TaskRepository taskRepository

    @Override
    List<Task> findAll() {
        taskRepository.findAll()
    }

    @Override
    Task findById(Integer id) {
        taskRepository.findById(id)
    }

    @Override
    Task saveTask(Task task) {
        taskRepository.save(task)
    }
}
