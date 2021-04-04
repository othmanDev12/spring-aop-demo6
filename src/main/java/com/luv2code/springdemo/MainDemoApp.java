package com.luv2code.springdemo;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.luv2code.springdemo.dao.AccountDao;
import com.luv2code.springdemo.dao.MemberShipDao;

public class MainDemoApp {
	
	public static void main(String[] args) throws IOException, Exception {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDao accountDao = context.getBean("accountDao" , AccountDao.class);
		
		MemberShipDao memberShipDao = context.getBean("memberShipDao" , MemberShipDao.class);
		
		Account account = new Account();
		account.setName("othman");
		account.setLevel("bronse");
		accountDao.addAccount(account , true);
		
		accountDao.updateAccount();
		
		// display getters and setters
		
		 accountDao.setName("othman"); accountDao.setServiceAccount("proxy");
		  
		 accountDao.getName(); accountDao.getServiceAccount();
		 
		
		memberShipDao.addAccount();
		
		memberShipDao.deleteMember();
		
	    context.close();
	}

}
