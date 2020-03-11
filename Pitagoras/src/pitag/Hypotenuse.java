package pitag;

public class Hypotenuse {
	
	int legA;
	int legB;
	
	public Hypotenuse(int A, int B){
		legA = A;
		legB = B;		
	}
	
	public double calculateHypotenuse() {
        double hypotenuse; 
        
        hypotenuse = Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));
        
        //a2 + b2 = c2
		return hypotenuse;  
    }
}
