package com.hibernate_mapping.manytomany;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Emp {
	@Id
private int eid;
	@Column(name="Employee_Nmae")
private String ename;
@ManyToMany
private List<Project> projects;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public List<Project> getProjects() {
	return projects;
}
public void setProjects(List<Project> projects) {
	this.projects = projects;
}
public Emp(int eid, String ename, List<Project> projects) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.projects = projects;
}
public Emp() {
	super();
	
}


}
