package Class_11;

import java.util.Scanner;

public class claculator {

	public static void main(String[] args) {
		
		Scanner S1 = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		
		int num1 = S1.nextInt();
		
System.out.println("Enter the seccond number");
		
		int num2 = S1.nextInt();
		
System.out.println("Enter the third number");
		
		int num3 = S1.nextInt();
		
System.out.println("Enter the fourth number");
		
		int num4 = S1.nextInt();
		
		int sum = num1 + num2 + num3 + num4;
		
		System.out.println("The sum of the 4 numbers is: " + sum);
		
		
		

	}

}
