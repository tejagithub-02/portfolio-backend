package com.tej.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tej.entity.Project;
import com.tej.repository.ProjectRepository;

@RestController
@CrossOrigin("*")
public class ProjectController {

    @Autowired
    private ProjectRepository repo;

    @GetMapping("/projects")
    public List<Project> getProjects(){

        return repo.findAll();
    }
}