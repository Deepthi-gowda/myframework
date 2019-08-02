package scripts;

import java.awt.AWTException;

import generic.Generic_Test;
import generic.Generic_action;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pom.Homepage;
import pom.Itempage;
import pom.Itempage1;
import pom.Loginpage;



public class Script3 extends Generic_Test{
	
	@Test
	public void select_item() throws InterruptedException
	{
		Loginpage l1 = new Loginpage(driver);
		l1.loginpage();
//		l1.search();
		Itempage1 i1 = new Itempage1(driver);
			i1.mousehover();
//		Homepage h1 = new Homepage(driver);
//			h1.Select_item();
//		Itempage i2 = new Itempage(driver);
//	i2.addtocart();
	
	}

	
}
