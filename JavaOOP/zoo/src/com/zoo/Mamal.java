package com.zoo;



public class Mamal {
	
	Integer energyLevel; 
	
	public Mamal() {
		energyLevel = 100;
	}
	
	public Mamal(Integer energyLevel){
		this.energyLevel = energyLevel;
		
	}
	
	public Integer displayEnergy() {
		return energyLevel;
	}
	protected void checkEnergy(Integer energy) {
		if(energyLevel > 0) {
			energyLevel += energy;
		}
	}
	
}
