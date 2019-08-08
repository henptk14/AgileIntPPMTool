package com.pyikhine.ppmtool.exceptions;

public class ProjectIdExceptionResponse {
	// basically the variable name will act as key in JSON object
	// { "projectIdentifier": whatever value we passed in from ProjectIdException object
	private String projectIdentifier;
	
	public ProjectIdExceptionResponse(String projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
	}

	public String getProjectIdentifier() {
		return projectIdentifier;
	}

	public void setProjectIdentifier(String projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
	}
	
	
}
