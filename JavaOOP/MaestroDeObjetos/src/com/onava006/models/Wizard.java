package com.onava006.models;

public class Wizard extends Human{
	
	Integer classintelligence = 5;
	Integer classstealth = 0;
	Integer classhealth = -50;	
	
	public Wizard() {
		
		this.setHealth(this.getHealth() + classhealth);
		this.setIntelligence(this.getIntelligence() + classintelligence);
		this.setStealth(this.getStealth() + classstealth);
		this.setMaxHealth(this.getHealth());
	}	
	
	public void heal(Human h) {		
		Integer toheal = this.getIntelligence() +  h.getHealth();		
		if(toheal >= h.getmaxHealth())
		{
			h.setHealth(this.getmaxHealth());
		} else {
			h.setHealth(toheal);			
		}
		System.out.println("el personaje fue heleado "+ this.getIntelligence() + " puntos de salud");
	}
	
	public void fireBall(Human h) {
		Integer tofire = this.getIntelligence() * 3;
		
		if (h.getHealth() - tofire > 0) {
			h.setHealth(h.getHealth() - tofire);
			System.out.println("el objetivo recibió " + tofire + " de daño");
		} else {
			h.setHealth(0);
			System.out.println("el personaje morreu");
		}		
	}	
}
