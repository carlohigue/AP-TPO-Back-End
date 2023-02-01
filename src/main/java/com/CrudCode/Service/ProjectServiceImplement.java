/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.CrudCode.Service;

import com.CrudCode.Model.Project;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.CrudCode.Dao.ProjectDao;

/**
 *
 * @author Higuerey
 */
@Service
public class ProjectServiceImplement  implements ProjectService{
    @Autowired
    private ProjectDao projectDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Project> findAll()
    {
        return (List<Project>) projectDao.findAll();
    }
    
    @Override
    @Transactional(readOnly=false)
    public Project save(Project project)
    {
        return projectDao.save(project);
    }
    
    @Override
    @Transactional(readOnly=true)
    public Project findById(Integer id)
    {
        return projectDao.findById(id).orElse(null);
    }
    
    @Override
    @Transactional(readOnly=false)
    public void delete(Integer id)
    {
        projectDao.deleteById(id);
    }
    
}
