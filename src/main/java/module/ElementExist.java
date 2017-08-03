/*
 * author：zuohaitao
 */
package module;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class ElementExist 
{
	public static String result;

	//1. 封装xpath
	public String waitForElementByXpath(final String ID, AppiumDriver driver)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, 18);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ID)));
			if (null == wait)
			{
				ScreenShot.takeScreenShot(driver); 
				result = "failed";
				Assert.assertTrue(false);
			} else
			{
				result = "pass";
			}
		} catch (Exception e)
		{
			ScreenShot.takeScreenShot(driver); 
			result = "failed";
			Assert.assertTrue(false);
		}
		return result;
	}
	//2. 封装 name
	public String waitForElementByName(final String ID, AppiumDriver driver)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, 18);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.name(ID)));
			if (null == wait)
			{
				ScreenShot.takeScreenShot(driver);
				result = "failed";
				Assert.assertTrue(false);
			} else
			{
				result = "pass";
			}
		} catch (Exception e)
		{
			ScreenShot.takeScreenShot(driver);
			result = "failed";
			System.out.print(result);
			Assert.assertTrue(false);
		}
		return result;
	}

	public String waitForElementByNameSkip(final String ID, AppiumDriver driver)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, 18);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.name(ID)));
			if (null == wait)
			{
				ScreenShot.takeScreenShot(driver);
				result = "failed";
			} else
			{
				result = "pass";
			}
		} catch (Exception e)
		{
			ScreenShot.takeScreenShot(driver);
			result = "failed";
			Assert.assertTrue(false);
		}
		return result;
	}
    //3. 封装  id
	public String waitForElementById(final String ID, AppiumDriver driver)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, 18);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(ID)));
			if (null == wait)
			{
				ScreenShot.takeScreenShot(driver);
				result = "failed";
				Assert.assertTrue(false);
			} else
			{
				result = "pass";
			}

		} catch (Exception e)
		{
			ScreenShot.takeScreenShot(driver);
			result = "failed";
			Assert.assertTrue(false);
		}
		return result;
	}
	//4. 封装classname
	public String waitForElementByClassName(final String ID, AppiumDriver driver)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, 18);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.className(ID)));
			if (null == wait)
			{
				ScreenShot.takeScreenShot(driver);
				result = "failed";
				Assert.assertTrue(false);
			} else
			{
				result = "pass";
			}

		} catch (Exception e)
		{
			ScreenShot.takeScreenShot(driver);
			result = "failed";
			Assert.assertTrue(false);
		}
		return result;
	}
	//5. 封装 cssSelector
	public String waitForElementByCssSelector(final String ID, AppiumDriver driver)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, 18);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(ID)));
			if (null == wait)
			{
				ScreenShot.takeScreenShot(driver);
				result = "failed";
				Assert.assertTrue(false);
			} else
			{
				result = "pass";
			}

		} catch (Exception e)
		{
			ScreenShot.takeScreenShot(driver);
			result = "failed";
			Assert.assertTrue(false);
		}
		return result;
	}
	//6. 封装 tagName
	public String waitForElementByTagName(final String ID, AppiumDriver driver)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, 18);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName(ID)));
			if (null == wait)
			{
				ScreenShot.takeScreenShot(driver);
				result = "failed";
				Assert.assertTrue(false);
			} else
			{
				result = "pass";
			}

		} catch (Exception e)
		{
			ScreenShot.takeScreenShot(driver);
			result = "failed";
			Assert.assertTrue(false);
		}
		return result;
	}
	//7. 封装 linkText
	public String waitForElementByLinkText(final String ID, AppiumDriver driver)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, 18);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(ID)));
			if (null == wait)
			{
				ScreenShot.takeScreenShot(driver);
				result = "failed";
				Assert.assertTrue(false);
			} else
			{
				result = "pass";
			}

		} catch (Exception e)
		{
			ScreenShot.takeScreenShot(driver);
			result = "failed";
			Assert.assertTrue(false);
		}
		return result;
	}
}
