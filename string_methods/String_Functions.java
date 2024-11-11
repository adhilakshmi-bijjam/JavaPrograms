package string_methods;

public class String_Functions {

	public static void main(String[] args) {
		
		String name = "Lakshmi";
	int l1 = name.length();
	
	System.out.println(l1);
	System.out.println(name.toUpperCase());
	System.out.println(name.toLowerCase());
	System.out.println(name.charAt(5));
	
	String b = " Adhi";
	
	System.out.println(name.concat(b));
		
	System.out.println(name.concat("bijjam"));
	
	String c = " Adhi lakshmi Bijjam ";
	
	System.out.println(c.trim());
	
    System.out.println(c.isEmpty());

     String d = "";
		
    System.out.println(d.isEmpty());
    
   System.out.println(name.substring(2));
   System.out.println(name.substring(1, 6));
 
   
   
   
		
	}

}
