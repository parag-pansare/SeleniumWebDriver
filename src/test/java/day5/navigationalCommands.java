package day5;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationalCommands {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		WebDriver driver = new ChromeDriver();	
		
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		URL myurl = new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to(myurl);	// .to accepts Obj as parameter as well		
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		
		
		//driver.close();
	}

}
