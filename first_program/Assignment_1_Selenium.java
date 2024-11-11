package first_program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_1_Selenium {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("Bijjam Adhilakshmi");
		driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("8019893165");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name = 'login']")).click();
		//driver.close();
		

		
		
		
		
		

	}

}
