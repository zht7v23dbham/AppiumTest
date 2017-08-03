/*
 * author：zuohiatao
 */
package module;

import io.appium.java_client.AppiumDriver;

import java.io.File;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InitSetup 
{
	public DesiredCapabilities InitSetupCFG(final DesiredCapabilities capabilities) throws MalformedURLException
	{ 
		if (Config.CONFIG_FILE.equals("android_config.properties"))
		{
			final File appDir = new File(System.getProperty("user.dir"), "app");
			final File app = new File(appDir, Config.getInstance().getCfg("appDir"));
			capabilities.setCapability("noReset", true);                                // 不需要再次安装APP
			capabilities.setCapability("app", Config.getInstance().getCfg("app"));
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			capabilities.setCapability("platformVersion", Config.getInstance().getCfg("platformVersion"));        
			capabilities.setCapability("platformName", Config.getInstance().getCfg("platformName"));
			//指定测试机的ID,通过adb命令`adb devices`获取 54f60681 #OPPO   D1CGAPF711304042 #nokia  #金色小米  57b0b87a
			capabilities.setCapability("deviceName", Config.getInstance().getCfg("deviceName"));                  
			capabilities.setCapability("appPackage", Config.getInstance().getCfg("appPackage"));                  
			capabilities.setCapability("appActivity", Config.getInstance().getCfg("appActivity"));                
			capabilities.setCapability("unicodeKeyboard", Config.getInstance().getCfg("unicodeKeyboard"));        
			capabilities.setCapability("resetKeyboard", Config.getInstance().getCfg("resetKeyboard"));            
			capabilities.setCapability("newCommandTimeout", Config.getInstance().getCfg("newCommandTimeout"));    
		} else if (Config.CONFIG_FILE.equals("ios_config.properties"))
		{
			final File appDir = new File(System.getProperty("user.dir"), "app");
			final File app = new File(appDir, Config.getInstance().getCfg("appDir"));                             
			capabilities.setCapability("platformVersion", Config.getInstance().getCfg("platformVersion"));        
			capabilities.setCapability("platformName", Config.getInstance().getCfg("platformName"));              
			capabilities.setCapability("deviceName", Config.getInstance().getCfg("deviceName"));                  
			capabilities.setCapability("udid", Config.getInstance().getCfg("udid"));                              
			capabilities.setCapability("app", Config.getInstance().getCfg("app"));                                
			return capabilities;
		}
		return capabilities;
	}

	public void TearDownCFG(AppiumDriver driver) throws MalformedURLException
	{
		driver.quit();
	}
}
