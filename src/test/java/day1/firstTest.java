package day1;



import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class firstTest {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/");
		//demo.opencart.com
		driver.manage().window().maximize();
		String pageTitle = driver.getTitle();
		//System.out.println("Page title is : "+pageTitle);
		
		/*String expectedTitle = "Demo Testing Site - GlobalSQA";
		Assert.assertEquals(pageTitle, expectedTitle, "Not matching");
		*/
		
		if(pageTitle.equals("Demo Testing Site - GlobalSQA")) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
		driver.close();
	}

}
