/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CrudCode.Controller;

import com.CrudCode.Model.User;
import com.CrudCode.Service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Higuerey
 */
@RestController
@RequestMapping("/user")
@CrossOrigin(origins="*")
public class UserController {
    @Autowired
    private UserService userService;
    
    @PostMapping("/login")
    public ResponseEntity<?> authUser(@RequestBody User userData){
        User user = userService.getUser(userData.getUserId());
        if(user.getPassword().equals(userData.getPassword())){
            return ResponseEntity.ok(user.getRole());
        }
        return null;
    }
    
    @GetMapping("/test")
    public String Test(){
        return "test on user/login";
    }
}
