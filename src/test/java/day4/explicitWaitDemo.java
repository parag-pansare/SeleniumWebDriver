package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWaitDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement usrName = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name =\"username\"]")));
		
		usrName.sendKeys("Admin");
		
		System.out.println("Pass");
		driver.close();
	}

}
