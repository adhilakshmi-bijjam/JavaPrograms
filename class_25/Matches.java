package class_25;

public class Matches {

	public static void main(String[] args) {
		
		
	//Check if the given string has exact 3 letters in it.
		
		String name = "Adhi";
		
	boolean b =	name.matches("....");
	
	System.out.println(b);
	
	//In the given string "Adhi" check if the string starts with A
	
	String name1 = "Lakshmi";
	
	boolean b1 =     name1.matches("L(.*)");
	
	System.out.println(b1);
	     
	//In the given string "Adhi" check if the string ends with i
	
String name2 = "Lakshmi";
	
	boolean b2 =     name1.matches("(.*)i");
	
	System.out.println(b2);
	
	
	//Check if the m is present or not in the given string
	
	String name3 = "Lakshmi";
	
	boolean b3 = name3.matches("(.*)m(.*)");
	
	System.out.println(b3);
	
	//replace all the spaces with _ input = "manish kumar tiwari"
	
	String name4 = "manish kumar tiwari";
	
	String b4 = name4.replaceAll(" ", "_");
	
	System.out.println(b4);
	
	//input is your name  output is
	
	String name5 = "Lakshmi";
	
	for(int i=0; i<name5.length(); i++) {
		
		System.out.println(name5.charAt(i));
		
	}
		
		
		String name6 = "Lakshmi";
		
		for(int j=name6.length()-1; j>=0; j--) {
			
			System.out.println(name6.charAt(j));
		}	
		
		//find out current time, past time , future time using java
		
		
		
		
	}
	
	
}
	


