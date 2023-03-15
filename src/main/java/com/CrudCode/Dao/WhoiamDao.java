/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.CrudCode.Dao;

import com.CrudCode.Model.Whoiam;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Higuerey
 */ 
public interface WhoiamDao extends CrudRepository<Whoiam, Integer>{
    
}
