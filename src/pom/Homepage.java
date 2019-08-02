package pom;

import generic.Base_page;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Homepage extends Base_page {
	
	@FindBy(xpath=("//div[@class='_1vC4OE']"))
	private List<WebElement> price;
	@FindBy(xpath=("//div[@data-id = 'WATF9M64KCWZHTCB']/div/a"))
	private WebElement item;
	public Homepage(WebDriver driver)
	{
		super(driver);
	}
	public void Select_high_price() throws InterruptedException
	{
	String title = driver.getTitle();
	System.out.println(title);
	Base_page.verifyTitle(title);
	int count = price.size();
	int largestprice = 0;
	int elementIndex = 0;
      int j= 0;
      Map m1 = new HashMap();
      for (WebElement we : price) {
		m1.put(we, we.getText());
		
	}
     
     
    int size = m1.size();
      {
    	  for(int i = 0;i<1;i++)
   {
		Collection text = m1.values();
		System.out.println(text);
	}
      }
    	  
     
      
//      String s1 = "123";
//      Integer.p
//	int arr[] = new int[count];
//	for (int i = 1; i<count;i++)
//	{
//		WebElement we = price.get(i);
//		String text = we.getText();
//		Thread.sleep(3000);
//		int length = text.length();
//		int cost = Integer.parseInt(text.replaceAll(",", "").substring(1,length-1));
//		arr[i]=cost;
//		if(cost > largestprice)
//		{
//			largestprice = cost;
//			elementIndex = j;
//			
//		}
//		j++;
//		
//	}
//	int arrsize = arr.length;
//	System.out.println(largestprice+"array size="+arrsize+"j value"+j);
	
	
//	JavascriptExecutor jse = (JavascriptExecutor) driver;
//	
//	try{
//	jse.executeScript("arguments[0].scrollintoview(true)", price.get(elementIndex-1));
//	}
//	catch(Exception e)
//	{}
	WebDriverWait wait = new WebDriverWait(driver,20);
	
	wait.until(ExpectedConditions.elementToBeClickable(price.get(elementIndex)));
	price.get(elementIndex).click();
	
	//		int n = arr.length;
//		int temp=0;
//for (int i= 0;i<n;i++) {
//	for (int j=1;j<n;j++)
//	{if(arr[j-1]>arr[j])
//	{
//		temp = arr[j-1];
//		arr[j-1] = arr[j];
//		arr[j] = temp;
//	}
//	}
//	
//System.out.println("cost after sort");
//for(int i = 0;i<arr.length;i++)
//{Thread.sleep(3000);
//System.out.println(arr[i]);	
//}
//Thread.sleep(3000);
//item.click();
//}	

}
	public void Select_item()
	{
		item.click();
	}


}

