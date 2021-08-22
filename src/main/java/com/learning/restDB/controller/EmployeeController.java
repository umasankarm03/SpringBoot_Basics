package com.learning.restDB.controller;

import com.learning.restDB.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import io.swagger.annotations.Api;

@Api(value = "CrimeVo", description = "ACCUSED DATA INFO",position = 66)
@RestController
@RequestMapping("/employee")
public class EmployeeController  {

	@Autowired
	EmployeeService employeeService;


}
