package generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;







import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class G_screenshot {

	public static void getPhoto(WebDriver a,String tcname) throws IOException 
	{
		String photos = "./photos/";
    Date d1 = new Date();
String d = d1.toString();
String date = d.replaceAll(":", "-");
File src = ((TakesScreenshot) a).getScreenshotAs(OutputType.FILE);
 File dst = new File(photos+date+tcname+".jpeg");
FileUtils.copyFile(src, dst);
 	}
	
	public static void Java_script_executor(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
	
	}
	
	}
