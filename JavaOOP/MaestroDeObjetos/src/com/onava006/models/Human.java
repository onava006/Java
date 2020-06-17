package com.onava006.models;

public class Human {
	private Integer strength = 3;
	private Integer intelligence = 3;
	private Integer stealth = 3;
	private Integer health = 100;
	private Integer maxhealth = health;

	public Integer getHealth() {
		return health;
	}

	protected void setHealth(Integer health) {
		this.health = health;
	}
	
	protected void setMaxHealth(Integer health) {
		this.maxhealth = this.health;
	}
	
	protected void setIntelligence(Integer intelligence) {		
		this.intelligence = intelligence;
	}
	
	protected void setStealth(Integer stealth) {
		this.stealth = stealth;
	}
	
	protected Integer getmaxHealth() {
		return maxhealth;
	}

	public Integer getStrength() {
		return strength;
	}

	public Integer getIntelligence() {
		return intelligence;
	}

	public Integer getStealth() {
		return stealth;
	}

	public void attack(Human h) {

		Integer attackdone = this.strength;
		Integer healthtarget = h.getHealth();	

		if(healthtarget - attackdone > 0) {
			
			System.out.println("el objetivo recibió " + attackdone + " de daño");
			h.setHealth(healthtarget - attackdone);		

		} else if (healthtarget - attackdone < 0) {

			System.out.print("el personaje murió");
		}		

	}

	
	public void getStats() 
	{
		System.out.println("LOS STATS SON");		
		System.out.println("health: " + this.getHealth() );
		System.out.println("strength: " + this.getStrength());
		System.out.println("intelligence: " + this.getIntelligence());
		System.out.println("stealth: " + this.getStealth());	
		System.out.println();
	}
}
