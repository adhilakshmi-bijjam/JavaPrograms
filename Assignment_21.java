package Assignment;

class parentclass1{
	
void sub() {
		
		int a =20;
		int b=5;
		int c= a-b;
		System.out.println("Sub of 2 numbers is " + c);
	}
}

public class Assignment_21 extends parentclass1 {
	
	void sub() {
		super.sub();
		int a =20;
		int b=10;
		int c= a-b;
		System.out.println("Sub of 2 numbers is " + c);
	}
	

	public static void main(String[] args) {
		
		Assignment_21 A1 = new Assignment_21();
		
		A1.sub();
		
	}

}
