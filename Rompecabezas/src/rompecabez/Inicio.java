package rompecabez;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inicio {

	public static void main(String[] args) {
		Integer[] arrayon = {3,5,1,2,7,9,8,13,25,32};
		String[] names =  {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
		String[] vocals = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		
		
		List<Integer> numberArray = new ArrayList<Integer>();
		Collections.addAll(numberArray, arrayon);
		
		List<String> stringArray = new ArrayList<String>();
		Collections.addAll(stringArray, names);
		
		List<String> vocalsArray = new ArrayList<String>();
		Collections.addAll(vocalsArray, vocals);
		
				
		PuzzleJava puzzle = new PuzzleJava();
		
////		Actividad 1 //
//		puzzle.sumBiggerThan(numberArray);
//		
////		Actividad 2 //
//		System.out.println("Los nombres mas largos que 10 son: " + puzzle.namesMess(stringArray));
//		
////		Actividad 3 //
//	
//		puzzle.vocalsMess(vocalsArray);
//		
////		Actividad 4 //
//		
//		System.out.println(puzzle.randomSerial());
//		
////		Actividad 5 //		
//		System.out.println(puzzle.sortedSerial());
		
// 		Actividad 6 // 
//		System.out.println(puzzle.randomChain(vocalsArray));
		
//		Actividad 7 //
		
		puzzle.tenChains(vocalsArray);
	}

}
