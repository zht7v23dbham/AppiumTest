/*
 * author：zuohaitao
 */


import io.appium.java_client.AppiumDriver;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import jxl.read.biff.BiffException;
import file.AutoTestExcelFile;
import file.AutoTestCaseID;
import module.InitSetup;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AutoLoginTest{
	AppiumDriver driver;
	AutoTestExcelFile fesm = new AutoTestExcelFile();             
	InitSetup is = new InitSetup();                               
	AutoTestCaseID tcId = new AutoTestCaseID();                   

	@BeforeClass
	public void beforeClass() throws BiffException, IOException   
	{
		fesm.SetContentInit((short) 10);                         
	}

	@BeforeMethod
	public void beforeMethod() throws MalformedURLException, InterruptedException 
	{
		driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), is.InitSetupCFG(new DesiredCapabilities()));
	}

	@Test
	public void My_Login_001() throws InterruptedException, BiffException, IOException 
	{
		tcId.TestcaseId(driver, "");
	}

	@AfterMethod
	public void afterMethod()                                     
	{
		driver.quit();                                            
	}
}
