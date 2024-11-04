package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoblaze.com/");
		driver.manage().window().maximize();
		
		List<WebElement> noOfLinks = driver.findElements(By.tagName("a"));
		System.out.println("No of links on page is :" + noOfLinks.size());
			
		List<WebElement> linksWithClass = driver.findElements(By.className("nav-item"));
		System.out.println("No of links with class locator : " + linksWithClass.size());
		
		List<WebElement> noOfImgs = driver.findElements(By.tagName("img"));
		System.out.println("No of images on page is :" + noOfImgs.size());
		
		Boolean linkVisible = driver.findElement(By.linkText("Laptops")).isDisplayed();
		System.out.println("Is the link visible " + linkVisible);
		
		driver.findElement(By.linkText("Monitors")).click();
		
		System.out.println("Clicke on Monitors");
		
		driver.close();
	}

}
