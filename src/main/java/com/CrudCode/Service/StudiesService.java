/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.CrudCode.Service;

import com.CrudCode.Model.Studies;
import java.util.List;

/**
 *
 * @author Higuerey
 */
public interface StudiesService {
    public List<Studies> findAll();
    public Studies save(Studies studies);
    public Studies findById(Integer id);
    public void delete(Integer id);
}
