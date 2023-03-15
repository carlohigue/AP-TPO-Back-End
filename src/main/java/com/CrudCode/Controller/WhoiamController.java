/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CrudCode.Controller;


import com.CrudCode.Model.Whoiam;
import com.CrudCode.Service.WhoiamService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Higuerey
 */

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/whoiam")
public class WhoiamController {
    @Autowired
    private WhoiamService whoiamService;
    
        @GetMapping("/content")
    public List<Whoiam> contentWhoiam()
    {
        return whoiamService.findAll();
    }
    
    @PutMapping("/{id}")
    public Whoiam editWhoiam(@RequestBody String whoiam,@PathVariable Integer id)
    {
        Whoiam currentWhoiam= whoiamService.findById(id);
        currentWhoiam.setWhoiam(whoiam);
        
        return whoiamService.save(currentWhoiam);
    }
}
