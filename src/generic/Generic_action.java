package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Generic_action {
	 Actions act ;
 Select s;
	public	Generic_action(WebElement ele)
	{
	s= new Select(ele);
		
	}
	
public	Generic_action(WebDriver driver)
	{
	 act= new Actions(driver);
		
	}

	
	public   void mousehover(WebElement ele) {
		
act.moveToElement(ele).perform();
		

	}
	public  void dragdrop(WebDriver driver , WebElement src ,WebElement tar) {
		
		act.dragAndDrop(src, tar).perform();
	
			}
	
	public  void doubleclk(WebDriver driver , WebElement ele ) {
		
		act.doubleClick(ele).perform();
	
			}
	
	
	public  void rightclick(WebDriver driver , WebElement ele ) {
		
		act.contextClick(ele).perform();
	
			}
	
	public  void selctindex(int i)
	{
		s.selectByIndex(i);
	}
	public  void selctvalue(WebElement ele,String value)
	{
	s.selectByValue(value);
	}
	public  void selecttext(WebElement ele,String value)
	{
		s.selectByVisibleText(value);
	}
	
	public  void deselctindex(WebElement ele,int i)
	{
		s.deselectByIndex(i);
	}
	public  void deselctvalue(WebElement ele,String value)
	{
	s.deselectByValue(value);
	}
	public  void deselecttext(WebElement ele,String value)
	{
		s.deselectByVisibleText(value);
	}
	
	public  void selectalloption()
	{
		s.getOptions();
	}
	public  void selectfirstoption()
	{
	s.getFirstSelectedOption();
	}
	public  void selectoption()
	{
		s.getAllSelectedOptions();
	}
	
}