/*
 * author：zuohaitao
 */
package file;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import java.io.IOException;
import jxl.read.biff.BiffException;
import log.AutoLogger;
import module.ElementExist;
import module.SlidePage;
import module.AssertPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AutoTestCaseID   
{
	ElementExist el = new ElementExist();                  
	static AutoTestExcelFile ft = new AutoTestExcelFile();  
	SlidePage sp = new SlidePage();                         

	public void TestcaseId(AppiumDriver driver, String id) throws InterruptedException, BiffException, IOException
	{                                                      
		int i, j, k, l, m, n, o, p, q;                      
		for (i = 0; i < ft.ReadContent().size(); i++)
		{
			if (ft.ReadContent().get(i).contains(id))
			{
				for (j = 0; j < ft.ReadTitle().size(); j++)
				{
					if (ft.ReadTitle().get(j).contains("定位方式"))
					{
						break;
					}
				}
				String caseidLocation = ft.ReadTitleContent(i + 1, j);

				for (k = 0; k < ft.ReadTitle().size(); k++)
				{
					if (ft.ReadTitle().get(k).contains("控件元素"))
					{
						break;
					}
				}
				String caseidElement = ft.ReadTitleContent(i + 1, k);

				for (l = 0; l < ft.ReadTitle().size(); l++)
				{
					if (ft.ReadTitle().get(l).contains("操作方法"))
					{
						break;
					}
				}
				String caseidOperationMethod = ft.ReadTitleContent(i + 1, l);

				for (m = 0; m < ft.ReadTitle().size(); m++)
				{
					if (ft.ReadTitle().get(m).contains("测试数据"))
					{
						break;
					}
				}
				String caseidTestData = ft.ReadTitleContent(i + 1, m);

				for (n = 0; n < ft.ReadTitle().size(); n++)
				{
					if (ft.ReadTitle().get(n).contains("验证数据"))
					{
						break;
					}
				}
				String caseidVerifyData = ft.ReadTitleContent(i + 1, n);

				for (o = 0; o < ft.ReadTitle().size(); o++)
				{
					if (ft.ReadTitle().get(o).contains("延迟时间"))
					{
						break;
					}
				}
				String SleepTime = ft.ReadTitleContent(i + 1, o);

				if (caseidLocation.equals("By.xpath"))
				{
					if (caseidOperationMethod.equals("sendkeys"))
					{
						el.waitForElementByXpath(caseidElement, driver);
						driver.findElement(By.xpath(caseidElement)).sendKeys(caseidTestData);
						if (SleepTime != null && SleepTime.length() != 0)
						{
							String StepTime = SleepTime.substring(0, SleepTime.indexOf("."));
							Thread.sleep(Integer.parseInt(StepTime));
						}
					} else if (caseidOperationMethod.equals("click"))
					{
						el.waitForElementByXpath(caseidElement, driver);
						driver.findElement(By.xpath(caseidElement)).click();
						if (SleepTime != null && SleepTime.length() != 0)
						{
							String StepTime = SleepTime.substring(0, SleepTime.indexOf("."));
							Thread.sleep(Integer.parseInt(StepTime));
						}
					} else if (caseidOperationMethod.equals("clear")){
						el.waitForElementByXpath(caseidElement, driver);
						driver.findElement(By.xpath(caseidElement)).clear();
						if (SleepTime != null && SleepTime.length() != 0)
						{
							String StepTime = SleepTime.substring(0, SleepTime.indexOf("."));
							Thread.sleep(Integer.parseInt(StepTime));
						}

					}else if (caseidOperationMethod.equals("text")){
						el.waitForElementByXpath(caseidElement, driver);
						driver.findElement(By.xpath(caseidElement)).getText();
						if (SleepTime != null && SleepTime.length() != 0)
						{
							String StepTime = SleepTime.substring(0, SleepTime.indexOf("."));
							Thread.sleep(Integer.parseInt(StepTime));
						}

					}else if (caseidOperationMethod.equals("swipedown"))
					{
						el.waitForElementByXpath(caseidElement, driver);
						sp.Down_Page(caseidElement, driver);
						if (SleepTime != null && SleepTime.length() != 0)
						{
							String StepTime = SleepTime.substring(0, SleepTime.indexOf("."));
							Thread.sleep(Integer.parseInt(StepTime));
						}
					}

				} else if (caseidLocation.equals("By.id"))
				{
					if (caseidOperationMethod.equals("sendkeys"))
					{
						el.waitForElementById(caseidElement, driver);
						driver.findElement(By.id(caseidElement)).sendKeys(caseidTestData);
						if (SleepTime != null && SleepTime.length() != 0)
						{
							// String StepTime =
							// SleepTime.substring(0,SleepTime.indexOf("."));
							Thread.sleep(Integer.parseInt(SleepTime));
						}
					} else if (caseidOperationMethod.equals("click"))
					{
						el.waitForElementById(caseidElement, driver);
						driver.findElement(By.id(caseidElement)).click();
						if (SleepTime != null && SleepTime.length() != 0)
						{
							// String StepTime =
							// SleepTime.substring(0,SleepTime.indexOf("."));
							Thread.sleep(Integer.parseInt(SleepTime));
						}
					} else if (caseidOperationMethod.equals("text"))
					{
						el.waitForElementById(caseidElement, driver);
						driver.findElement(By.id(caseidElement)).getText();
						if (SleepTime != null && SleepTime.length() != 0)
						{
							// String StepTime =
							// SleepTime.substring(0,SleepTime.indexOf("."));
							Thread.sleep(Integer.parseInt(SleepTime));
						}
					} else if (caseidOperationMethod.equals("clear"))
					{
						el.waitForElementById(caseidElement, driver);
						driver.findElement(By.id(caseidElement)).clear();
						if (SleepTime != null && SleepTime.length() != 0)
						{
							// String StepTime =
							// SleepTime.substring(0,SleepTime.indexOf("."));
							Thread.sleep(Integer.parseInt(SleepTime));
						}
					}
					else if (caseidOperationMethod.equals("swipedown"))
					{
						el.waitForElementById(caseidElement, driver);
						sp.Down_Page(caseidElement, driver);
						if (SleepTime != null && SleepTime.length() != 0)
						{
							String StepTime = SleepTime.substring(0, SleepTime.indexOf("."));
							Thread.sleep(Integer.parseInt(StepTime));
						}
					} else if (caseidOperationMethod.equals("DownPage"))
					{
						el.waitForElementById(caseidElement, driver);
						sp.DownPage(caseidElement, driver);
						if (SleepTime != null && SleepTime.length() != 0)
						{
							// String StepTime =
							// SleepTime.substring(0,SleepTime.indexOf("."));
							Thread.sleep(Integer.parseInt(SleepTime));
						}
					}
				} else if (caseidLocation.equals("By.name"))
				{
					if (caseidOperationMethod.equals("sendkeys"))
					{
						el.waitForElementByName(caseidElement, driver);
						driver.findElement(By.name(caseidElement)).sendKeys(caseidTestData);
						if (SleepTime != null && SleepTime.length() != 0)
						{
							String StepTime = SleepTime.substring(0, SleepTime.indexOf("."));
							Thread.sleep(Integer.parseInt(StepTime));
						}
					} else if (caseidOperationMethod.equals("click"))
					{
						el.waitForElementByName(caseidElement, driver);
						driver.findElement(By.name(caseidElement)).click();
						if (SleepTime != null && SleepTime.length() != 0)
						{
							// String StepTime =
							// SleepTime.substring(0,SleepTime.indexOf("."));
							Thread.sleep(Integer.parseInt(SleepTime));
						}
					} else if (caseidOperationMethod.equals("press"))
					{
						el.waitForElementByName(caseidElement, driver);
						WebElement e = driver.findElement(By.name(caseidElement)); // 长按
																						// 拍视频
						TouchAction action = new TouchAction(driver);
						action.press(e).waitAction(5000);
						action.perform();
						if (SleepTime != null && SleepTime.length() != 0)
						{
							String StepTime = SleepTime.substring(0, SleepTime.indexOf("."));
							Thread.sleep(Integer.parseInt(StepTime));
						}
					}
				}
				else if (caseidLocation.equals("By.cssSelector"))
				{
					if (caseidOperationMethod.equals("sendkeys"))
					{
						el.waitForElementByCssSelector(caseidElement, driver);
						driver.findElement(By.id(caseidElement)).sendKeys(caseidTestData);
						if (SleepTime != null && SleepTime.length() != 0)
						{
							// String StepTime =
							// SleepTime.substring(0,SleepTime.indexOf("."));
							Thread.sleep(Integer.parseInt(SleepTime));
						}
					} else if (caseidOperationMethod.equals("click"))
					{
						el.waitForElementByCssSelector(caseidElement, driver);
						driver.findElement(By.id(caseidElement)).click();
						if (SleepTime != null && SleepTime.length() != 0)
						{
							// String StepTime =
							// SleepTime.substring(0,SleepTime.indexOf("."));
							Thread.sleep(Integer.parseInt(SleepTime));
						}
					} else if (caseidOperationMethod.equals("swipedown"))
					{
						el.waitForElementByCssSelector(caseidElement, driver);
						sp.Down_Page(caseidElement, driver);
						if (SleepTime != null && SleepTime.length() != 0)
						{
							String StepTime = SleepTime.substring(0, SleepTime.indexOf("."));
							Thread.sleep(Integer.parseInt(StepTime));
						}
					} else if (caseidOperationMethod.equals("DownPage"))
					{
						el.waitForElementByCssSelector(caseidElement, driver);
						sp.DownPage(caseidElement, driver);
						if (SleepTime != null && SleepTime.length() != 0)
						{
							// String StepTime =
							// SleepTime.substring(0,SleepTime.indexOf("."));
							Thread.sleep(Integer.parseInt(SleepTime));
						}
					}
				}
				else if (caseidLocation.equals("By.driver"))
				{
					if (caseidOperationMethod.equals("swipetoup"))
					{
						// el.waitForElementById(caseidObjectEntity, driver);
						sp.swipeToUp(Integer.parseInt(caseidElement), driver);
						if (SleepTime != null && SleepTime.length() != 0)
						{
							String StepTime = SleepTime.substring(0, SleepTime.indexOf("."));
							Thread.sleep(Integer.parseInt(StepTime));
						}
					}
				} else if (caseidLocation.equals("By.name"))
				{
					if ("pass".equals(el.waitForElementByNameSkip(caseidElement, driver)))
					{
						if (caseidOperationMethod.equals("click"))
						{
							// el.waitForElementByName(caseidObjectEntity,
							// driver);
							driver.findElement(By.name(caseidElement)).click();
							if (SleepTime != null && SleepTime.length() != 0)
							{
								String StepTime = SleepTime.substring(0, SleepTime.indexOf("."));
								Thread.sleep(Integer.parseInt(StepTime));
							}
						}
					} else if ("failed".equals(el.waitForElementByNameSkip(caseidElement, driver)))
					{
						continue;
					}
				} else  if (caseidLocation.equals("By.className"))
				{
					if (caseidOperationMethod.equals("sendkeys"))
					{
						el.waitForElementByClassName(caseidElement, driver);
						driver.findElement(By.className(caseidElement)).sendKeys(caseidTestData);
						if (SleepTime != null && SleepTime.length() != 0)
						{
							String StepTime = SleepTime.substring(0, SleepTime.indexOf("."));
							Thread.sleep(Integer.parseInt(StepTime));
						}
					} else if (caseidOperationMethod.equals("click"))
					{
						el.waitForElementByClassName(caseidElement, driver);
						driver.findElement(By.className(caseidElement)).click();
						if (SleepTime != null && SleepTime.length() != 0)
						{
							String StepTime = SleepTime.substring(0, SleepTime.indexOf("."));
							Thread.sleep(Integer.parseInt(StepTime));
						}
					} else if (caseidOperationMethod.equals("clear")){
						el.waitForElementByClassName(caseidElement, driver);
						driver.findElement(By.className(caseidElement)).clear();
						if (SleepTime != null && SleepTime.length() != 0)
						{
							String StepTime = SleepTime.substring(0, SleepTime.indexOf("."));
							Thread.sleep(Integer.parseInt(StepTime));
						}

					}else if (caseidOperationMethod.equals("text")){
						el.waitForElementByClassName(caseidElement, driver);
						driver.findElement(By.className(caseidElement)).getText();
						if (SleepTime != null && SleepTime.length() != 0)
						{
							String StepTime = SleepTime.substring(0, SleepTime.indexOf("."));
							Thread.sleep(Integer.parseInt(StepTime));
						}

					}else if (caseidOperationMethod.equals("swipedown"))
					{
						el.waitForElementByClassName(caseidElement, driver);
						sp.Down_Page(caseidElement, driver);
						if (SleepTime != null && SleepTime.length() != 0)
						{
							String StepTime = SleepTime.substring(0, SleepTime.indexOf("."));
							Thread.sleep(Integer.parseInt(StepTime));
						}
					}

				}

				if (caseidVerifyData != null && caseidVerifyData.length() != 0)
				{
					//el.waitForElementByName(caseidVerifyData, driver);
					AssertPage.AssertEquals(caseidVerifyData,caseidTestData,"测试"+caseidVerifyData+"和"+caseidTestData+"不一致" ,driver);
					AutoLogger.log("测试"+caseidVerifyData+"和"+caseidTestData+"不一致");
				}

				for (p = 0; p < ft.ReadTitle().size(); p++)
				{
					if (ft.ReadTitle().get(p).contains("测试结果"))
					{
						break;
					}
				}
				ft.WriteTitleContent(i + 1, (short) p);
			}
		}
		Thread.sleep(3000);
	}
}
