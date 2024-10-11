package Assignment;


class one {
	
	one(String a)
	{
		
		System.out.println("one");
		
	}	
}

class two extends one
{
	two(int a, int b)
	
	{
		super("adhi");
		System.out.println("two");
	}	
}

public class Assignment_17 
{
	
	/*Assignment_17()
	{
		
		super(10,20);
		
		System.out.println("Assignment_17");	
	}*/
	
	

	public static void main(String[] args) {
		
		
	//	Assignment_17 A1 = new Assignment_17();
		
		two T1 = new two(10,20);
		
		
	}

}
