package class_23;

public class Array_Checking {

	public static void main(String[] args) {
		
		String [] name = new String [3];
		
		name [0] = "Adhi";
		name [1] = "Bijjam";
		name [2] = "Testing";
		
		String name1 = "Testing";
		
		for(int i=0; i<=2; i++)
		{
			
			if(name1==name[i]) {
				
				System.out.println(name1 + " array is equal at the postion of " + i);
				
			}
			
			
		}
		
		
		
	}

}
