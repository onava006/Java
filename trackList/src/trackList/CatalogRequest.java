package trackList;

import java.util.*;

public class CatalogRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiscContent band = new DiscContent();
		
		String cancion1 = "ando de borrachera";
		String letra1 = "Ando de borrachera toda la noche entera No tengo quien me quiera Viva la borrachera Ando de borrachera toda la noche entera No tengo quien me quiera Viva la borrachera";
						
		band.addSong(cancion1, letra1);
		
		String cancion2 = "Aquel inmenso amor";
		String letra2 = "RICOOOOO! AQUEL INMENSO AMOR LOS CHARRRRRRRRRROS DE LA COMUNA DE LUMACO PRIMO Aquel inmenso amor aquellas caricias las has olvidado por culpa de tu amor y tu hipocrecia al banco ";
		
		band.addSong(cancion2, letra2);
		
		String cancion3 = "Nancy";
		String letra3 = "Nancy Nancy Nancy tu eres la dueña de mi corazon Nancy Nancy Nancy va repitiendo asi mi acordion / bis  Ejalee bailar a bailar a bailar a bailar ayayay !";
		
		band.addSong(cancion3, letra3);
		
		String cancion4 = "Guau dice mi perro";
		String letra4 = "una mañana temprano mi perro empezo a lairar anunciando la madrugada y que luego iba a aclarar.guuuau dice mi perro guau guau eta enojao .";
		
		band.addSong(cancion4, letra4);
		
		System.out.println("las canciones que tienes en tu disco son: ");
		System.out.println();
		
		Set<String>keys = band.Songs.keySet();
		
		for(String key: keys) {
			
			System.out.println(key);			
			System.out.println(band.Songs.get(key));
			System.out.println();
		}
		
		
	}

}
