package com.springbootrestapimvc.services;

import java.util.List;
import java.util.Optional;

import com.springbootrestapimvc.entities.Project;

public interface ProjectServices {
	public Project addProject(Project obj);
	public Iterable<Project> getAllProjects();
	public Optional<Project> getProjectById(int project_id);
	
}
