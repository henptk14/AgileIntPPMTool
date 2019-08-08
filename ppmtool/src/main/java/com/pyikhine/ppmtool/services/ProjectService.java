package com.pyikhine.ppmtool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pyikhine.ppmtool.domain.Project;
import com.pyikhine.ppmtool.repository.ProjectRepository;

@Service
public class ProjectService {
	@Autowired
	private ProjectRepository projectRepository;
	
	public Project saveOrUpdateProject(Project project) {
		// Logic
		
		return projectRepository.save(project);
	}
}
