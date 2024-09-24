package Assignment;

import java.util.Scanner;

public class Areaofcircle {

	public static void main(String[] args) {
Scanner S = new Scanner(System.in);
		
		System.out.println("Enter the value of pi");
		
	double pi =	S.nextDouble();
	
	System.out.println("Enter the value of r");
	
	int r = S.nextInt();
	
    double area = pi*r*r;
    
    System.out.println("Area Of Circle is " + area);
	
	}
}
		