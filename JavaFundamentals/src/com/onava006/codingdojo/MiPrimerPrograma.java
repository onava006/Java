package com.onava006.codingdojo;

public class MiPrimerPrograma {
	String name; 
	Integer age;
	String city;	
	
	public MiPrimerPrograma(String name, Integer age, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
	}




	void PrintMe() {
		System.out.println("Mi nombre es"+" "+name);
		System.out.println("Mi nombre es"+" "+age);
		System.out.println("Mi nombre es"+" "+city);
	}
}
