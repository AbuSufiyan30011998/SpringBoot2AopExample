package com.sb.aop.loader;

import com.sb.aop.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements CommandLineRunner {


    @Autowired
    private EmployeeDao employeeDao;
    @Override
    public void run(String... args) throws Exception {

        employeeDao.saveEmployee();

    }
}
