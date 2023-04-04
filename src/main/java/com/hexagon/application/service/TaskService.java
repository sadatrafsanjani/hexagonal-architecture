package com.hexagon.application.service;

import com.hexagon.application.port.in.TaskUseCase;
import com.hexagon.application.port.out.FindTaskByIdPort;
import com.hexagon.application.port.out.SaveTaskPort;
import com.hexagon.domain.command.CreateTaskCommand;
import com.hexagon.domain.dto.TaskResponse;
import com.hexagon.domain.entity.Task;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskService implements TaskUseCase {

    private final FindTaskByIdPort findTaskByIdPort;
    private final SaveTaskPort saveTaskPort;


    @Override
    public void createTask(CreateTaskCommand command) {

        Task task = Task.builder()
                .title(command.getTitle())
                .description(command.getDescription())
                .build();

        saveTaskPort.saveTask(task);
    }


    @Override
    public TaskResponse findTaskById(long id){

        Task task = findTaskByIdPort.findById(id).get();

        return TaskResponse.toResponse(task);
    }
}
