package com.learning.restDB.dao.dbinit;

import java.util.Arrays;
import java.util.List;


import com.learning.restDB.dao.entity.Employee;
import com.learning.restDB.dao.repository.EmployeeRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DbInit implements CommandLineRunner {

    @Autowired
    private ApplicationContext appContext;

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public void run(String... args) {

        String[] beans = appContext.getBeanDefinitionNames();
        Arrays.stream(beans)
				.filter(bean->appContext.getBean(bean).getClass().getName().startsWith("com.ilan"))
				.sorted()
				.forEach(bean->{
					log.info(">>>>>>>>>>"+bean + " of Type :: " + appContext.getBean(bean).getClass().getName());
				});

        // Delete all
        this.employeeRepo.deleteAll();

        // Crete users
        Employee ilan =  Employee.builder().accusedName("ILAN").age(29).gender("Male").adharNo("ASTTT").build();
        Employee gokul = Employee.builder().accusedName("GOKUL").age(12).gender("Male").adharNo("ADD222").build();
        Employee kiruthika = Employee.builder().accusedName("KIRUTHIKA").age(2).gender("Female").adharNo("GTT").build();
        Employee vela = Employee.builder().accusedName("VELAYUTHAM").age(5).gender("Male").adharNo("HTYU").build();
        Employee manoj = Employee.builder().accusedName("MANOJ").age(3).gender("Male").adharNo("TYUUII").build();


        List<Employee> employeeLst = Arrays.asList(ilan,gokul,kiruthika,vela,manoj);

        // Save to db
        this.employeeRepo.saveAll(employeeLst);
    }
}

