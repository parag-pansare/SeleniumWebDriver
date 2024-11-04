package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class firstTest {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/");
		//demo.opencart.com
		driver.manage().window().maximize();
		String pageTitle = driver.getTitle();
		System.out.println("Page title is : "+pageTitle);
		
		if(pageTitle.equals("Demo Testing Site - GlobalSQA")) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
		driver.close();
	}

}
