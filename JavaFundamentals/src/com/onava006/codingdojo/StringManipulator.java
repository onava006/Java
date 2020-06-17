package com.onava006.codingdojo;

public class StringManipulator {
	String trimAndConcat(String FirstString, String SecondString) {
		
		FirstString = FirstString.trim();
		SecondString = SecondString.trim();
		SecondString = " " + SecondString; 
		String processedString;
		
		processedString = FirstString.concat(SecondString);
		
		return processedString;
	
	}
	
	Integer getIndexOrNull(String request, char position){
		Integer a;
		a = request.indexOf(position);
		
		if (a == -1) {
			a = null;
		}
		
		return a;
	}
	
	
	Integer getIndexOrNull(String request, String position) {
		Integer a; 
		a = request.indexOf(position);
		if (a == -1) {
			a = null;
		}
		return a;
	
	}
	
	String concatSubstring(String firstString, int start, int end, String secondString) {
		
		String sub1;
		String sub2;		
		sub1 = firstString.substring(start, end);	
		sub2 = sub1.concat(secondString);
		
		return sub2;
		
	}
}
