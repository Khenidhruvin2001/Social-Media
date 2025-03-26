package com.example.socialmedia.service;

import com.example.socialmedia.model.sql.Report;
import com.example.socialmedia.repository.sql.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ReportService {

    @Autowired
    private ReportRepository reportRepo;

    public List<Report> getAll() {
        return reportRepo.findAll();
    }

    public Report create(Report report) {
        return reportRepo.save(report);
    }

    public void delete(Long id) {
        reportRepo.deleteById(id);
    }
}
