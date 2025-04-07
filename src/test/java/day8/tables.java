package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tables {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500);");

		
		// Step 1 = Get no of rows
		// Step 2 = Get no of columns
		// Step 3 = iterate rows and columns and get text
		
		
		List<WebElement> rowEl = driver.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr"));
		int rowSize = rowEl.size();
		System.out.println("Total rows : " + rowSize );
		
		List<WebElement> colEl = driver.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr[1]/td"));
		int colSize = colEl.size();
		System.out.println("Total Columns : " + colSize);
		
		for(int i =1; i<=rowSize; i++) {
			for(int j=1;j<colSize;j++) {
				String text = driver.findElement(By.xpath("//*[@id=\"product\"]/tbody/tr[" +i+ "]/td[" +j+ "]")).getText();
				System.out.print(text + "  ");
			}
			System.out.println();
			
		}
		
		driver.quit();
	}

}
