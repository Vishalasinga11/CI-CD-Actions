package com.example.BasicApp.Service;

import com.example.BasicApp.Entity.Project;
import com.example.BasicApp.Repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> getAllProjects() {
        return  projectRepository.findAll();
    }

    public Project addProject(Project project) {
        return projectRepository.save(project);
    }
}