package Assignment;

public class Operators {
	
	void add() {
		
		int a =10;
		int b= 20;
		int sum = a+b;
		
		System.out.println("Addition of 2 numbers is " + sum);	
	}

void sub() {
		
		int a =10;
		int b= 20;
		int sub = b-a;
		
		System.out.println("Subtraction of 2 numbers is " + sub);	
	}

void mul() {
	
	int a =10;
	int b= 20;
	int mul = a*b;
	
	System.out.println("Multiplication of 2 numbers is " + mul);	
}

void div() {
	
	int a =10;
	int b= 20;
	int div = a/b;
	
	System.out.println("Division of 2 numbers is " + div);	
}

void rem () {
	
	int a =10;
	int b= 20;
	int rem = a%b;
	
	System.out.println("Reminder of 2 numbers is " + rem);	
}

	public static void main(String[] args) {
		
		Operators O = new Operators();
		
		O.add();
		O.sub();
		O.mul();
		O.div();
		O.rem();
		
		
	}

}
