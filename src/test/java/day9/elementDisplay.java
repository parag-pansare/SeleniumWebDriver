package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class elementDisplay {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		
		
		if(driver.findElement(By.id("displayed-text")).isDisplayed()){
			System.out.println("Element found");
			driver.findElement(By.id("displayed-text")).sendKeys("test");
			Thread.sleep(3000);
		}
		else {
			System.out.println("Element not found directly");
			driver.findElement(By.id("show-textbox")).click();
			driver.findElement(By.id("displayed-text")).sendKeys("testing after show");
			Thread.sleep(3000);
		}
		
		driver.findElement(By.id("hide-textbox")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("show-textbox")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
