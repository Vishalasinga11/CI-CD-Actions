package com.example.BasicApp.Service;

import com.example.BasicApp.Entity.Project;
import com.example.BasicApp.Repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Project updateProject(Long id, Project projectDetails) {
        Optional<Project> project = projectRepository.findById(id);
        if(project.isPresent()) {
            Project p1 = project.get();

            p1.setName(projectDetails.getName());
            p1.setDescription(projectDetails.getDescription());
            p1.setEndDate(projectDetails.getEndDate());
            p1.setStartDate(projectDetails.getStartDate());
            p1.setStatus(projectDetails.getStatus());

            return projectRepository.save(p1);
        }
        return null;

    }

    // Delete a project
    public String deleteProject(Long id) {
        Optional<Project> project = projectRepository.findById(id);
        if(project.isPresent()){
            projectRepository.delete(project.get());

            return "Deleted successfully";
        }
        return "Id not found";

    }
}