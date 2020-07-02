package com.onava006.model;

import java.io.Serializable;
import java.util.Random;

public class NumberGenerator implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	int guessingNumber; 
	int numberOftries = 0;
	int minlimit;
	int maxlimit;
	int result = 2;
	int totalfinal;
	
	public NumberGenerator() {}

	public NumberGenerator(Integer num1, Integer num2) {
		generateNumber(num1, num2);		
		this.minlimit = num1;
		this.maxlimit = num2;
	}	

	public void checkGuessedNumber(Integer guessedNumber) {	
		
		if(guessedNumber.equals(this.guessingNumber)) {			
			setResult(0);
			resetCounter();		
			generateNumber (minlimit, maxlimit);

		} else if (guessedNumber > this.guessingNumber) {
			setCounter();
			setResult(1);			
			setNewRanges(this.minlimit, guessedNumber);
		} else if(guessedNumber < this.guessingNumber) {
			setCounter();
			setResult(-1);		
			setNewRanges(guessedNumber, this.maxlimit);
		}			
	}

	public String getCounter() {		
		return String.valueOf(this.totalfinal);
	}			
	private void setCounter() {
		this.numberOftries++;
		this.totalfinal = numberOftries;
	}
	private void resetCounter() {
		this.numberOftries = 0;				
		this.maxlimit = 100;
		this.minlimit = 0;
	}	
	private void generateNumber (Integer range1, Integer range2) {
		Random rd = new Random();		
		this.guessingNumber = rd.nextInt(range2) + range1;
	}		
	private void setNewRanges(Integer newRange1, Integer newRange2) {	
		this.minlimit = newRange1;
		this.maxlimit = newRange2;
	}
	private void setResult(int parameter) {
		this.result = parameter;
	}
	public int getResult() {
		return this.result;		
	}
	public int getmin() {
		return this.minlimit;
	}
	public int getmax() {
		return this.maxlimit;
	}	
	public int getguessing() {
		return guessingNumber;
	}	
}
