package com.ecom.appium.Pomclasses;
import java.net.URL;
import org.openqa.selenium.support.PageFactory;

import com.ecom.appium.GenericUtils.WebDriverUtilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GeneralStoreLoginPage extends WebDriverUtilities 
{
	
	AndroidDriver driver;
	@AndroidFindBy(xpath = "//android.widget.TextView[@id='android:id/text1']")
	private MobileElement countryDD;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	private MobileElement nameTF;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/radioMale")
	private MobileElement radioMale;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/radioFemale")
	private MobileElement radioFemale;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	private MobileElement letsShopbtn;

	public AndroidDriver getDriver() {
		return driver;
	}

	public MobileElement getCountryDD() 
	{
		
		return countryDD;
	}

	public MobileElement getNameTF() {
		return nameTF;
	}

	public MobileElement getRadioMale() {
		return radioMale;
	}

	public MobileElement getRadioFemale() {
		return radioFemale;
	}

	public MobileElement getLetsShopbtn() {
		return letsShopbtn;
	}

	public GeneralStoreLoginPage(AndroidDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void login(String name)
	{
		nameTF.sendKeys(name);
		radioFemale.click();
		letsShopbtn.click();
	}
	
	public void logins()
	{
		nameTF.sendKeys("Meghna");
		radioFemale.click();
		letsShopbtn.click();
	}
	
	
}
