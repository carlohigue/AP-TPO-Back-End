/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.CrudCode.Service;

import com.CrudCode.Model.Abilities;
import java.util.List;

/**
 *
 * @author Higuerey
 */
public interface AbilitiesService {
    public List<Abilities> findAll();
    public Abilities save(Abilities tarea);
    public Abilities findById(Integer id);
    public void delete(Integer id);
}
