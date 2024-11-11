package string_methods;

public class Palindrome {

	public static void main(String[] args) {
		
	String name = "mom";
	
	String reverse = "";
	
	for(int i =name.length()-1; i>=0; i--) {
		
		char c = name.charAt(i);
		
		reverse = reverse + c;
		
	}
		System.out.println(reverse);
		
		if(name.equals(reverse)) {
			
			System.out.println("The given string is palindrome");
			
		}else {
			
			System.out.println("The given string is not a palindrome");
		}
		

	}

}
