package tryCatch;

import java.util.ArrayList;

public class CatchExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Object> myList = new ArrayList<Object>();
		myList.add("13");
		myList.add("Hola Mundo");
		myList.add(48);
		myList.add("Adios Mundo");
		
		ArrayList<Integer> integerList = new ArrayList<Integer>();
//		for(int i = 0; i < myList.size(); i++) {
//		    Integer castedValue = (Integer) myList.get(i);
//		}
		int indice = 0;
		boolean test = true;
		
		while(test){
					
			try {
				for(int i = indice; i < myList.size(); i++) {
					indice = i;
				    Integer castedValue = (Integer) myList.get(i);
				    integerList.add(castedValue);
				}
			}
			
			catch(ClassCastException e){
				System.out.println("No se pudo hacer el casting, ClassCastException");
				System.out.println("El indice que no funciona es el " + indice);
				System.out.println("El valor que no funciona es " + myList.get(indice));
				
				String exception = myList.get(indice).toString();
				Integer castedValue = exception.length();
				integerList.add(castedValue);
				System.out.println(integerList);
				indice ++;
			}
			
			catch(NumberFormatException er) {
				System.out.println("No se pudo hacer el casting, NumberFormatException");
				System.out.println("El indice que no funciona es el " + indice);
				System.out.println("El valor que no funciona es " + myList.get(indice));
				
				Integer castedValue = (Integer)myList.get(indice).toString().length();
				integerList.add(castedValue);
				System.out.println(integerList);
				indice ++;
			}
			if(indice == myList.size()-1) {
				test = false;
			}
			
		}
	}

}
