package class_25;

public class Equals_Ignorecase {

	public static void main(String[] args) {
		
		String name = "Lakshmi";
		
	boolean b =	name.equalsIgnoreCase("lakshmi");
		
		System.out.println(b);
		
		//replace A to a
		
		String n = "Adhi no 2";
		
     	String s =	n.replace('A', 'a');
		System.out.println(s);
		
		//replace boy with girl
		
		String name1 = "I have a boy";
		
	String s1 = 	name1.replace("boy", "girl");
		
	System.out.println(s1);
	
	//replace 2 with ntg
	
	String S = "KV no 2";
	String S1 = S.replace("2", "");
	
	System.out.println(S1);
	
	//replace small alphabets with ntg
	
	String str = "KV no 2";
	
	String S2 = str.replaceAll("[a-z]", "");
	System.out.println(S2);
	
	//replace all the capital letters with ntg
	
	String name2 = "Adhi Lakshmi";
	
	String S3 = name2.replaceAll("[A-Z]", "");
	
	System.out.println(S3 );
	
	//replace all the neumeric letters with ntg
	
	String number = "rams bank balance is 87378 NR";
	String s4 = number.replaceAll("[0-9]", "");
	
	System.out.println(s4);
	
		
	}

}
