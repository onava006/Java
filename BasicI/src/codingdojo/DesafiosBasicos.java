package codingdojo;

import java.util.ArrayList;

public class DesafiosBasicos {
	
		
	public void print255() {
		for(int i = 0; i < 256; i++) {			
			System.out.println(i);
		}
	}
	
	public void printOdd255() {
		for(int i = 0; i< 256; i++) {
			if(i%2 == 1) {
				System.out.println(i);
			}
		}
	}
	
	public void printSum255() {
		int j = 0;
		for(int i = 0; i < 256; i++) {
			j += i;
			System.out.printf("Nuevo numero: %d Suma: %d%n", i,j);
		}
	}
	
	public void moveAcrossArray(ArrayList<Integer> example) {
		for(Integer element : example) {
			System.out.println(element);
		}
	}
	
	public int maxNumber(ArrayList<Integer> example) {
		int max = example.get(0);
//		int temp = 0;
		System.out.println("El arreglo es " + example);
		for(Integer loop : example) {
			if(loop > max) {
				max = loop;
			}
		}	
		return max;
	}
	
	public void averageArray(ArrayList<Integer> example) {
		int elements = 0;
		float average = 0;
		
		System.out.println("El arreglo es " + example);
		
		for(Integer calc : example) {
			elements++;
			average += calc;
		}		
		average /= elements;		
		System.out.printf("Promedio de %f%n",average);
	}
	
	public ArrayList<Integer> oddArray(){
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		for(int i = 0; i < 256; i++) {
			if(i % 2 == 1) {
				array.add(i);	
			}			
		}		
		return array;
	}
	
	public int biggerThanY(ArrayList<Integer> array, int Y) {
		int count = 0;
		
		System.out.println("El arreglo es " + array);
		System.out.println("El numero Y es " + Y);
		System.out.println("------------------");
		System.out.print("El numero de elementos mayor a Y es: ");
		for(Integer element : array) {
			if (element > Y) {
				count++;
			}
		}		
		return count;
	}
	
	public ArrayList<Integer> squeareArray(ArrayList<Integer> array){
		ArrayList<Integer> squareValues = new ArrayList<Integer>();
		System.out.println("El arreglo es: " + array);
		for(Integer values : array) {
			squareValues.add(values*values);			
		}
		System.out.printf("El arreglo al cuadrado es: ");
		return squareValues;
	}
	
	public ArrayList<Integer> removeNegatives (ArrayList<Integer> array){
		System.out.println("El arreglo es: " + array);
		for(int i = 0; i < array.size(); i++) {
			if(array.get(i) < 0) {
				array.set(i, 0);
			}
			
		}
		System.out.printf("El arreglo sin negativos es: ");
		return array;
	}
	
	public void maxMinProm(ArrayList<Integer> array) {
		int max = array.get(0);
		int min = array.get(0);
		float avg = 0; 
		int counter = array.size();
		
		System.out.println("El arreglo es: " + array);
		
		for(Integer elemento : array) {
			if(elemento > max) {
				max = elemento;
			}
			if(elemento < min) {
				min = elemento;
			}
			avg += elemento;				
		}		
		avg /= counter;		
		System.out.printf("El Máximo es %d, el mínimo es %d y el promedio es %f", max, min, avg);
				
	}
	
	public void moveElements(ArrayList<Integer> array) {
		ArrayList<Integer> temp = array; 
		System.out.println("El arreglo es: " + array);
		
		for(int i = 0; i < array.size()-1; i++) {
			array.set(i, temp.get(i+1));
		}
		array.set(array.size()-1, 0);
		System.out.println("El arreglo es: "+ array);
		
	}
		
	

}
