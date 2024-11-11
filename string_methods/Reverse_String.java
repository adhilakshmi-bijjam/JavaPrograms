package string_methods;

public class Reverse_String {

	public static void main(String[] args) {
		
		
		String name = "lakshmi";
		
		String reverse = "";
		
		for(int i =6;i>=0; i--) {
			
		char c = name.charAt(i);
		
   	reverse = reverse + c;
				}
		
		System.out.println(reverse);

	}

}
