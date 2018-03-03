package com.crud.tasks.controller;

import com.crud.tasks.domain.TaskDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/tasks")
public class TaskController {

    @RequestMapping(value = "/managed-tasks", method = RequestMethod.GET)
    public List<TaskDto> getTasks(){ return new ArrayList<>();
    }

    @RequestMapping(value = "/taskId", method = RequestMethod.GET)
    public TaskDto getTask(String taskId){
        return new TaskDto((long)1, "test title", "test_content");
    }

    @RequestMapping(value = "deleted-task", method = RequestMethod.DELETE)
    public void deleteTask(String taskId){
    }

    @RequestMapping(value = "updated-task", method = RequestMethod.PUT)
    public TaskDto updateTask(TaskDto taskDto){
        return new TaskDto((long)1, "Edited test title", "Test content");
    }

    @RequestMapping(value = "created-task", method = RequestMethod.POST)
    public void createTask(TaskDto taskDto){
    }
}
