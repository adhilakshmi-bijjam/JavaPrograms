package class_23;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Runtime {

	public static void main(String[] args) {
		 int[] no1 = new int[3];
		 
		 Scanner S1 = new Scanner (System.in); // Array at run time
		 
		 for(int i =0 ; i<=2;i++) {
			 no1[i] = S1.nextInt(); 
			 
		 }
		 
	/*no1[0] = S1.nextInt();
	no1[1] = S1.nextInt();
	no1[2] = S1.nextInt();*/
	
	System.out.println(Arrays.toString(no1));
	
		 

		
		
		
	}

}
