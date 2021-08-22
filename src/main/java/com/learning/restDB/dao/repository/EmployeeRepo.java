package com.learning.restDB.dao.repository;

import java.util.List;


import com.learning.restDB.dao.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{
	
	List<Employee> findByEmployeeName(String name);
	
	List<Employee> findByGender(String gender);
	
	Employee findByAdharNo(String gender);

}
