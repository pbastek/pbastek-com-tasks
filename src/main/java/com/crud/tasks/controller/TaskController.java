package com.crud.tasks.controller;

import com.crud.tasks.domain.TaskDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/tasks")
public class TaskController {

    @GetMapping
    public List<TaskDto> getTasks(){ return new ArrayList<>();
    }

    @GetMapping("/{Id}")
    public TaskDto getTask(String taskId){
        return new TaskDto((long)1, "test title", "test_content");
    }

    @DeleteMapping("/{Id}")
    public void deleteTask(String taskId){
    }

    @PutMapping("/{Id}")
    public TaskDto updateTask(TaskDto taskDto){
        return new TaskDto((long)1, "Edited test title", "Test content");
    }

    @PostMapping
    public void createTask(TaskDto taskDto){
    }
}

