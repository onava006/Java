package com.zoo;

public class Zoo {

	public static void main(String[] args) {
		Gorilla donkeykong = new Gorilla();
		
		donkeykong.throwSomething();
		donkeykong.throwSomething();
		donkeykong.throwSomething();
		System.out.println("la energía del mono es " + donkeykong.displayEnergy());
		donkeykong.eatBananas();
		donkeykong.eatBananas();
		donkeykong.climb();
		
		System.out.println("la energía del mono es " + donkeykong.displayEnergy());
		
	}

}
