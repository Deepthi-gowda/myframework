package generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Generic_Test implements Auto_const {
public static WebDriver driver;
	static
	{
		System.setProperty(Gecko_key, Gecko_value);
//		System.setProperty(chrome_key,chrome_value);
	}
//@Parameters({"browser"})
	@BeforeMethod
	public void openappln(){
//{if(browser.equals("chrome"))
//{	driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com/");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
//	}
//else{String browser
		driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		

	
//		@AfterMethod
//		public void closeappl(ITestResult res) throws IOException
//		{
//			int status = res.getStatus();
//	String tcname = res.getName();
//	if(status==2)
//	{
//		G_screenshot.getPhoto(driver,tcname);
//		Reporter.log(tcname,true);
//	}
//			driver.quit();
//		}

	}


