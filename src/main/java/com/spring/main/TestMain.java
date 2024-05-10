package com.spring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.AppConfig;
import com.spring.controller.PizzaController;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		PizzaController pizzaController = context.getBean(PizzaController.class);
		
		System.out.println(pizzaController.getPizza());

	}

}
