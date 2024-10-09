package Assignment;

import java.util.Scanner;

public class Assignment_12 {

	public static void main(String[] args) {
		
		//Area of circle using math class
		
		Scanner S1 = new Scanner(System.in);
		
		System.out.println("Enter the value of radius");
		
		int radius = S1.nextInt();
		
		double area = Math.PI*radius*radius;
		
		System.out.println("Area of circle is " + area);
		
		

	}

}
