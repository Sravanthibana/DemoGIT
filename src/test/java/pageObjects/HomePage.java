package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*By id = By.id("email");
	By pwd = By.id("pass");
	By go = By.xpath("//input[@value='Log In']");
	
	public WebElement getID()
	{
		return driver.findElement(id); 
	}
	
	public WebElement getPwd()
	{
		return driver.findElement(pwd);
	}
	
	public WebElement getGo()
	{
		return driver.findElement(go);
	}*/
	
	@FindBy(id="email")
	WebElement id;
	
	@FindBy(id="pass")
	WebElement pwd;
	
	@FindBy(xpath="//input[@value='Log In']")
	WebElement go;
	
	public WebElement getID()
	{
		return id;
	}
	
	public WebElement getPwd()
	{
		return pwd;
	}
	
	public WebElement getGo()
	{
		return go;
	}

}
