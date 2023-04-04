package com.hexagon.application.port.out;

import com.hexagon.domain.entity.Task;
import java.util.Optional;

public interface FindTaskByIdPort {

    Optional<Task> findById(Long id);
}
