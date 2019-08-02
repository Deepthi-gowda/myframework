package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_page;
import generic.Generic_action;

public class Itempage1 extends Base_page 
{
	@FindBy(xpath=("//span[@class='_1QZ6fC _3Lgyp8'])[3]"))
	private WebElement mouse;
	@FindBy(xpath=("//a[.='T-Shirts']"))
	private WebElement item;
public Itempage1(WebDriver driver) {
		super(driver);
		
	}

public void mousehover() throws InterruptedException
{
	Generic_action g1 = new Generic_action(driver);
	Thread.sleep(3000);
	g1.mousehover(mouse);
	Thread.sleep(3000);
	item.click();
	
}
}
