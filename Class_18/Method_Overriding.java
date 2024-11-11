package Class_18;

class parent_class {
	void login() {
		
		System.out.println("1st");
	}
	
}

public class Method_Overriding extends parent_class{
	
	void login() 
	{		
		
	
		System.out.println("2nd");
		super.login();
		
	}

	public static void main(String[] args) {
		
		Method_Overriding M1 = new Method_Overriding();
		
		M1.login();
		
	}

}
