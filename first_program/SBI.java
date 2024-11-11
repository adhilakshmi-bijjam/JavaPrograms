package first_program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBI {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		
		
		
	}

}
