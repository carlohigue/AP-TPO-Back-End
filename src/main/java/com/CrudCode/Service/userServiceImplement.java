/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CrudCode.Service;

import com.CrudCode.Model.User;
import com.CrudCode.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Higuerey
 */
@Service
public class userServiceImplement implements UserService{
    @Autowired
    private  UserRepo userRepo;
    
    
    @Transactional(readOnly=true)
    @Override
    public User getUser(String id){           
        return userRepo.findById(id).orElse(null);
    }
}
