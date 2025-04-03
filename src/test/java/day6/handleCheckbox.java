package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleCheckbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();	
		driver.get("https://trytestingthis.netlify.app/?fname=&lname=&gender=male&option=option&Optionwithcheck%5B%5D=option+1&Options=&favcolor=%2300ced1&day=&a=50&myfile=&quantity=5&message=The+cat+was+pl");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@id='moption'][@name='option1']")).click();
		
		//select all checkboxes
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@id='moption' and @type='checkbox']"));
		
		/*for (int i=0; i<checkboxes.size(); i++) {
			checkboxes.get(i).click();
		}
		*/
		
		/*for(WebElement cb:checkboxes) {
			cb.click();
		}
		*/
		int n = checkboxes.size();
		
		for (int i=0; i<n; i++) {
			checkboxes.get(i).click();
		}
		
		Thread.sleep(4000);
		
		for (int i=0; i<checkboxes.size(); i++) {
			if(checkboxes.get(i).isSelected()) {
			checkboxes.get(i).click();
			}
		}
		
	}

}
