package Classwork;

public class Eg_Stringbuffer {

	public static void main(String[] args) {
		
		StringBuffer a = new StringBuffer("HELLO ");
		
		// method name :append -string can be add at the end of the string
		a.append("WORLD ");
		System.out.println(a);
		
		//insert method: string can be add by providing the index 
		
		a.insert(6, "MY ");
		System.out.println(a);
		
		//replace method: should mention starting position , ending position and value .
		
		a.replace(9, 14, "FRIEND");
		System.out.println(a);
		
		//delete method: should mention starting and ending position 
		
		a.delete(6, 9);
		System.out.println(a);
		
		//reverse method
		a.reverse();
		System.out.println(a);	
	}
}
