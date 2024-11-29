package com.example.demo.controller;

import com.example.demo.dto.ScheduleResponseDto;
import com.example.demo.service.ScheduleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/schedules")

public class ScheduleController {
    private final ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @GetMapping
    public ResponseEntity<List<ScheduleResponseDto>> findAll(@RequsetPram(value = "name", required = false) String name,
                                                             @Requsetpram(value = "modifiedDate", reqiird = false) String modifiedDate) {
        return new ResponseEntity<>(scheduleService.findAll(name, modifiedDate), httpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ScheduleResponseDto> findById(@PathVariable("id") int id) {
        return new ResponseEntity<>(SchedulesService.findById(),httpStatus.OK);
    }


}





