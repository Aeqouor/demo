package com.example.demo.service;

import com.example.demo.dto.ScheduleResponseDto;
import com.example.demo.entity.Schedule;
import com.example.demo.repository.ScheduleRepository;

import java.util.List;

public class SchedulesServiceImpl implements ScheduleService {
    private ScheduleRepository scheduleRepository;

    public SchedulesServiceImpl(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    public List<ScheduleResponseDto> findAll() {
        return scheduleRepository.findAll();

    }

    @Override
    public ScheduleResponseDto findScheduleById(long id) {

        Schedule schedule = scheduleRepositrory.findScheduleByIds(id);

        return null;
    }
}
