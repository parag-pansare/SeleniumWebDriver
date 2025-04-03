package day7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id = 'name'][@name= 'enter-name']")).sendKeys("Parag");
		driver.findElement(By.id("alertbtn")).click();
		
		Alert alrt = driver.switchTo().alert();
		Thread.sleep(2000);
		
		String alertText = alrt.getText();
		System.out.println(alertText);
		
		alrt.accept();
		System.out.println("Alert accepted");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id = 'name'][@name= 'enter-name']")).sendKeys("Aish");
		driver.findElement(By.xpath("//input[@id = 'confirmbtn'][@value= 'Confirm']")).click();
		Thread.sleep(2000);
		Alert al2 = driver.switchTo().alert();
		String alert2 = al2.getText();
		System.out.println(alert2);

		al2.dismiss();
		System.out.println("Alert Dismissed");
		Thread.sleep(2000);
		
		driver.close();
		
		

	}

}
