/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CrudCode.Service;

import com.CrudCode.Dao.AbilitiesDao;
import com.CrudCode.Model.Abilities;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Higuerey
 */

@Service
public class AbilitiesServiceImplement implements AbilitiesService{
    @Autowired
    private AbilitiesDao abilitiesDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Abilities> findAll()
    {
        return (List<Abilities>) abilitiesDao.findAll();
    }
    
    @Transactional(readOnly=false)
    @Override
    public Abilities save(Abilities ablt)
    {
        return abilitiesDao.save(ablt);
    }
    
    @Transactional(readOnly=true)
    @Override
    public Abilities findById(Integer id)
    {
        return abilitiesDao.findById(id).orElse(null);
    }
        
    @Override
    @Transactional(readOnly=false)
    public void delete(Integer id)
    {
        abilitiesDao.deleteById(id);
    }
}
