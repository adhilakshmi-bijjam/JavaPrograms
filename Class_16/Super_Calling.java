package Class_16;

class adhi
{
	adhi(){
		
		super();
		
		System.out.println("Adhi");
		
	}
	
}

class adhi1 extends adhi
{
	adhi1(){
		
		super();
		
		System.out.println("Adhi1");
	}

}


public class Super_Calling extends adhi1

{
	Super_Calling(){
		
		super();
		
		System.out.println("Super_Calling");
	}
	
 public static void main(String[] args)
  {
	 
	 new Super_Calling();
	 
	 
	 
	
} 

}
