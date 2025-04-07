package day8;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleTabs {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		String mainTitle = driver.getTitle();
		System.out.println("Main page is : "+ mainTitle);
		
		driver.findElement(By.id("opentab")).click();
		
		Set<String> tabs = driver.getWindowHandles();
		
		for(String tab : tabs) {
			
			if(driver.getTitle() != mainTitle) {
				driver.switchTo().window(tab);
				Thread.sleep(3000);
			}
			
			
		}
		driver.quit();
	}
	
}
