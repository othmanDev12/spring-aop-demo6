package com.luv2code.springdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class AdviceAPI {
	
	@Before("com.luv2code.springdemo.aspect.LuvAopExpression.forDaoPackegeNotGetterAndSetter()")
	public void beforeAdviceApi() {
		System.out.println("======>>> Execution API Analitycs");
	}

}
