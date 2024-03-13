





package com.springbootrestapimvc.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.springbootrestapimvc.entities.Project;
import com.springbootrestapimvc.services.ProjectImpl;

@RestController
public class MyController {
	
	@Autowired
	ProjectImpl obj;
	
	@PostMapping("/addProject")
	public Project addProject(@RequestBody Project projectObj) {
		return obj.addProject(projectObj);
	}
	
	@GetMapping(path = "/getAllProjects")
	public Iterable<Project> getAllProjects(){
		return obj.getAllProjects();
	}
	
	@GetMapping(path = "/getProjectById/{project_id}")
	public Optional<Project> getProjectById(@PathVariable int project_id) {
		return obj.getProjectById(project_id);
	}
}
