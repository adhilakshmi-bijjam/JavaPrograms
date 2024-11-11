package class_25;

import java.util.Date;

public class CurrentTime {

	public static void main(String[] args) {
		
		Date d1 = new Date();
		
	long l1 = 	d1.getTime();
	
	System.out.println(l1);
	
	Date d2 = new Date(d1.getTime());
	
	System.out.println(d2);
	
String d3 =	d2.toString();

String mnth = d3.substring(4, 7);

System.out.println(mnth);
		

	}

}
