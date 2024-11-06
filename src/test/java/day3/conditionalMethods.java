package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
		System.out.println("Display status of logo is : " + logo.isDisplayed());
		
		Boolean searchBoxEnabled = driver.findElement(By.xpath("//input[@id= \"small-searchterms\"]")).isEnabled();
		System.out.println("Search box enable status is : "+ searchBoxEnabled);
		
		driver.findElement(By.xpath("//a[@class=\"ico-register\"]")).click();
		
		WebElement female= driver.findElement(By.xpath("//input[@id=\"gender-female\"]"));
		WebElement male= driver.findElement(By.xpath("//input[@id=\"gender-male\"]"));
		System.out.println("Radio button selection status for female is : " + female.isSelected());
		System.out.println("Radio button selection status for male is : " + male.isSelected());
		female.click();
		System.out.println("Radio button selection status for female is : " + female.isSelected());
		
		driver.quit();
	}

}
