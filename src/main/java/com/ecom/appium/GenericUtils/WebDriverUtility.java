package com.ecom.appium.GenericUtils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebDriverUtility 
{
	/**
	 * 
	 * @param driver
	 */
	public void waitUntilPageLoad(WebDriver driver)
	{
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
	}
	
	public void waitForElementVisibility(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new  WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	/**
	 * 
	 * @param element
	 * @throws Throwable
	 */
	
	public void waitAndClick(WebElement element) throws Throwable
	{
		int count =0;
		while(count<40)
		{
			try
			{
				element.click();
				break;
			}
			catch(Throwable e)
			{
				Thread.sleep(1000);
				count++;
			}
		}
	}
	
	/**
	 * enables user to handle dropdown using visible text
	 * @param element
	 * @param option
	 */
	
	public void selectByText(WebElement element,String option)
	{
		Select select=new Select(element);
		select.selectByVisibleText(option);
	}
	public void selectByValue(String option,WebElement element)
	{
		Select select =new Select(element);
		select.selectByValue(option);
	}
	public void selectByIndex(WebElement element,int index)
	{
		Select select =new Select(element);
		select.selectByIndex(index);
	}

	
	public void mouseHover(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public void rightClick(WebElement element,WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.contextClick(element);
	}
	
	public void doubleClick(WebElement element,WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.doubleClick(element);
	}
	
	public void switchFrame(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	public void switchFrame(WebDriver driver,WebElement element) {
		driver.switchTo().frame(element);
	}
	public void switchFrame(WebDriver driver,String idOrName) {
		driver.switchTo().frame(idOrName);
	}
	
	
	public void switchFrame(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	
	public void alertPopupOk(WebDriver driver)
	{
		driver.switchTo().alert().accept();
		
	}
	
	public void alertPopupCancel(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	
	public void switchToWindow(WebDriver driver,String partialWinTitle)
	{
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		while(it.hasNext())
		{
			String winID=it.next();
			String title=driver.switchTo().window(winID).getTitle();
			if(title.contains(partialWinTitle))
			{
				break;
			}
		}
	}
	public void dropDown(WebElement ele,String txt) 
	{
		Select s=new Select(ele);
		s.selectByVisibleText(txt);
		
	}
	
	public void scrollToWebElement(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		int y=element.getLocation().getY();
		js.executeScript("window.scrollBy(0,"+y+")",element);
		
	}
	
	public String takeScreenShot(WebDriver driver,String screenshotName) throws Throwable
	{
		String screenshotPath="./screenshot/"+screenshotName+JavaUtility.getCurrentDate()+".PNG";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(screenshotPath);
		Files.copy(src, dest);
		return screenshotPath;
		
	}
	
	public void pressEnterKey() throws Throwable
	{
		Robot rc=new Robot();
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);
	}
	
	
	
	
	

}
