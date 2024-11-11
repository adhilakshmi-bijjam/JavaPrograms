package first_program;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chromebrowser {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
	    System.out.println(driver.getWindowHandle());
		//driver.close();
		driver.quit();
	}

}
