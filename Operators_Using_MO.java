package Assignment;

public class Operators_Using_MO {
	
	static void add(int a, int b) {
		
		int sum = a+b;
		
		System.out.println("Addition of 2 numbers is" + sum);
		
	}
static void add(int a, double b) {
		
		double mul = a*b;
		
		System.out.println("Mul of 2 numbers is" + mul);
		
	}
static void add(double a, double b) {
	
	double sum = a+b;
	
	System.out.println("Addition of 2 numbers is" + sum);
	
}

 void add(int a, String b, char c ) {
	
	
	System.out.println(a);
	System.out.println("name is " + b);
	System.out.println("Char is " + c);
	
	
}
	public static void main(String[] args) {
		
		Operators_Using_MO O = new Operators_Using_MO();
		
		
		add(10,20);
		
		add(10,2.0);
		
		add(1.0, 2.0);
		
		O.add(10, "lakshmi", 'L');
		

	}

}
