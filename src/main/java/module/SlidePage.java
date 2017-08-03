/*
 * author：zuohaitao
 */
package module;

import java.util.HashMap;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class SlidePage 
{
	public void Guide_Page(AppiumDriver driver) throws InterruptedException
	{
		for (int i = 0; i < 3; i++)
		{
			int startx = -1;
			int starty = -1;
			int endx = -1;
			int endy = -1;
			Thread.sleep(3000);
			WebElement screen = driver.findElementById("com.life:id/pager");
			Point point = screen.getLocation();
			Dimension size = screen.getSize();
			endx = point.getX();
			endy = point.getY() + size.getHeight() / 2;
			startx = point.getX() + size.getWidth() - 5;
			starty = endy;
			driver.swipe(startx, starty, endx, endy, 700);
		}
		Thread.sleep(3000);
		driver.findElement(By.id("com.life:id/next")).click();
		Thread.sleep(2000);
	}

	public void Down_Page(String xpath, AppiumDriver driver) throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElementByXPath(xpath);
		HashMap<String, Double> flickObject = new HashMap<String, Double>();
		flickObject.put("startX", 0.5);
		flickObject.put("startY", 0.8);
		flickObject.put("endX", 0.6);
		flickObject.put("endY", 0.2);
		flickObject.put("element", Double.valueOf(((RemoteWebElement) element).getId()));
		js.executeScript("mobile: flick", flickObject);
	}

	public void DownPage(String id, AppiumDriver driver) throws InterruptedException
	{
		int starty = -1;
		int startx = -1;
		int endx = -1;
		int endy = -1;
		Thread.sleep(3000);
		WebElement screen = driver.findElementById(id);
		Point point = screen.getLocation();
		Dimension size = screen.getSize();
		endy = point.getY();
		endx = point.getX() + size.getHeight() / 2;
		starty = point.getY() + size.getWidth() - 5;
		startx = endx;
		driver.swipe(startx, starty, endx, endy, 700);
		Thread.sleep(3000);
	}

	public void Left_Page(String xpath, AppiumDriver driver) throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElementByXPath(xpath);
		HashMap<String, Double> flickObject = new HashMap<String, Double>();
		flickObject.put("startX", 0.8);
		flickObject.put("startY", 0.5);
		flickObject.put("endX", 0.2);
		flickObject.put("endY", 0.5);
		flickObject.put("element", Double.valueOf(((RemoteWebElement) element).getId()));
		js.executeScript("mobile: flick", flickObject);
	}

	public void swipeToUp(int during, AppiumDriver driver)
	{
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		driver.swipe(width / 2, height * 3 / 4, width / 2, height / 4, during);
	}

	public void swipeToDown(int during, AppiumDriver driver)
	{
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		driver.swipe(width / 2, height / 4, width / 2, height * 3 / 4, during);
	}

	public void swipeToLeft(int during, AppiumDriver driver)
	{
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		driver.swipe(width * 3 / 4, height / 2, width / 4, height / 2, during);
	}

	public void swipeToRight(int during, AppiumDriver driver)
	{
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		driver.swipe(width / 4, height / 2, width * 3 / 4, height / 2, during);
	}

}
