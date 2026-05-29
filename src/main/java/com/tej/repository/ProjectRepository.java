package com.tej.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tej.entity.Project;

public interface ProjectRepository 
extends JpaRepository<Project, Integer>{

}