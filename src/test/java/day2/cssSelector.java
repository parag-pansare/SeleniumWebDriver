package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//tag id - tag#id
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("iphone");
		
		//tag class	- tag.classname
		driver.findElement(By.cssSelector("button.search-box-button")).click();
		System.out.println("Searched for iphone ");
		
		//tag attribute	- tag[attribute="value"]
		driver.findElement(By.cssSelector("a[title=\"Show details for Apple iPhone 15 128GB\"]")).click();
		System.out.println("Clicked on Iphone 15");
		
		//tag class attribute - tag.classname[attribute="value"]
		driver.findElement(By.cssSelector("button.add-to-cart-button[type=\"button\"]")).click();
		System.out.println("Added to cart");
		
		driver.close();
	}

}
