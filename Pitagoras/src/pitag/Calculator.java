package pitag;

public class Calculator {

	public static void main(String[] args) {
		
		int sideA = 4;
		int sideB = 6;
		System.out.println(sideA);
		System.out.println(sideB);
		
		Hypotenuse hypo = new Hypotenuse(sideA,sideB);
		
		System.out.println(hypo.calculateHypotenuse()); 
	}

	

}
