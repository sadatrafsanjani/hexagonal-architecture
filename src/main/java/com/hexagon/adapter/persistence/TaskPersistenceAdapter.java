package com.hexagon.adapter.persistence;

import com.hexagon.adapter.repository.TaskRepository;
import com.hexagon.application.port.out.FindTaskByIdPort;
import com.hexagon.application.port.out.SaveTaskPort;
import com.hexagon.domain.entity.Task;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class TaskPersistenceAdapter implements FindTaskByIdPort, SaveTaskPort {

    private final TaskRepository taskRepository;

    @Override
    public Optional<Task> findById(Long id) {

        return taskRepository.findById(id);
    }

    @Override
    public void saveTask(Task task) {

        taskRepository.save(task);
    }
}
