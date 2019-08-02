package generic;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.gargoylesoftware.htmlunit.Page;

public abstract class Base_page
{
	public static  WebDriver driver;
	public Base_page(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public  static void verifyTitle(String title)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
	try{
		wait.until(ExpectedConditions.titleContains(title));
	Reporter.log("title is matching",true);
	
	}
	catch(Exception e)
	{
		Reporter.log("title is not matching",true);
	    Assert.fail();
	}
	
	}
	
	public static void verifyElement(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
	try{
		wait.until(ExpectedConditions.visibilityOf(element));
	Reporter.log("title is present",true);
	
	}
	catch(Exception e)
	{
		Reporter.log("title is not present",true);
	    Assert.fail();
	}
	
	}
	

}
