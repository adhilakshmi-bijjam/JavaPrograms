package Assignment;

class adhi  // super class

{ 
	static void add() {
		
		int a = 10;
		
		int b = 20;
		
		int sum = a + b;
		
		System.out.println("Sum of 2 numbers is " + sum);
		
		
	}
	
	static void sub() {
		
        int a = 20;
		
		int b = 10;
		
		int sub = a - b;
		
		System.out.println("Sub of 2 numbers is " + sub);
		
		
	}
}



public class Assignment_14 extends adhi  // sub class

{
   static void mul() {
		
	   int a = 10;
		
		int b = 2;
		
		int mul = a * b;
		
		System.out.println("Mul of 2 numbers is " + mul);
		
		
	}
	
	static void div() {
		
        int a = 10;
		
		int b = 20;
		
		int div = a / b;
		
		System.out.println("div of 2 numbers is " + div);
		
		
	}
	
	

	public static void main(String[] args) {
		
		
		mul();
		
		div();
		
		add();
		
		sub();
		
		

	}

}
