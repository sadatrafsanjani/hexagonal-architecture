package com.hexagon.application.port.in;

import com.hexagon.domain.command.CreateTaskCommand;
import com.hexagon.domain.dto.TaskResponse;

public interface TaskUseCase {

    void createTask(CreateTaskCommand command);
    TaskResponse findTaskById(long id);
}
