package com.hexagon.domain.command;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class CreateTaskCommand {

    private long id;
    private String title;
    private String description;

}
