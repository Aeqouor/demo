package com.example.demo.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ScheduleResponseDto {
    private int id;
    private String title;
    private String name;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public ScheduleResponseDto(int id, String title, String name, LocalDateTime createdAt, LocalDateTime modifiedAt){
        this.id = id;
        this.title = title;
        this.name = name;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }
}
