package com.example.socialmedia.controller;

import com.example.socialmedia.model.sql.Report;
import com.example.socialmedia.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reports")
public class ReportController {
    @Autowired
    private ReportService service;

    @GetMapping
    public List<Report> getAll() { return service.getAll(); }

    @PostMapping
    public Report create(@RequestBody Report report) { return service.create(report); }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}
