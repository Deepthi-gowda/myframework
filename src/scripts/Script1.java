package scripts;

import java.awt.AWTException;

import org.testng.annotations.Test;

import generic.Generic_Test;
import pom.Homepage;
import pom.Itempage;
import pom.Loginpage;

public class Script1 extends Generic_Test
{
@Test
public void login() throws InterruptedException, AWTException
{
	Loginpage l1 = new Loginpage(driver);
	l1.loginpage();
	l1.search();
	Homepage h1 = new Homepage(driver);

	h1.Select_high_price();
	Itempage i1 = new Itempage(driver);
	i1.addtocart();
	l1.cart();
	l1.remove();
	l1.myaccount();
	l1.logout();
}

}
