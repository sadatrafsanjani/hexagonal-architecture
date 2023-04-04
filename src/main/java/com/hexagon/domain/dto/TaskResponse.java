package com.hexagon.domain.dto;

import com.hexagon.domain.entity.Task;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class TaskResponse {

    private Long id;
    private String title;
    private String description;

    public static TaskResponse toResponse(Task task){

        return TaskResponse.builder()
                .id(task.getId())
                .title(task.getTitle())
                .description(task.getDescription())
                .build();
    }
}
