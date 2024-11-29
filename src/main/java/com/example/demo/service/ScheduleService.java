package com.example.demo.service;

import com.example.demo.dto.ScheduleResponseDto;

import java.util.List;

public interface ScheduleService {

    static List<ScheduleResponseDto> findAll(String name, String modifiedDate) {
        return null;
    }

    ScheduleResponseDto findScheduleById(long id);
}
