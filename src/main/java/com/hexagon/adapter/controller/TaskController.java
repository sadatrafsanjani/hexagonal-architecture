package com.hexagon.adapter.controller;

import com.hexagon.application.port.in.TaskUseCase;
import com.hexagon.domain.command.CreateTaskCommand;
import com.hexagon.domain.dto.TaskRequest;
import com.hexagon.domain.dto.TaskResponse;
import com.hexagon.exception.TaskNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final TaskUseCase taskUseCase;

    @GetMapping("/{id}")
    public ResponseEntity<TaskResponse> createTask(@PathVariable("id") Long id){

        TaskResponse response = taskUseCase.findTaskById(id);

        if(response == null){
            throw new TaskNotFoundException("Task not fount!");
        }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createTask(@RequestBody TaskRequest request){

        CreateTaskCommand command = TaskRequest.toCommand(request);

        taskUseCase.createTask(command);

        return new ResponseEntity(HttpStatus.CREATED);
    }
}
