package Class_15;

class one // super class

{
	
	static void add(int a , int b) 
	{
		
		int sum = (a + b);
		
		System.out.println("addition of 2 numbers is " + sum);
	
		
	}
	
	static void sub ()
	{
		
		System.out.println("Sub");
		
	}
	
}



public class Single_Level_Inheritance extends one  // sub class

{
	
	static void mul()
	{
		
		System.out.println("Mul");
		
	}
	
	static void div()
	{
		
		
	}

	public static void main(String[] args) {
		
		// calling sub class methods 
		
		mul();
		
		div();
		
		add(10,10);
		
		sub();
		
		
		
		
		
	

	}

}
