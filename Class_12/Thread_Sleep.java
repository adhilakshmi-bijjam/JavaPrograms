package Class_12;

public class Thread_Sleep {

	public static void main(String[] args) throws InterruptedException {
		
		for( int i=1; i<10; i++) {
			
			System.out.println(i);
			
			Thread.sleep(2000);
			
		}
		
		
	}

}
