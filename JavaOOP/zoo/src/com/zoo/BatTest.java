package com.zoo;

public class BatTest {

	public static void main(String[] args) {
		Bat batman = new Bat(300);
		
		batman.attackTown();
		
		System.out.println("la energía del batman es " + batman.displayEnergy());
		
		batman.eatHumans();
		batman.eatHumans();
		
		batman.fly();
		batman.fly();
		System.out.println(batman.energyLevel);
		System.out.println("la energía del batman es " + batman.displayEnergy());

	}

}
