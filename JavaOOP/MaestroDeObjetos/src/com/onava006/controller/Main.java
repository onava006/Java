package com.onava006.controller;

import com.onava006.models.*;


public class Main {

	public static void main(String[] args) {
//PARTE 1
		Human brayan = new Human();
		Human bairon = new Human();	
		
		brayan.attack(bairon);
		
//PARTE 2		
		Wizard jonny = new Wizard();		
		Ninja pepe = new Ninja();
		Samurai jack = new Samurai();
		Samurai brigido = new Samurai();
		
		jonny.fireBall(brayan);		
		pepe.steal(bairon);
		jack.deathBlow(brayan);
		jonny.fireBall(brigido);
		System.out.println("la salud del ninja brigido es " + brigido.getHealth());
		
		brigido.meditate();
		
		
		System.out.println("soy el samurai numero: " +  jack.howMany());
		System.out.println("eu sou o samurai numero: " + brigido.howMany());		
		pepe.runAway();
		jonny.heal(brayan);
		
		//System.out.println("los stats del jonny son");
		//jonny.getStats();
		//System.out.println("los stats del ninja pepe son");
		//pepe.getStats();		
		//System.out.println("los stats del brayan son");		
		//brayan.getStats(); 
		//System.out.println("los stats del bairon son");	
		//bairon.getStats();
		//System.out.println("los stats del samurai jack son");	
		//jack.getStats();
		//System.out.println("los stats del samurai brigido son");	
		//brigido.getStats();
		
		
	}
	

}
