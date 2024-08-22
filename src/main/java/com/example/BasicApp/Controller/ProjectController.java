package com.example.BasicApp.Controller;

import com.example.BasicApp.Entity.Project;
import com.example.BasicApp.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProjectController {
    @Autowired
    private ProjectService service;

    @GetMapping
    public List<Project> getProject(){
        return service.getAllProjects();
    }

    @PostMapping
    public Project addProject(@RequestBody Project project){
        return service.addProject(project);
    }

    @PutMapping("/{id}")
    public Project updateProject(@PathVariable Long id, @RequestBody Project projectDetails) {
        return service.updateProject(id, projectDetails);
    }

    // Delete a project
    @DeleteMapping("/{id}")
    public String deleteProject(@PathVariable Long id) {

        return service.deleteProject(id);

    }
}