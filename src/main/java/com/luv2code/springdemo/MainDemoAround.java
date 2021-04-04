package com.luv2code.springdemo;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.springdemo.service.TraficFourtuneService;


public class MainDemoAround {
	
	public static void main(String[] args) throws IOException, Exception {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		TraficFourtuneService traficFourtuneService = context.getBean("traficFourtuneService" , TraficFourtuneService.class);
		
		// call the getFourtune method
		System.out.println("\nMain Program: AroundDemoApp");
		System.out.println("Calling getFortune");
		String data = traficFourtuneService.getFourtune();
		System.out.println("\nMy Fourtune is: " + data);
		System.out.println("Finished...");
	    context.close();
	}

}
