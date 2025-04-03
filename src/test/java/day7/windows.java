package day7;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		String mainWindow = driver.getWindowHandle();
		System.out.println("Main window is : "+mainWindow);
		
		driver.findElement(By.id("openwindow")).click();
		Thread.sleep(3000);
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String handle : allWindows) {
			System.out.println(handle);
			if(handle != mainWindow) {
				driver.switchTo().window(handle);
			}
			
		}
		
		
		String titleofWindow = driver.getTitle();
		System.out.println(titleofWindow);
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(mainWindow);
		String titleofmain = driver.getTitle();
		System.out.println(titleofmain);
		driver.quit();

	}

}
