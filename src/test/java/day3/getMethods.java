package day3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println("Title of page is : "+ driver.getTitle());
		
		System.out.println("URL of page is : " + driver.getCurrentUrl());
		//System.out.println("WindowHandle of page is : " + driver.getWindowHandle());
		//System.out.println("PageSource is : " + driver.getPageSource());
		
		driver.findElement(By.partialLinkText("OrangeHRM")).click();
		Set<String> windowIds = driver.getWindowHandles();
		System.out.println(windowIds);
		Thread.sleep(5000);
		
		driver.quit();
	}

}
