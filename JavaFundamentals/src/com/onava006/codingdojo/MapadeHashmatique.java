package com.onava006.codingdojo;
import java.util.HashMap;

public class MapadeHashmatique {
	HashMap<String,String> Songs = new HashMap <String,String>();
	
	public void addSong (String title, String lyrics) {
		Songs.put(title, lyrics);
	}
}
