package com.example.BasicApp.Repository;

import com.example.BasicApp.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Long> {
}