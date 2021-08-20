package SharePriceCenter;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import SharePriceCenter.GetData;


//import Library.Utility;
import Library.Utlity;



public class SharePriceCenter_Elite extends GetData { 
	WebDriver driver;
	
    @Test
	public void share_price() {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriverold.exe");
		//C:\\SharePriceCenter\\SharePriceCenter\\driver\\
		//C:\Users\ankita.bhardwaj\Downloads\chromedriver_win32 (1)
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.navigate().to("https://guest:y52NtJ@n@connectid-profile-v2.did1-e1.investis.com/en/share-price-center-elite");
		//driver.get("https://yahoo.com");
		//https://guest:y52NtJ@n@connectid-profile-v2.did1-e1.investis.com/en/share-price-center-elite
		driver.manage().window().maximize();
		String page_message= driver.findElement(By.cssSelector("h1")).getText();
		System.out.println(page_message);
		//if (page_message.contentEquals("Share Price Center - Elite"))
			System.out.println("correct page1");
		//else 
			//System.out.println("landed at wrong page");
			//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			//String snapshotbox = driver.findElement(By.xpath("//*[@class='cid-snapshot-box']")).getText();
			//System.out.println(snapshotbox);
	}
 
    @AfterMethod
     public void tearDown(ITestResult result)
    {
    	if(ITestResult.SUCCESS== result.getStatus())
    	{
    		Utlity.CaptureScreenshot(driver,result.getName());
    	}
    	driver.quit();
    }
    
    //String value= GetData.testBody();
			
 
   
   


}
 
 
