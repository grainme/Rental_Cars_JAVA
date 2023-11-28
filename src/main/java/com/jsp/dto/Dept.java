package com.jsp.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Dept {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long deptNumber;
	@Column(name="dept_nmae", length = 100, nullable = false, updatable = false)
	private String dname;
	@Column(name="dept_location")
	private String location;
	
	@OneToMany(mappedBy = "departement")
	private List<Employe> emps;
	
	
	public Dept(long deptNumber, String dname, String location) {
		super();
		this.deptNumber = deptNumber;
		this.dname = dname;
		this.location = location;
	}

	public long getDeptNumber() {
		return deptNumber;
	}



	public void setDeptNumber(long deptNumber) {
		this.deptNumber = deptNumber;
	}



	public String getDname() {
		return dname;
	}



	public void setDname(String dname) {
		this.dname = dname;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public Dept() {
	}

}
