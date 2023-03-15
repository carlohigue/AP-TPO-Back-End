/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.CrudCode.Service;

import com.CrudCode.Model.Whoiam;
import java.util.List;


/**
 *
 * @author Higuerey
 */
public interface WhoiamService{
    public Whoiam save(Whoiam whoiam);
    public List<Whoiam> findAll();
    public Whoiam findById(Integer id);
}
