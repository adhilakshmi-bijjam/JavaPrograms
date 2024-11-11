package allen;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automation {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://web.allen-stage.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement loginCTAButton = driver.findElement(By.xpath("//div[text()='Login']//parent::button[@data-testid='loginCtaButton']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(loginCTAButton));
		loginCTAButton.click();
		
		//wait.until(ExpectedConditions.visibilityOf(loginCTAButton));
		driver.findElement(By.xpath("//div[@class='hidden md:block']//input[@id='mobileNumber']")).sendKeys("8019893165");
		driver.findElement(By.xpath("//div[@class='hidden md:block']//button[@data-testid='submitOTPButton']")).click();
		
		List<WebElement> otpField = driver.findElements(By.xpath("//div[@class='hidden md:block']//input[@data-testid='OTPInputField-1']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(otpField));
		for(int i=0; i<otpField.size(); i++) {
			otpField.get(i).sendKeys("1");
			Thread.sleep(3000);
		}
		
		//driver.close();
		
		
	}

}
