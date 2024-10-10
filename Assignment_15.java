package Assignment;

class lakshmi   //super class

{
	void add() {
		
		int a = 10;
		
		int b = 20;
		
		int sum = a + b;
		
		System.out.println("Sum of 2 numbers is " + sum);
		
		
	}
	
	void sub() {
		
        int a = 30;
		
		int b = 20;
		
		int sub = a - b;
		
		System.out.println("Sub of 2 numbers is " + sub);
	}
}

public class Assignment_15 extends lakshmi // sub class

{
	
	
	static void mul() {
		 int a = 3;
			
			int b = 20;
			
			int mul = a * b;
			
			System.out.println("Mul of 2 numbers is " + mul);
		
	}
	
	void div() {
		
		 int a = 10;
			
			int b = 20;
			
			int div = a / b;
			
			System.out.println("Div of 2 numbers is " + div);
	}

	public static void main(String[] args) {
		
		Assignment_15 A1 = new Assignment_15();
		
		mul();
		
		A1.add();
		
		A1.sub();
		
		A1.div();
		

	}

}
