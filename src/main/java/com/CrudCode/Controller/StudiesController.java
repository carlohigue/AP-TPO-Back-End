/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CrudCode.Controller;

import com.CrudCode.Model.Studies;
import com.CrudCode.Service.StudiesService;
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
@RequestMapping("/studies")
public class StudiesController {
    @Autowired
    private StudiesService studiesService;
    

    @GetMapping("/content")
    public List<Studies> allStudies()
    {
        return studiesService.findAll();
    }
    
    @PostMapping("/")
    public  Studies addStudies(@RequestBody Studies experience)
    {
        return studiesService.save(experience);
    }

    @PutMapping("/{id}")
    public Studies editStudies(@RequestBody Studies experience,@PathVariable Integer id)
    {
        Studies currentStudies= studiesService.findById(id);
        currentStudies.setImg(experience.getImg());
        currentStudies.setCompany(experience.getCompany());
        currentStudies.setTitle(experience.getTitle());
        currentStudies.setDates(experience.getDates());
        
        return studiesService.save(currentStudies);
    }
    
    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable Integer id)
    {
        studiesService.delete(id);
    }
}
