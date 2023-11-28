package com.jsp.dto;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class CasualEmp extends person{
	
	private Date doubleDippingValidityDate;
	
	public CasualEmp(Date date) {
		this.doubleDippingValidityDate = date;
	}
	
	public CasualEmp() {
	}

	public Date getDoubleDippingValidityDate() {
		return doubleDippingValidityDate;
	}

	public void setDoubleDippingValidityDate(Date doubleDippingValidityDate) {
		this.doubleDippingValidityDate = doubleDippingValidityDate;
	}
	
}
