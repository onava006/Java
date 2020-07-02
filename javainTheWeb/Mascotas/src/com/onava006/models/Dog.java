package com.onava006.models;

public class Dog extends Pet implements Ipet{

	public Dog(String name, String breed, Integer weight) {
		super(name, breed, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String showAffection() {
		String action = "";
		if(weight < 0) {
			action = "dale más comida a tu perro que ni existe";
		} else if(weight < 30) {
			action = "Saltó sobre ti y te hizo nanai!";			
		} else if (weight >= 30) {
			action = "Saltó encima tuyo y te rompió la espalda, pero es tu guau guau así que no hay problema";
		}
		return action;	
	}

}
