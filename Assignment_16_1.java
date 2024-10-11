package Assignment;

class code

{
	
	void automation_code()
	{
		System.out.println("Automation code is running successfully");
		
	}
	
}

class code1 extends code
{
	void Java_code()
	{
		System.out.println("Java code is running successfully");
		
	}
	
}
class code2 extends code1
{
	void Phyton_code()
	{
		
		System.out.println("Phyton code is running successfully");
	}
	
}

public class Assignment_16_1 extends code2
{
	void playright()
	{
		System.out.println("Playright code is failing");
		
	}
	
	public static void main(String[] args) {
		
		Assignment_16_1 A1 = new Assignment_16_1();
		
		A1.playright();
		
		A1.automation_code();
		
		A1.Java_code();
		
		A1.Phyton_code();
		
		
	}

}
