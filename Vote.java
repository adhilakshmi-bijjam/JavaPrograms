package Class_11;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		
		Scanner S1 = new Scanner (System.in);
		
		System.out.println("enter your age");
		
		int age = S1.nextInt();
		
System.out.println("enter your gender");
		
		String gender = S1.next();
		
		if (age > 18 && gender.equals("female")) {
			
			System.out.println("You are eligible to vote");
				
		}else {
			
			System.out.println("You are not eligible to vote");
			
		}
		
	}
}
