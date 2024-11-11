package class_24;

import java.util.Arrays;

public class String_Array {

	public static void main(String[] args) {
		
		String S1 = "ram";
		String S2 = "arm";
		
		
		if(S1.length()!= S2.length()) {
			
			System.out.println("They are not anagaram");
			
		
			
		}else {
			
			char c1[] = S1.toCharArray();
			char c2[] = S2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
	        System.out.println(Arrays.toString(c1));
			
			System.out.println(Arrays.toString(c2));
			
			boolean b1 = Arrays.equals(c1, c2);
			
			if(b1==true){
				
				System.out.println("They are anagaram");
			
			
		}
		

		}
	
		

	}

}
