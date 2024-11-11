package class_23;

import java.util.Arrays;

public class Array_Equals {

	public static void main(String[] args) {
		
		
		String [] name = new String [3];
		
		name[0] = "Adhi";
		name[1] = "Lakshmi";
		name[2] = "Bijjam";
		
        String [] name1 = new String [3];
		
		name1[0] = "Adhi";
		name1[1] = "Lakshmi";
		name1[2] = "Bijjam";
		
		
		
    boolean b = Arrays.equals(name, name1);
    
    System.out.println(b);
    
    if(b==true) {
    	
    	System.out.println("The given arrays are equals to each other");
    	
    }else {
    	
    	System.out.println("The given arrays are not equals to each other");
    }
				

	}

}
