package day7;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handleDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
		dropdown.selectByVisibleText("Option3");
		Thread.sleep(3000);
		
		dropdown.selectByIndex(1);
		Thread.sleep(3000);
		
		dropdown.selectByValue("option2");
		Thread.sleep(3000);
		
		driver.close();

	}

}
