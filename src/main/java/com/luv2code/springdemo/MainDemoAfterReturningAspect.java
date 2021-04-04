package com.luv2code.springdemo;

import java.io.IOException;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.luv2code.springdemo.dao.AccountDao;


public class MainDemoAfterReturningAspect {
	
	public static void main(String[] args) throws IOException, Exception {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDao accountDao = context.getBean("accountDao" , AccountDao.class);
		
		// call the findAccounts() method from the AccountDao class
		List<Account> accounts = null;
		try {
			boolean condExc = true;
			accounts = accountDao.findAccounts(condExc);
			
		} catch (Exception e) {
			System.out.println("Exception cought: " + e);
		}
		
		
		System.out.println("\n \n the Main Programme");
		
		System.out.println("---------");
		
		System.out.println("list of account are: " + accounts);
		
	    context.close();
	}

}
