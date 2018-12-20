package com.jp.hr.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity(name="project")
@Table(name="PROJECT")
public class Project {
	private int projectId;
	private String title;
	
	private List<Emp> emps;

	@Id
	@Column(name="projectId")
	public int getProjectId() {
		return projectId;
	}
	
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	@Column(name="title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@ManyToMany
	@JoinTable(
			name = "EMP_PROJECT",
			joinColumns = @JoinColumn(name = "PROJECTID"),
			inverseJoinColumns = @JoinColumn(name = "EMPNO")
	)
	public List<Emp> getEmps() {
		return emps;
	}

	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", title=" + title + "]";
	}
	
	
}
