package first_program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) throws InterruptedException {
	
		//launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		//To maximize the chrome browser
		driver.manage().window().maximize();
		//To open the flipkart application
		driver.get("https://www.flipkart.com/");
		//To get the title
	String title =	driver.getTitle();
	System.out.println(title);
	driver.findElement(By.xpath("//a[@title='Login'][1]")).click();
	Thread.sleep(1000);
	//driver.findElement(By.xpath("//input[@type='text'][1]")).click();
	driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("8019893165");
	driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']")).click();
	
		/*driver.findElement(By"id("twotabsearchtextbox")).sendKeys("laptop");
		Thread.sleep(1000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.close();*/
		
		

	}

}
