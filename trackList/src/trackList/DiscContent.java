package trackList;

import java.util.HashMap;

public class DiscContent {
	
	HashMap<String,String> Songs = new HashMap <String,String>();
	
	public void addSong (String title, String lyrics) {
		Songs.put(title, lyrics);
	}
	
}
