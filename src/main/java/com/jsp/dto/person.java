package com.jsp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class person {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long persNumber;
	@Column(name="name", nullable=false, length=100, updatable=false)
	private String name;
	@Column(name="adress", nullable=false, length=100, updatable=false)
	private String adress;
	
	public person(long id, String name, String adress) {
		this.persNumber = id;
		this.name = name;
		this.adress = adress;
	}
	
	public person() {
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public long getPersNumber() {
		return persNumber;
	}

	public void setPersNumber(long persNumber) {
		this.persNumber = persNumber;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}


}
