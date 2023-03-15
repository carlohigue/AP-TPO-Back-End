/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CrudCode.Controller;

import com.CrudCode.Model.Abilities;
import com.CrudCode.Service.AbilitiesService;
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
@RequestMapping("/abilities")
public class AbilitiesController {
    @Autowired
    private AbilitiesService abilitiesService;
    

    @GetMapping("/content")
    public List<Abilities> allAbilities()
    {
        return abilitiesService.findAll();
    }

    @PostMapping("/")
    public  Abilities addAbilities(@RequestBody Abilities abilities)
    {
        return abilitiesService.save(abilities);
    }
    
    @PutMapping("/{id}")
    public Abilities editAbilities (@RequestBody Abilities ablt,@PathVariable Integer id)
    {
        Abilities currentAbilities= abilitiesService.findById(id);
        currentAbilities.setCategory(ablt.getCategory());
        currentAbilities.setSvg(ablt.getSvg());
        currentAbilities.setSvgcolor(ablt.getSvgcolor());
        currentAbilities.setTech(ablt.getTech());
        currentAbilities.setQuality(ablt.getQuality());
        return abilitiesService.save(currentAbilities);
    }
    
    @DeleteMapping("/{id}")
    public void deleteAbilities(@PathVariable Integer id)
    {
        abilitiesService.delete(id);
    }
}
