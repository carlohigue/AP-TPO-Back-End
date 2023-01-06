/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.CrudCode.Service;

import com.CrudCode.Model.Project;
import java.util.List;

/**
 *
 * @author yonder
 */
public interface ProjectService {
    public List<Project> findAll();
    public Project save(Project tarea);
    public Project findById(Integer id);
    public void delete(Integer id);
    
}
