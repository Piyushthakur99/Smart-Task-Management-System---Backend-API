package com.example.taskmanager.repository;

import com.example.taskmanager.model.Project;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectRepository extends MongoRepository<Project, String> {
}