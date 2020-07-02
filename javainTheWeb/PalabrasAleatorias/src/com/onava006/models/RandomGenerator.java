package com.onava006.models;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class RandomGenerator implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String word;
	Integer counter; 
	Integer length;
	
	public RandomGenerator() {}
	
	public RandomGenerator(Integer previousSession) {
		this.counter = previousSession;		
	}
	public RandomGenerator(Integer previousSession, Integer Length) {
		this.counter = previousSession;	
		this.length = Length;
	}	
	public void ResetLength(Integer newLength) {
		this.length = newLength;		
	}
	private String generateRandomWord(Integer length) {
		String newword;
		Random stringRandomizer = new Random();		
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i< length; i++) {
			char[] upperDown = new char[2];
			upperDown[0] = (char)(stringRandomizer.nextInt(25) + 65);			
			upperDown[1] = (char)(stringRandomizer.nextInt(25) + 97);			
			sb.append(upperDown[stringRandomizer.nextInt(2)]);
		}		
		newword = sb.toString();		
		return newword;
	}
	
	public String getTimeNow() {		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		Date date = new Date(System.currentTimeMillis());	
		String hora = formatter.format(date);
		return hora;	
	}
	
	public String getWord() {		
		word = generateRandomWord(this.length);
		setCounter();
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public Integer getCounter() {
		return counter;
	}	
	private void setCounter() {
		this.counter++;
	}

}
