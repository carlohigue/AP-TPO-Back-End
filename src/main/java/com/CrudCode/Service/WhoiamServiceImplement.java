/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CrudCode.Service;

import com.CrudCode.Dao.WhoiamDao;
import com.CrudCode.Model.Whoiam;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Higuerey
 */

@Service
public class WhoiamServiceImplement implements WhoiamService{
    
    @Autowired
    private WhoiamDao whoiamDao;
    

    @Transactional(readOnly=false)
    @Override
    public Whoiam save(Whoiam whoiam)
    {
        return whoiamDao.save(whoiam);
    }
    
    @Transactional(readOnly=true)
    @Override
        public List<Whoiam> findAll()
    {
        return (List<Whoiam>) whoiamDao.findAll();
    }
        
    @Transactional(readOnly=true)
    @Override
    public Whoiam findById(Integer id)
    {
        return whoiamDao.findById(id).orElse(null);
    }
}
