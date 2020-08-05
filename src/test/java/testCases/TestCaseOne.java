package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjects.HomePage;

public class TestCaseOne {
	
	@Test
	public void TestCase()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bandivij\\Desktop\\Sravanthi Bana\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		HomePage hp = new HomePage(driver);
		hp.getID().sendKeys("abc");
		hp.getPwd().sendKeys("qwe");
		hp.getGo().click();
	}

}
