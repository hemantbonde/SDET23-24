package vTiger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ecom.appium.GenericUtils.FileUtility;
import com.ecom.appium.GenericUtils.IPathConstant;
import com.ecom.appium.GenericUtils.JavaUtility;
import com.ecom.appium.GenericUtils.WebDriverUtility;

public class Script1 
{

	/*

	@FindBy(xpath="\"//input[@name='user_name']\")).sendKeys(\"username\"")
	private WebElement un;
	
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement pswd;
	
	@FindBy(id="submitButton")
	private WebElement submit;
	
	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement org;
	
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createOrg;
	
	@FindBy(xpath="//input[@class='detailedViewTextBox']")
	private WebElement txtbox;
	
	@FindBy(xpath="//input[@name='website']")
	private WebElement website;
	
	@FindBy(id="phone")
	private WebElement phoneno;
	
	@FindBy(id="fax")
	private WebElement fax;
	
	@FindBy(id="email1")
	private WebElement email;
	
	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement savebtn;
	
	public Script1(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
	*/
	
	
	@Test
	public void script() throws Throwable
	{
		WebDriverUtility wb=new WebDriverUtility();
		FileUtility futil=new FileUtility();
		String URL=futil.getPropertyKeyValue("url");
		String USERNAME=futil.getPropertyKeyValue("username");
		String BROWSER=futil.getPropertyKeyValue("browser");
		FileInputStream fs=new FileInputStream(IPathConstant.PROPERTY);
		
		//Properties p=new Properties();
		//p.load(fs);
		//System.setProperty("webdriver.chrome.driver", "‪C:\\Users\\User1\\Downloads\\chromedriver.exe");
		
		WebDriver driver=null;
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		if(BROWSER.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		if(BROWSER.equalsIgnoreCase("IE"))
		{
			driver=new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		driver.get("url");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("username");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("password");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.xpath("//input[@class='detailedViewTextBox']")).sendKeys("Org1");
		driver.findElement(By.xpath("//input[@name='website']")).sendKeys("www.org1.org"+JavaUtility.getRandomData());
		driver.findElement(By.id("phone")).sendKeys("9049999438");
		driver.findElement(By.id("fax")).sendKeys("brtnoiAEnia");
		driver.findElement(By.id("email1")).sendKeys("org1@gamil.com");
		driver.findElement(By.xpath("//input[@value='  Save  ']")).click();		

		SoftAssert s=new SoftAssert();
		String title = driver.getTitle();
		s.assertEquals(title,"Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM");
		s.assertAll();	
		wb.alertPopupOk(driver);
		 
			
		WebElement signout = driver.findElement(By.xpath("//img[@style='padding: 0px;padding-left:5px']"));
		wb.mouseHover(driver, signout);
		driver.findElement(By.id("ondemand_sub")).click();
		 
	}
}


