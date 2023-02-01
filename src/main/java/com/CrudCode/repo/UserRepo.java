/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.CrudCode.repo;

import com.CrudCode.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

/**
 *
 * @author Higuerey
 */
//@Repository
public interface UserRepo extends JpaRepository<User, String>{
    
}
