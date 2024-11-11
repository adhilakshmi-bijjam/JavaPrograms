package class_23;

import java.util.Arrays;

public class Reverse_Array {

	public static void main(String[] args) {
	
		String name[] = {"Adhi","lakshmi","bijjam"};
		
		/*name[0] = "Adhi";
		name[1] = "Lakshmi";
		name[2] = "Bijjam";*/
		
		
		String [] name1 = new String[3];
		
		for(int i=0, k=2; i<name.length; i++, k--) {
			
			name1[k] =  name[i];	
		}
		
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(name1));
		

	}

}
