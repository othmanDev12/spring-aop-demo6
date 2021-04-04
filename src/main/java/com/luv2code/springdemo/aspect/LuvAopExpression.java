package com.luv2code.springdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LuvAopExpression {
	
	// this is where we add all of our related advices for logging
	
		// declare a PointCut declaration to reuse in other advice aspect
		@Pointcut("execution(* com.luv2code.springdemo.dao.*.*(..))")
		public void forDaoPackage() {};
		
		// create getter pointcut declaration.
		@Pointcut("execution(* com.luv2code.springdemo.dao.*.get*(..))")
		public void getter() {};
		
		// create setter pointcut declaration
		@Pointcut("execution(* com.luv2code.springdemo.dao.*.set*(..))")
		public void setter() {};
		
		// combine those pointcut declaration ===> it just include all method and exclude
		// that start with get and set.
		@Pointcut("forDaoPackage() && !(getter() || setter())")
		public void forDaoPackegeNotGetterAndSetter() {};
		

}
