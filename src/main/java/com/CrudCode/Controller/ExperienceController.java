/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CrudCode.Controller;

import com.CrudCode.Model.Experience;
import com.CrudCode.Service.ExperienceService;
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
@RequestMapping("/experience")
public class ExperienceController {
     @Autowired
    private ExperienceService experienceService;
    

    @GetMapping("/content")
    public List<Experience> allExperience()
    {
        return experienceService.findAll();
    }
    
    @PostMapping("/")
    public  Experience addExperience(@RequestBody Experience experience)
    {
        return experienceService.save(experience);
    }

    @PutMapping("/{id}")
    public Experience editExperience(@RequestBody Experience experience,@PathVariable Integer id)
    {
        Experience currentExperience= experienceService.findById(id);
        currentExperience.setImg(experience.getImg());
        currentExperience.setCompany(experience.getCompany());
        currentExperience.setTitle(experience.getTitle());
        currentExperience.setDates(experience.getDates());
        
        return experienceService.save(currentExperience);
    }
    
    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable Integer id)
    {
        experienceService.delete(id);
    }
}
