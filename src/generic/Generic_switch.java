package generic;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class Generic_switch 
{ public void window(WebDriver driver) throws InterruptedException

	{
	Thread.sleep(5000);
	Set<String> weall = driver.getWindowHandles();
	System.out.println(weall);
	String we = driver.getWindowHandle();
	weall.remove(we);
	for (String sr : weall) 
	{
	driver.switchTo().window(sr);
	}
	
	
}}
