package com.zoo;

public class Gorilla extends Mamal {

	public void throwSomething() {
		System.out.println("El Gorila ha lanzado algo");
		checkEnergy(-5);
	}
	public void eatBananas() {
		System.out.println("El Gorila es muy feliz comiendo un plátano");
		checkEnergy(10);
	}
	public void climb() {
		System.out.println("El Gorila se ha subido a la cima de un árbol");
		checkEnergy(-10);		
	}	
}
