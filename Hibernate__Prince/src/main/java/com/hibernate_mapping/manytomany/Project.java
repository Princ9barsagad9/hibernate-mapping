package com.hibernate_mapping.manytomany;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Project {
@Id
private int pid;
@Column(name="Project_Nmae")
private String pname;
@ManyToMany(mappedBy="projects")
private List<Emp> emps;

public int getPid() {
	return pid;
}

public void setPid(int pid) {
	this.pid = pid;
}

public String getPname() {
	return pname;
}

public void setPname(String pname) {
	this.pname = pname;
}

public List<Emp> getEmps() {
	return emps;
}

public void setEmps(List<Emp> emps) {
	this.emps = emps;
}

public Project(int pid, String pname, List<Emp> emps) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.emps = emps;
}

public Project() {
	super();
	
}

}
