package com.onava006.codingdojo;

public class TeoremaDePitagoras {
	
	public double calculateHypotenuse(int legA, int legB) {		
	
	 double hypotenuse; 
     
     hypotenuse = Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));
     
     //a2 + b2 = c2
		return hypotenuse;  

}
}
