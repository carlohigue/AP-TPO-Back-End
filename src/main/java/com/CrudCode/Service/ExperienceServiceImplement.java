/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CrudCode.Service;

import com.CrudCode.Dao.ExperienceDao;
import com.CrudCode.Model.Experience;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Higuerey
 */


@Service
public class ExperienceServiceImplement implements ExperienceService{
    @Autowired
    private ExperienceDao experienceDao;
    
    @Transactional(readOnly=true)
    @Override
    public List<Experience> findAll()
    {
        return (List<Experience>) experienceDao.findAll();
    }
    
    @Transactional(readOnly=false)
    @Override
    public Experience save(Experience exp)
    {
        return experienceDao.save(exp);
    }
    
    @Transactional(readOnly=true)
    @Override
    public Experience findById(Integer id)
    {
        return experienceDao.findById(id).orElse(null);
    }
    
    @Override
    @Transactional(readOnly=false)
    public void delete(Integer id)
    {
        experienceDao.deleteById(id);
    }
}
