package com.zoo;

public class Bat extends Mamal {
	
	
	public Bat(Integer energyLevel) {
		super(energyLevel);

	}
	
	public void  fly() {
		System.out.println("chuck chuck chuk chuk ");
		checkEnergy(-50);
	}
	public void  eatHumans() {
		System.out.println("bueno, no importa"); 
		checkEnergy(25);
	}
	public void  attackTown() {
		System.out.println("coronavirussss!!!");
		checkEnergy(-100);
		
	}
}
