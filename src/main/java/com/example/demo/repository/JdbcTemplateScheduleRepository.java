package com.example.demo.repository;

import com.example.demo.dto.ScheduleResponseDto;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;


public class JdbcTemplateScheduleRepository implements ScheduleRepository {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplateScheduleRepository(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<ScheduleResponseDto> findAll() {
        return List.of();
    }
}
