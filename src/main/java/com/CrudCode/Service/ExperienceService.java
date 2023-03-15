/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.CrudCode.Service;

import com.CrudCode.Model.Experience;
import java.util.List;

/**
 *
 * @author Higuerey
 */
public interface ExperienceService {
    public List<Experience> findAll();
    public Experience save(Experience tarea);
    public Experience findById(Integer id);
    public void delete(Integer id);
}
