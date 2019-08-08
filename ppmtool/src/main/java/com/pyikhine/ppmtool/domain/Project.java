package com.pyikhine.ppmtool.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Project {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="project_name")
	@NotBlank(message="Project name is required")
	private String projectName;
	
	@Column(name="project_identifier", updatable=false, unique=true)
	@NotBlank(message="Project Identifier is required")
	@Size(min=4, max=5, message="Please use 4 to 5 characters")
	private String projectIdentifier;	
	
	@Column(name="description")
	@NotBlank(message="Project description is required")
	private String description;
	
	@Column(name="start_date")
	@JsonFormat(pattern = "yyyy-mm-dd ' ' HH:mm:ss z")
	private Date start_date;
	
	@Column(name="end_date")
	@JsonFormat(pattern = "yyyy-mm-dd ' ' HH:mm:ss z")
	private Date end_date;
	
	@Column(name="create_at")
	@JsonFormat(pattern = "yyyy-mm-dd ' ' HH:mm:ss z")
	private Date create_At;
	
	@Column(name="update_at")
	@JsonFormat(pattern = "yyyy-mm-dd ' ' HH:mm:ss z")
	private Date updated_At;
	
	@PrePersist
	protected void onCreate() {
		this.create_At = new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updated_At = new Date();
	}
	
	public Project() {
		
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectIdentifier() {
		return projectIdentifier;
	}

	public void setProjectIdentifier(String projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public Date getCreate_At() {
		return create_At;
	}

	public void setCreate_At(Date create_At) {
		this.create_At = create_At;
	}

	public Date getUpdated_At() {
		return updated_At;
	}

	public void setUpdated_At(Date updated_At) {
		this.updated_At = updated_At;
	}
	
}
