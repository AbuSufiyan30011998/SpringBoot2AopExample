package com.sb.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TransactionService {

	private static final Logger LOGGER = LoggerFactory.getLogger(TransactionService.class);

	// POINTCUT: as.rt.pckg.cls.met()
	@Pointcut("execution(public void com.sb.aop.dao.EmployeeDao.saveEmployee())")
	public void p1() {
	}

	// ADVICE:
	@Before("p1()") // JOINPOINT..
	public void beginTransaction() {
		LOGGER.info("transaction started...!!");
	}

	// ADVICE
	@AfterReturning("p1()") // JOINPOINT
	public void txCommited() {
		LOGGER.info("transaction commited...");
	}

   //	ADVICE
	@AfterThrowing("p1()")    // JOINPOINT
	public void txRollback() {
		LOGGER.info("transaction rollback...!!");
	}

	// ADVICE:
	@After("p1()") // JOINPOINT..
	public void reportSent() {
		LOGGER.info("report sent...!!");
	}
}
