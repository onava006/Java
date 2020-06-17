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

		Integer tosteal = this.getStealth();

		if(tosteal + this.getHealth() >= this.getmaxHealth())
		{
			this.setHealth(this.getmaxHealth());
			h.setHealth(this.getHealth() - tosteal);
		} else {
			this.setHealth(tosteal + this.getHealth());	
			h.setHealth(this.getHealth() - tosteal);
		}		
		System.out.println(" el ninja  robó salud, su nueva salud es: " + this.getHealth());
	}
	
	public void runAway() {
		Integer escape = 10;
		
		if(this.getHealth() - escape > 0)
		{
			this.setHealth(this.getHealth() - escape);
			System.out.println(" el ninja escapó, se le restaron 10 puntos de vida");
		} else {
			System.out.println(" el ninja es tan gil que intentando escapar se murió");
		}	
	}
}
