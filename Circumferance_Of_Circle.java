package Assignment;

import java.util.Scanner;

public class Circumferance_Of_Circle {

	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		
		System.out.println("Enter the value of pi is ");
		
	double pi =	S.nextDouble();
	System.out.println("Enter the value of r is ");
	
	int r = S.nextInt();
	
 double circumferance = 2*pi*r;
 
 System.out.println("Circumferance of circle is " + circumferance);
	
	

	}
}
