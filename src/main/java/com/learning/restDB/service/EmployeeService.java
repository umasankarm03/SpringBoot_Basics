package com.learning.restDB.service;

import java.util.List;

import javax.transaction.Transactional;

import com.learning.restDB.dao.entity.Employee;
import com.learning.restDB.dao.repository.EmployeeRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EmployeeService {
	

	Logger logger = LoggerFactory.getLogger(EmployeeService.class);
	
	@Autowired
	EmployeeRepo employeeRepo;

	@Transactional
	public List<Employee> findByEmployeeName(String name) {

		return employeeRepo.findByEmployeeName(name);
	}

	@Transactional
	public List<Employee> findByGender(String gender) {

		return employeeRepo.findByGender(gender);
	}

	@Transactional
	public Employee findByAdharNo(String adharNo) {

		return employeeRepo.findByAdharNo(adharNo);
	}

	@Transactional
	public Employee save(Employee employee) {

		return employeeRepo.save(employee);
	}

	@Transactional
	public List<Employee> saveAll(List<Employee> employeeLst) {

		return employeeRepo.saveAll(employeeLst);
	}
	



}
