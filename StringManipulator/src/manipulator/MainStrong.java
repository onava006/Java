package manipulator;

public class MainStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringManipulator codingdojo = new StringManipulator();
		
		System.out.println(codingdojo.trimAndConcat("    Hola     ","     Mundo    "));
				
		StringManipulator manipulator = new StringManipulator();
		char letter = 'n';
		Integer a = manipulator.getIndexOrNull("Coding", letter);
		Integer b = manipulator.getIndexOrNull("Hola Mundo", letter);
		Integer c = manipulator.getIndexOrNull("Saludar", letter);
		System.out.println(a); // 4
		System.out.println(b); // 7
		System.out.println(c); // null
		
		
		StringManipulator manipulator2 = new StringManipulator();
		String word = "Hola";
		String subString = "la";
		String notSubString = "mundo";
		Integer ab = manipulator2.getIndexOrNull(word, subString);
		Integer bb = manipulator2.getIndexOrNull(word, notSubString);
		System.out.println(ab); // 2
		System.out.println(bb); // nullx
		
		StringManipulator manipulator3 = new StringManipulator();
		String word2 = manipulator3.concatSubstring("Hola", 1, 2, "mundo");
		System.out.println(word2); 
	}

}


