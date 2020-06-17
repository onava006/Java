package com.onava006.models;

public class Samurai extends Human{

	private Integer classintelligence = 0;
	private Integer classstealth = 0;
	private Integer classhealth = 100;
	private static Integer numberofSamus = 0;
	private Integer thisSamu = 0; 

	public Samurai() {
		this.setHealth(this.getHealth() + classhealth);
		this.setIntelligence(this.getIntelligence() + classintelligence);
		this.setStealth(this.getStealth() + classstealth);
		this.setMaxHealth(this.getHealth());
		numberofSamus++;
		thisSamu = numberofSamus;
	}

	public void deathBlow(Human h) {		
			Integer toloose = this.getHealth() / 2;		
			h.setHealth(0);
			System.out.println("el personaje morreu");
			this.setHealth(toloose);			
		}	

	public void meditate() {
		Integer halfOfHealth = this.getHealth() / 2;

		if(this.getHealth() + halfOfHealth >= this.getmaxHealth())
		{
			this.setHealth(this.getmaxHealth());
		} else {
			this.setHealth(this.getHealth() + halfOfHealth);			
		}		
		System.out.println(" el samurai meditó, su nueva salud es: " + this.getHealth());
	}
	
	public Integer howMany() {			
		return thisSamu;		
	}
}
