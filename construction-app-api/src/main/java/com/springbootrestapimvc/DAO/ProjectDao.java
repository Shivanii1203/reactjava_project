package com.springbootrestapimvc.DAO;

import org.springframework.data.repository.CrudRepository;
import com.springbootrestapimvc.entities.Project;

public interface ProjectDao extends CrudRepository<Project, Integer>{
	
}
