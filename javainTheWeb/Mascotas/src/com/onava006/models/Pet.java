package com.onava006.models;

public class Pet {
	String name;
	String breed;
	Integer weight;
	


	public Pet(String name, String breed, Integer weight) {
		super();
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

}