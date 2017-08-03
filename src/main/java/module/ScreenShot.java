/*
 * author：zuohaitao
 */
package module;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot                                                                             
{
	public static void takeScreenShot(WebDriver driver)
	{
		File screenShotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);         
		try
		{
			FileUtils.copyFile(screenShotFile,
					new File("screenshot/" + getDatePath() + "/" + getCurrentDateTime() + ".jpg")); 
		} catch (IOException e)
		{
			e.printStackTrace();                                                                   
		}
	}

	public static String getCurrentDateTime()                                                        
	{
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd_HHmmss");                               
		return df.format(new Date());
	}

	public static File getDatePath()                                                                
	{ 
		Date date = new Date();
		String path = new SimpleDateFormat("yyyyMMdd").format(date);                                 
		File f = new File(path);                                                                   
		return f;
	}
}
