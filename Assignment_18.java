package Assignment;

class grandmother

{
	grandmother(){
		
		System.out.println("grandmother");
		
	}
	
}

class mother extends grandmother
{
	mother()
	{
		System.out.println("mother");
		
	}
	
}

class child extends mother 
{
	child()
	{
		
		System.out.println("child");
		
	}
	
}

public class Assignment_18 extends child 

{
	
	Assignment_18(){
		
		System.out.println("Assignment_18");
	}

	public static void main(String[] args) {
		
		Assignment_18 A1 = new Assignment_18();
		
		

	}

}
