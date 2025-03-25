package Naukri;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NaukriUpdate {

		
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		UpdateHeadline();
		
	}
	
	@Test
	static void UpdateHeadline() throws InterruptedException{
			WebDriver driver = new ChromeDriver();	
			driver.get("https://www.naukri.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			//login
			driver.findElement(By.id("login_Layer")).click();
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[2]/input")).sendKeys("parag5948@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[3]/input")).sendKeys("Pcristiano@7");
			driver.findElement(By.xpath("//button[@class= \"btn-primary loginButton\"]")).click();
			
			driver.findElement(By.xpath("/html/body/main/div/div/div[3]/div/div[3]/div[2]/a")).click();
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,350)", "");
			
			driver.findElement(By.xpath("//*[@id=\"lazyResumeHead\"]/div/div/div[1]/span[2]")).click();
			
			String headline = driver.findElement(By.id("resumeHeadlineTxt")).getText();
			String header = "Proven experience as a QA tester | Knowledge and experience in automated testing tools, Selenium, JIRA, OOPS concepts, and Java | Familiarity with Agile frameworks and Regression testing along with an ability to document and troubleshoot errors";
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resumeHeadlineTxt")));
			driver.findElement(By.id("resumeHeadlineTxt")).clear();
			driver.findElement(By.id("resumeHeadlineTxt")).clear();
			driver.findElement(By.id("resumeHeadlineTxt")).clear();
			Thread.sleep(3000);
			
			if(headline.equals(header)){	
			driver.findElement(By.id("resumeHeadlineTxt")).sendKeys("Proven experience as a QA tester | Knowledge and experience in automated testing tools, Selenium, JIRA, OOPS concepts, and Java | Familiarity with Agile frameworks and Regression testing along with an ability to document and troubleshoot errors.");
			driver.findElement(By.xpath("//button[@class='btn-dark-ot' and @type='submit']")).click();
			System.out.println("Headline Text updated..");
			}
			
			else {
				driver.findElement(By.id("resumeHeadlineTxt")).sendKeys("Proven experience as a QA tester | Knowledge and experience in automated testing tools, Selenium, JIRA, OOPS concepts, and Java | Familiarity with Agile frameworks and Regression testing along with an ability to document and troubleshoot errors");
				driver.findElement(By.xpath("//button[@class='btn-dark-ot' and @type='submit']")).click();
				System.out.println("Headline Text updated");
			}
			
			
			driver.findElement(By.xpath("//*[@id=\"ni-gnb-header-section\"]/div[3]/div[2]/div[4]/div/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"ni-gnb-header-section\"]/div[3]/div[2]/div[4]/div[2]/div[2]/div/div[3]/div/div[1]/div[4]/a")).click();
			
			driver.close();
	}

}
