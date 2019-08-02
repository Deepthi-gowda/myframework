package scripts;

import generic.Generic_Test;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pom.Itempage;
import pom.Loginpage;
import generic.Generic_Test;
import pom.Homepage;



public class Script2 extends Generic_Test {


		
		@Test(priority = 1)
		public void item() throws InterruptedException, AWTException
		{
			Loginpage l1 = new Loginpage(driver);
			l1.loginpage();
			l1.search();
			Homepage h1 = new Homepage(driver);
			h1.Select_item();
		Itempage i1 = new Itempage(driver);
		i1.addtocart();

		}

	

}
