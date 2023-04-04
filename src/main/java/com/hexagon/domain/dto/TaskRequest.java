package com.hexagon.domain.dto;

import com.hexagon.domain.command.CreateTaskCommand;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class TaskRequest {

    private String title;
    private String description;

    public static CreateTaskCommand toCommand(TaskRequest request){

        return CreateTaskCommand.builder()
                .title(request.getTitle())
                .description(request.getDescription())
                .build();
    }
}
