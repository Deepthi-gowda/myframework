package pom;

import java.util.Set;

import generic.Base_page;
import generic.Generic_switch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Itempage extends Base_page 
{
@FindBy(xpath=("//button[@class = '_2AkmmA _2Npkh4 _2MWPVK']"))
private WebElement addcart;
public Itempage(WebDriver driver)
{
	super(driver);
}

public void addtocart() throws InterruptedException
{
Thread.sleep(5000);
Generic_switch g1 = new Generic_switch();
g1.window(driver);

addcart.click();
Thread.sleep(8000);
g1.window(driver);
driver.navigate().refresh();


}}