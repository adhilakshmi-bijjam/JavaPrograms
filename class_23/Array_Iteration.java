package class_23;

import java.util.Arrays;

public class Array_Iteration {

	public static void main(String[] args) {
		
		int [] array = new int[4];
		
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		
		int [] array1 = new int[4];
		
		for(int i=0; i<array.length; i++) {
			array1[i] = array[i];
			
		}
		
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array1));
		
		
		
		
		
		
	}

}
