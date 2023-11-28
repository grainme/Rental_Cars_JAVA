package com.jsp.dto;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "employee")
public class Employe extends person{
	
	private String job;
	private Date hiredate;
	private Float salary;
	private float commission;
	
	@ManyToOne
	private Dept departement;
	
	@ManyToOne
	private Employe Manager;
	
	@OneToMany(mappedBy = "Manager")
	private List<Employe> lowers;
	

	public Employe() {
	}

	public Employe(long id, String name, String adress, String job, Date hiredate, Float salary, float commission) {
		super(id, name, adress);
		this.job = job;
		this.hiredate = hiredate;
		this.salary = salary;
		this.commission = commission;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public float getCommission() {
		return commission;
	}

	public void setCommission(float commission) {
		this.commission = commission;
	}

}
