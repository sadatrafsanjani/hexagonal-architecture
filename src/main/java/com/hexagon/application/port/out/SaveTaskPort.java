package com.hexagon.application.port.out;

import com.hexagon.domain.entity.Task;

public interface SaveTaskPort {

    void saveTask(Task task);
}
