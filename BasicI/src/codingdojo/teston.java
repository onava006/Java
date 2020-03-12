package codingdojo;

import java.util.ArrayList;

public class teston {

	public static void main(String[] args) {
		
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
		
		DesafiosBasicos ejercicio = new DesafiosBasicos();
		
//		ejercicio.print255();
//		
//		ejercicio.printOdd255();
//		
//		ejercicio.printSum255();
//		
//		ejercicio.moveAcrossArray(dojo);
//		
//		System.out.println(ejercicio.maxNumber(dojo));		
//		System.out.println(ejercicio.maxNumber(dojo2));
//		
//		ejercicio.averageArray(dojo);		
//		ejercicio.averageArray(dojo2);
//
//		System.out.println(ejercicio.oddArray());
		
//		System.out.println(ejercicio.biggerThanY(dojo, number));
		
//		System.out.println(ejercicio.squeareArray(dojo));
		
//		System.out.println(ejercicio.removeNegatives(dojo));
		
//		ejercicio.maxMinProm(dojo);
		
//		ejercicio.moveElements(dojo);
				
		}
	
	}


