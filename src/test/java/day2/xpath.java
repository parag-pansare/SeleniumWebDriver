package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//xpath with single attribute
		//driver.findElement(By.xpath("//input[@id = 'small-searchterms']"));
		
		//xpath with multiple attribute
		//driver.findElement(By.xpath("//input[@id = 'small-searchterms' ] [@name='q']")).sendKeys("laptop");
		
		//xpath with multiple attribute and operators
		//driver.findElement(By.xpath("//input[@id = 'small-searchterms'and @name='q']")).sendKeys("laptop");
		
		//xpath with text() method
		//driver.findElement(By.xpath("//*[text()='Electronics ']")).click();
		
		//xpath with contains() method
		//driver.findElement(By.xpath("//*[contains(@placeholder, 'Search')]")).sendKeys("Mobile");
		
		//xpath with starts-with
		driver.findElement(By.xpath("//*[starts-with(@placeholder, 'Sear')]")).sendKeys("Mobile");
		
		System.out.println("Pass");
		
		

	}

}
