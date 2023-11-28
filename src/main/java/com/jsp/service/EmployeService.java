package com.jsp.service;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.*;

public class EmployeService {
	
	EmployeeDao employeDao = new EmployeeDao();
	
	public void SaveEmploye(Employe employe) {
		employeDao.saveEmployee(employe);
	}
	
	public Employe findEmployeByName(String name) {
		return employeDao.findEmployeByName(name);
	}
	
	public Employe updateEmploye(Employe emp) {
		return employeDao.updateEmploye(emp);
	}
	
}
