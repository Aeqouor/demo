package com.example.demo.repository;

import com.example.demo.dto.ScheduleResponseDto;

import java.util.List;

public interface ScheduleRepository {
    List<ScheduleResponseDto> findAll();
}