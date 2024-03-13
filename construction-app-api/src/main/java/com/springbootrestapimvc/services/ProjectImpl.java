package com.springbootrestapimvc.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootrestapimvc.DAO.ProjectDao;
import com.springbootrestapimvc.entities.Project;

@Service
public class ProjectImpl implements ProjectServices{
	
	@Autowired
	ProjectDao dao;
	
	@Override
	public Project addProject(Project obj) {
		
		return dao.save(obj);
	}
	
	@Override
	public Iterable<Project> getAllProjects() {
		// TODO Auto-generated method stub
		
		return dao.findAll();
	}
	
	@Override
	public Optional<Project> getProjectById(int project_id) {
		return dao.findById(project_id);
	}
}
