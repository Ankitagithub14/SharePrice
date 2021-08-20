package Library;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utlity {
	
public static void CaptureScreenshot(WebDriver driver, String string)
	
	{
	  try {
		    TakesScreenshot ts = (TakesScreenshot)driver;
		    File source =ts.getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(source, new File("./Screenshot/"+string+".png"));
		    System.out.println("screeshot capture");
	} 
	  catch (Exception e) 
	  {
		System.out.println("exception while taking a screenshot"+e.getMessage());
		
	} 

 }

}
