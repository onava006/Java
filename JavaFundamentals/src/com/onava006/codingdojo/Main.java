package com.onava006.codingdojo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
//MI PRIMER PROGRAMA
		MiPrimerPrograma oscar = new MiPrimerPrograma("Oscar",30,"Temuco city");		
		oscar.PrintMe();
		
//TEOREMA DE PITAGORAS
		TeoremaDePitagoras pita = new TeoremaDePitagoras();
		System.out.print("La hipotenusa de 3 y 5 es "+pita.calculateHypotenuse(3, 5));
		
//FIZZ BUZZ
		FizzBuzz fiz = new FizzBuzz();
		System.out.println(fiz.fizzBuzz(3));
		System.out.println(fiz.fizzBuzz(5));
		System.out.println(fiz.fizzBuzz(15));
		System.out.println(fiz.fizzBuzz(2));
		
//MANIPULACION DE CADENAS
		StringManipulator codingdojo = new StringManipulator();
		
		System.out.println(codingdojo.trimAndConcat("    Hola     ","     Mundo    "));
				
		StringManipulator manipulator = new StringManipulator();
		char letter = 'n';
		Integer a = manipulator.getIndexOrNull("Coding", letter);
		Integer b = manipulator.getIndexOrNull("Hola Mundo", letter);
		Integer c = manipulator.getIndexOrNull("Saludar", letter);
		System.out.println(a); // 4
		System.out.println(b); // 7
		System.out.println(c); // null		
		
		StringManipulator manipulator2 = new StringManipulator();
		String word = "Hola";
		String subString = "la";
		String notSubString = "mundo";
		Integer ab = manipulator2.getIndexOrNull(word, subString);
		Integer bb = manipulator2.getIndexOrNull(word, notSubString);
		System.out.println(ab);
		System.out.println(bb); 
		
		StringManipulator manipulator3 = new StringManipulator();
		String word2 = manipulator3.concatSubstring("Hola", 1, 2, "mundo");
		System.out.println(word2); 
	
//EJERCICIOS BASICOS
		
		int number = 4;		
		ArrayList<Integer> dojo = new ArrayList<Integer>();
		
		for(int i = 0; i < 26; i++) {
			dojo.add((int)(Math.random()* i));
			if(i%2 == 1) {
				dojo.set(i, dojo.get(i)*-1);
			}
		}
		
		ArrayList<Integer> dojo2 = new ArrayList<Integer>();
		dojo2.add(-3);
		dojo2.add(-5);
		dojo2.add(-7);
		
		EjerciciosBasicos ejercicio = new EjerciciosBasicos();
		
		ejercicio.print255();
		ejercicio.printOdd255();
		ejercicio.printSum255();
		ejercicio.moveAcrossArray(dojo);
		System.out.println(ejercicio.maxNumber(dojo));		
		System.out.println(ejercicio.maxNumber(dojo2));
		ejercicio.averageArray(dojo);		
		ejercicio.averageArray(dojo2);
		System.out.println(ejercicio.oddArray());		
		System.out.println(ejercicio.biggerThanY(dojo, number));
		System.out.println(ejercicio.squeareArray(dojo));		
		System.out.println(ejercicio.removeNegatives(dojo));		
		ejercicio.maxMinProm(dojo);		
		ejercicio.moveElements(dojo);
		
//ROMPECABEZAS
		
		Integer[] arrayon = {3,5,1,2,7,9,8,13,25,32};
		String[] names =  {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
		String[] vocals = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
				
		List<Integer> numberArray = new ArrayList<Integer>();
		Collections.addAll(numberArray, arrayon);
		
		List<String> stringArray = new ArrayList<String>();
		Collections.addAll(stringArray, names);
		
		List<String> vocalsArray = new ArrayList<String>();
		Collections.addAll(vocalsArray, vocals);		
				
		Rompecabezas puzzle = new Rompecabezas();		
			//Actividad 1
		puzzle.sumBiggerThan(numberArray);			
			//Actividad 2 //
		System.out.println("Los nombres mas largos que 10 son: " + puzzle.namesMess(stringArray));			
			//Actividad 3 //
		puzzle.vocalsMess(vocalsArray);				
			//Actividad 4 //
		System.out.println(puzzle.randomSerial());				
			//Actividad 5 //		
		System.out.println(puzzle.sortedSerial());				
			//Actividad 6 // 
		System.out.println(puzzle.randomChain(vocalsArray));				
			//Actividad 7 //		
		puzzle.tenChains(vocalsArray);
		
		
//MAPA DE HASHMATIQUE
		
		MapadeHashmatique band = new MapadeHashmatique();
		
		String cancion1 = "ando de borrachera";
		String letra1 = "Ando de borrachera toda la noche entera No tengo quien me quiera Viva la borrachera Ando de borrachera toda la noche entera No tengo quien me quiera Viva la borrachera";						
		band.addSong(cancion1, letra1);
		
		String cancion2 = "Aquel inmenso amor";
		String letra2 = "RICOOOOO! AQUEL INMENSO AMOR LOS CHARRRRRRRRRROS DE LA COMUNA DE LUMACO PRIMO Aquel inmenso amor aquellas caricias las has olvidado por culpa de tu amor y tu hipocrecia al banco ";		
		band.addSong(cancion2, letra2);
		
		String cancion3 = "Nancy";
		String letra3 = "Nancy Nancy Nancy tu eres la dueña de mi corazon Nancy Nancy Nancy va repitiendo asi mi acordion / bis  Ejalee bailar a bailar a bailar a bailar ayayay !";		
		band.addSong(cancion3, letra3);
		
		String cancion4 = "Guau dice mi perro";
		String letra4 = "una mañana temprano mi perro empezo a lairar anunciando la madrugada y que luego iba a aclarar.guuuau dice mi perro guau guau eta enojao .";		
		band.addSong(cancion4, letra4);
		
		System.out.println("las canciones que tienes en tu disco son: ");
		System.out.println();
		
		Set<String>keys = band.Songs.keySet();
		
		for(String key: keys) {
			
			System.out.println(key);			
			System.out.println(band.Songs.get(key));
			System.out.println();
		}		
		System.out.println(band.Songs.get("Guau dice mi perro"));
		

	
//EXCEPCIONES
	
	ArrayList<Object> myList = new ArrayList<Object>();
	
	
	
	myList.add("13");
	myList.add("Hola Mundo");
	myList.add(48);
	myList.add("Adios Mundo");
	
	ArrayList<Integer> integerList = new ArrayList<Integer>();
	for(int i = 0; i < myList.size(); i++) {
	    Integer castedValue = (Integer) myList.get(i);
	}
	
	int indice = 0;
	boolean test = true;
	
	while(test){
				
		try {
			for(int i = indice; i < myList.size(); i++) {
				indice = i;
			    Integer castedValue = (Integer) myList.get(i);
			    integerList.add(castedValue);
			}
		}
		
		catch(ClassCastException e){
			System.out.println("No se pudo hacer el casting, ClassCastException");
			System.out.println("El indice que no funciona es el " + indice);
			System.out.println("El valor que no funciona es " + myList.get(indice));
			indice++;				
		}
		
		
		if(indice == myList.size()-1) {
			test = false;
		}
		
	}
	}
}

