/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CrudCode.Controller;

import com. CrudCode.Model.Project;
import com.CrudCode.Service.ProjectService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Higuerey
 */
@RestController
@CrossOrigin(origins={"*"})
@RequestMapping("/api")
public class ProjectController {
    @Autowired
    private ProjectService projectService;
    
    //listar
    @GetMapping("/project")
    public List<Project> allProjects()
    {
        return projectService.findAll();
    }
    
    //guardar
    @PostMapping("/project")
    public  Project addProject(@RequestBody Project project)
    {
        return projectService.save(project);
    }
    
    //get una project
    @GetMapping("/project/{id}")
    public Project getProject(@PathVariable Integer id)
    {
        return projectService.findById(id);
    }
    
    //Modeficar
    @PutMapping("/project/{id}")
    public Project editProject(@RequestBody Project project,@PathVariable Integer id)
    {
        Project currentProject= projectService.findById(id);
        currentProject.setTitle(project.getTitle());
        currentProject.setTech(project.getTech());
        currentProject.setLink(project.getLink());
        
        return projectService.save(currentProject);
    }
    
    @DeleteMapping("/project/{id}")
    public void deleteProject(@PathVariable Integer id)
    {
        projectService.delete(id);
    }
    
}
