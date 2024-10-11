package Assignment;


class manual_tester  
{
	
	static void add()
	{
		
		int a = 10;
		
		int b = 20;
		
		int c = a + b;
		
		System.out.println("Sum of 2 numbers is " + c);
		
	}	
	
}

class automation_tester extends manual_tester
{
	static void sub()
	{
		
		System.out.println("I am an automation tester ");
		
	}	
}

class performance_tester extends automation_tester

{
	
	
	static void mul()
	{
		
		System.out.println("I am a performance tester ");
	}
	
}

public class Assignment_16 extends performance_tester

{
	
	static void div()
	{
		
		System.out.println("I am a quality engineer ");
	}
	
	public static void main(String[] args) {
		
		div();
		
		add();
		
		sub();
		
		mul();
		
		
	}
	

}
