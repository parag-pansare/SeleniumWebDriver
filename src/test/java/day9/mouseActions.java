package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class mouseActions {

	public static void validate(String URL, String validationURL) {
		Assert.assertEquals(URL, validationURL);
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement hover = driver.findElement(By.id("mousehover"));	
		a.moveToElement(hover).perform();
		Thread.sleep(2000);
		
		WebElement Top = driver.findElement(By.xpath("//div[@class = \"mouse-hover-content\"]/a[1]"));
		a.moveToElement(Top).click().perform();
		Thread.sleep(2000);
		
		String url = driver.getCurrentUrl();
		validate(url, "https://rahulshettyacademy.com/AutomationPractice/#top");
		
		
		driver.close();
		
	}
	

}
