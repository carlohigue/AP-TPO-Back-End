/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.CrudCode.Dao;

import com.CrudCode.Model.Project;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author yonder
 */

public interface ProjectDao extends CrudRepository<Project, Integer>{
    
}
