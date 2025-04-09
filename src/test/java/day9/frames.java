package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//frame1
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src = \"frame_1.html\"]"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name= \"mytext1\"]")).sendKeys("Test frames");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		//frame2
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src = \"frame_2.html\"]"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name= \"mytext2\"]")).sendKeys("Selenium practice");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		//frame3
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src = \"frame_3.html\"]"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name= \"mytext3\"]")).sendKeys("Nested frame");
		Thread.sleep(2000);
		
		//nested iframe
		//WebElement iframe = driver.findElement(By.xpath(""));
		driver.switchTo().frame(0);
		Boolean logo = driver.findElement(By.xpath("//*[@id=\"logo\"]/tbody/tr/td/img")).isDisplayed();
		System.out.println(logo);
		Thread.sleep(2000);
		
		driver.close();
	}

}
