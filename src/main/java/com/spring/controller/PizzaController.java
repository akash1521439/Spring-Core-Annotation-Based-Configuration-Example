package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.service.VegPizza;

@Component
public class PizzaController {
	
	//Inject dependency Using field
	@Autowired
	private VegPizza vegPizza;
	
	//Inject dependency Using contructor 
	/*
	@Autowired
	public PizzaController(VegPizza vegPizza) {
		this.vegPizza = vegPizza;
	}
	*/
	
	//Inject dependency using setter method
	/*
	@Autowired
	public void setVegPizza(VegPizza vegPizza) {
		this.vegPizza = vegPizza;
	}
	*/
	
	public String getPizza(){
		return vegPizza.getPizza();
	}

}
