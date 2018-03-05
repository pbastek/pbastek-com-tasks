package com.crud.tasks.controller;

import com.crud.tasks.domain.TaskDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/task")
public class TaskController {

    @GetMapping("/tasks")
    public List<TaskDto> getTasks(){ return new ArrayList<>();
    }

    @GetMapping("/tasks/{Id}")
    public TaskDto getTask(String taskId){
        return new TaskDto((long)1, "test title", "test_content");
    }

    @DeleteMapping("/tasks")
    public void deleteTask(String taskId){
    }

    @PutMapping
    public TaskDto updateTask(TaskDto taskDto){
        return new TaskDto((long)1, "Edited test title", "Test content");
    }

    @PostMapping
    public void createTask(TaskDto taskDto){
    }
}

