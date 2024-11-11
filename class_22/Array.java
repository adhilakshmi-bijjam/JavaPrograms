package class_22;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		int [] empid = new int[4];
		
		empid[0] = 121;
		empid[1]= 122;
		empid[2] = 123;
		empid[3]= 124;
		
		System.out.println(Arrays.toString(empid));
		
	
		String [] name  = new String[4];
		//String [] name  = new String[-4]; // Negative array
		
		name[0] = "Adhi";
		name[0] = "test"; //update the array value
		//name[0] = "Adhi"; // Accepts duplicate value
		name[1] = "Lakshmi";
		name[2] = "Bijjam";
		name[3] = "Adhilakshmi";
		
		//for(int i=0; i<=3; i++) {
			
			//System.out.println(name[i]);
		
		System.out.println(Arrays.toString(name));
		
		char [] gender = new char [3];
		
		gender [0] = 'F';
		gender [1] = 'M';
		gender [2] =  'T';
		//gender [3] = 'y';
		
		System.out.println(Arrays.toString(gender));
		
		
		
	}
		
	}


