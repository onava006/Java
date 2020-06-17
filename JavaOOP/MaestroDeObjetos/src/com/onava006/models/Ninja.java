package com.onava006.models;

public class Ninja extends Human{
	
	Integer classintelligence = 0;
	Integer classstealth = 7;
	Integer classhealth = 0;
	
	public Ninja() {
		this.setHealth(this.getHealth() + classhealth);
		this.setIntelligence(this.getIntelligence() + classintelligence);
		this.setStealth(this.getStealth() + classstealth);
		this.setMaxHealth(this.getHealth());
	}
	
	public void steal(Human h) {
		System.out.println("");
	}
	
	public void runAway() {
		System.out.println("");
	}
}
