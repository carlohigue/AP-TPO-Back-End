/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CrudCode.Service;

import com.CrudCode.Dao.StudiesDao;
import com.CrudCode.Model.Studies;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Higuerey
 */

@Service
public class StudiesServiceImplement implements StudiesService{
    @Autowired
    private StudiesDao studiesDao;
    
    @Transactional(readOnly=true)
    @Override
    public List<Studies> findAll()
    {
        return (List<Studies>) studiesDao.findAll();
    }
    
    @Transactional(readOnly=false)
    @Override
    public Studies save(Studies studies)
    {
        return studiesDao.save(studies);
    }
    
    @Transactional(readOnly=true)
    @Override
    public Studies findById(Integer id)
    {
        return studiesDao.findById(id).orElse(null);
    }
    
    @Override
    @Transactional(readOnly=false)
    public void delete(Integer id)
    {
        studiesDao.deleteById(id);
    }
}
