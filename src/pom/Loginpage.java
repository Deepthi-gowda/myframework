package pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import generic.Base_page;
import generic.Generic_Excel;
import generic.Generic_action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import bsh.Console;

public class Loginpage extends Base_page
{   @FindBy(xpath="(//div[.='Login & Signup'])[3]']")
    private WebElement Mousehover;
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement username;
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement clk;
	@FindBy(xpath="//input[@name = 'q']")
	private WebElement Searchbox;
	@FindBy(xpath="//div[@class='_2kpuIQ']")
	private List<WebElement> suggetion;
	@FindBy(xpath="//a/span[.='Cart']")
	private WebElement cart;
	@FindBy(xpath="(//div[.='Remove'])[1]")
	private WebElement remove;
	@FindBy(xpath="(//div[.='My Account'])[3]")
	private WebElement myaccount;
	@FindBy(xpath="//div[@class='_1Q5BxB'][contains(.,'Logout')]")
	private WebElement logout;
	@FindBy(xpath="//div[.='Remove']")
	private WebElement remconf;
	
	Generic_Excel g1 = new Generic_Excel();
	
	
	public Loginpage(WebDriver driver)
{
	super(driver);
}
public void loginpage() throws InterruptedException
{	/*Mousehover.click();*/
	
String un = g1.getcellvalue("Sheet1", 0, 0);
String pw = g1.getcellvalue("Sheet1", 0, 1);

	
	username.sendKeys(un);
	password.sendKeys(pw);
	Thread.sleep(2000);
	clk.click();
}	
	public void search() throws InterruptedException, AWTException
	{
		Thread.sleep(6000);
String sb = g1.getcellvalue("Sheet1", 0, 2);
 Searchbox.sendKeys(sb);
 Thread.sleep(2000);
	int count = suggetion.size();
	List<String> l1 =new ArrayList<String>();
for (WebElement sg : suggetion) 
{
String text = sg.getText();	
Reporter.log(text,true);
l1.add(text);
}
Thread.sleep(6000);
	Robot r1 = new Robot();
	r1.keyPress(KeyEvent.VK_DOWN);
	r1.keyRelease(KeyEvent.VK_DOWN);
	r1.keyPress(KeyEvent.VK_DOWN);
	r1.keyRelease(KeyEvent.VK_DOWN);
	r1.keyPress(KeyEvent.VK_DOWN);
	r1.keyRelease(KeyEvent.VK_DOWN);
	r1.keyPress(KeyEvent.VK_ENTER);
	r1.keyRelease(KeyEvent.VK_ENTER);
}
	
	public void cart() throws InterruptedException
	{Thread.sleep(3000);
		cart.click();
	}
	public void remove() throws InterruptedException
	{Thread.sleep(3000);
		remove.click();
		Thread.sleep(3000);
		remconf.click();
	}
	
	public void myaccount() throws InterruptedException
	{Thread.sleep(3000);
	Generic_action act = new Generic_action(driver);
	act.mousehover(myaccount);
	}
	public void logout() throws InterruptedException
	{Thread.sleep(3000);
	logout.click();
	}
}


