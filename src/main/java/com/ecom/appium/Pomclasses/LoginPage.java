package com.ecom.appium.Pomclasses;
import org.openqa.selenium.support.PageFactory;

import com.ecom.appium.GenericUtils.WebDriverUtilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage
{
	public AndroidDriver driver;

	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Spinner/android.widget.TextView")
	private MobileElement countryDD;
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	private MobileElement nameTf;
	@AndroidFindBy(id="com.androidsample.generalstore:id/radioMale")
	private MobileElement maleRB;
	@AndroidFindBy(id="com.androidsample.generalstore:id/radioFemale")
	private MobileElement femaleRB;
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	private MobileElement loginBtn;
	
	
	public LoginPage(AndroidDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver));	
	}


	public AndroidDriver getDriver() {
		return driver;
	}


	/*public MobileElement getCountryDD() {
		return countryDD;
	}*/


	public MobileElement getNameTf() {
		return nameTf;
	}


	public MobileElement getMaleRB() {
		return maleRB;
	}


	public MobileElement getFemaleRB() {
		return femaleRB;
	}


	public MobileElement getLoginBtn() {
		return loginBtn;
	}
	
	public void logins()
	{
		
		maleRB.click();
		nameTf.sendKeys("ashish");
		loginBtn.click();
	
		
	}
	
	
	public void login(String name)
	{
		
		maleRB.click();
		nameTf.sendKeys(name);
		loginBtn.click();
		
		
	}
	
	
	/*public static void scrollToElement(AndroidDriver driver,String an,String av)
    {
    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
    }
	*/
	
	
	
}
