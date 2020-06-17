package com.onava006.codingdojo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Rompecabezas {
	
	public void sumBiggerThan(List<Integer> array)
	{
		int sum = 0;
		ArrayList<Integer> sub = new ArrayList<Integer>();
		
		for(Integer suma : array) {
			sum += suma;
			if(suma > 10) {
				sub.add(suma);
			}
		}
		System.out.println(sum);
		System.out.println("El sub arreglo es " + sub);			
		
	}
	
	public ArrayList<String> namesMess(List<String> array){
		System.out.println("El arreglo original es: " + array);
		ArrayList<String> newArray = new ArrayList<String>();
		
		Collections.shuffle(array);		
		System.out.println("El arreglo mezclado es: " + array);
		
		for(String name : array) {
			if (name.length() > 10) {
				newArray.add(name);
			}
		}
		
		return newArray;
	}
	
	public void vocalsMess (List<String> array) {
		List<String> vocals = new ArrayList<String>();
		vocals.add("a");
		vocals.add("e");
		vocals.add("i");
		vocals.add("o");
		vocals.add("u");
		
		System.out.println("El arreglo original es: " + array);
		Collections.shuffle(array);
		System.out.println("El arreglo mezclado es: " + array);
		System.out.println("La última vocal es: " + array.get(array.size()-1));
		
		if(vocals.contains(array.get(0))) {
			System.out.println("Un mensaje");
		}
		
	}

	public ArrayList<Integer> randomSerial(){
		ArrayList<Integer> randomnumbers = new ArrayList<Integer>();
		Random aleatorio = new Random();
		
		for(int i = 0; i < 11; i++) {
			randomnumbers.add(aleatorio.nextInt(46)+55);
		}	
		return randomnumbers;
	}
	
	public ArrayList<Integer> sortedSerial(){
		ArrayList<Integer> randomnumbers = new ArrayList<Integer>();
		Random aleatorio = new Random();
		
		for(int i = 0; i < 11; i++) {
			randomnumbers.add(aleatorio.nextInt(46)+55);
		}
		Collections.sort(randomnumbers);
		
		return randomnumbers;
	}
	
	public ArrayList<String> randomChain (List<String> array){
		ArrayList<String> fiveCharacters = new ArrayList<String>();
		Random aleatorio = new Random();
		
		for(int i = 0; i < 6; i++) {
			
			fiveCharacters.add(array.get(aleatorio.nextInt(array.size())));
		}
		
		return fiveCharacters;
	}

	public void tenChains (List<String> array) {		
		
		ArrayList<Object> tenArrays = new ArrayList<Object>();
		
		for(int i = 0; i < 10; i++) {
			tenArrays.add(this.randomChain(array));
		}
		System.out.println(tenArrays);
	}
}
