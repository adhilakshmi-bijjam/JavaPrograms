package Assignment;

public class Assignment_13 {

	public static void main(String[] args) throws InterruptedException {

		//Numbers printing with 2 seconds interval

           for( int i=1; i<10; i++) {
			
			System.out.println(i);
			
			Thread.sleep(2000);
			
		}
	}

}
