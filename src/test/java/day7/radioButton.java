package day7;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name= \"radioButton\"][@value = \"radio2\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name= \"radioButton\"][@value = \"radio3\"]")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
