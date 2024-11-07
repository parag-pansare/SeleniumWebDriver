package day5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
				
		driver.findElement(By.xpath("//a[contains (text(), 'OrangeHRM')]")).click();
		
		Set<String> windowIDs = driver.getWindowHandles();
		
		//convert set to list
		/*
		List<String> windowList = new ArrayList(windowIDs);
		
		String parentID = windowList.get(0);
		String childID = windowList.get(1);

		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());
		*/
		
		//for more number of windows
		for (String winID:windowIDs) {
			String title = driver.switchTo().window(winID).getTitle();
			System.out.println(title);
			if(title.equals("Human Resources Management Software | OrangeHRM")) {
				System.out.println("In child window");
				driver.close();
			}
			else {
				System.out.println("This is parent window : "+ driver.getCurrentUrl());
			}
		}
		
	}

}
