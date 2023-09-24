package com.sb.aop.dao;


import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDao {

    private static  final Logger LOGGER= LoggerFactory.getLogger(EmployeeDao.class);

    public void  saveEmployee(){
        LOGGER.info("from save employee");
        
        /* if(new Random().nextInt(15)<=10) {
        	throw new RuntimeException("DUMMY EXCEPTION MESSAGE...!!");
        } */
    }

}
