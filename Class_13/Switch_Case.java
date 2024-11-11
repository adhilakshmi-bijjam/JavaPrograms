package Class_13;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		
		Scanner S1 = new Scanner (System.in);
		
		System.out.println("Enter 1 for chrome");
		System.out.println("Enter 2 for safari");
		System.out.println("Enter 3 for Edge");
		System.out.println("Enter 4 for Microsoft");
		
		int input = S1.nextInt();
		
		switch(input)
		
		{
			
		case 1:System.out.println("Launch Chromer Browser");
		break;
			
		case 2: System.out.println("Launch Safari Browser");
		break;
		
		case 3: System.out.println("Launch Edge Browser");
		break;
		
		case 4: System.out.println("Launch Microsoft Browser");
		break;
		
		default:
			
			System.out.println("Launch default Browser");
			
			
		}
		
		

	}

}
