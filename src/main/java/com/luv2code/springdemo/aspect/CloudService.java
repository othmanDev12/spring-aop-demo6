package com.luv2code.springdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.luv2code.springdemo.Account;


@Aspect
@Component
@Order(1)
public class CloudService {
	
	@Before("com.luv2code.springdemo.aspect.LuvAopExpression.forDaoPackegeNotGetterAndSetter()")
	public void logCloudService(JoinPoint theJoinPoint) {
		System.out.println("======>>> EXecution the Cloud Serivce");
		
		// create the method signature
		MethodSignature methodSignature = (MethodSignature) theJoinPoint.getSignature();
		
		System.out.println("the mthod are: " + methodSignature);
		
		// get args
		
		// this logic is like polymorphism
		Object[] args = theJoinPoint.getArgs();
		
		for(Object tempArg: args) {
			System.out.println("the arguments are: " + tempArg);
			
			if(tempArg instanceof Account) {
				Account theAccount = (Account) tempArg;
				System.out.println("the account name: " + theAccount.getName());
				System.out.println("the account level: " + theAccount.getLevel());
				
			}
		}
		
	}

}
