package class_24;

import java.util.Arrays;

public class Character_Class {
	
	static int count_of_alphabet;
	static int count_of_numeric;
	static int count_of_space;

	public static void main(String[] args) {
		
		String S1 = "KV no 2 bangalore";
		
       	char [] c1 =	S1.toCharArray();
	
	    System.out.println(Arrays.toString(c1));
	    
	    for(int i =0; i<S1.length(); i++) {
	    	
	    	 boolean b =   Character.isAlphabetic(c1[i]);
	    	// System.out.println(b);
	    	 
	    	 if(b==true) {
	    		 
	    		 count_of_alphabet++;
	    	 }
	    	 
	    	 boolean b1 =   Character.isDigit(c1[i]);
		    	// System.out.println(b);
		    	 
		    	 if(b1==true) {
		    		 
		    		 count_of_numeric++;
		    	 }
		    	 boolean b2 =   Character.isWhitespace(c1[i]);
			    	// System.out.println(b);s
			    	 
			    	 if(b2==true) {
			    		 
			    		 count_of_space++;
			    	 }
	    	 
	    }
	    
	
	    System.out.println("The count of alphabet is " + count_of_alphabet );
	    System.out.println("The count of numeric is " + count_of_numeric );
	    System.out.println("The count of numeric is " + count_of_space );

	}

}
