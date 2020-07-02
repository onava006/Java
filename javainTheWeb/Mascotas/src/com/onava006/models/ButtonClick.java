package com.onava006.models;

public class ButtonClick {
	Integer count;  
	String random; 

	public ButtonClick(Integer count, String randon) {
		this.count = count;
		this.random = randon;
	}


public void setCount() {
	count++;
	
}

public int getCount() {
	return count;
	
	
}

}
