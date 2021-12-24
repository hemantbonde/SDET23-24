package com.ecom.appium.GenericUtils;


import java.util.Date;
import java.util.Random;

import org.testng.annotations.Test;

public class JavaUtility 
{
	
	//This method is used to generate random number to avoid duplicates

	public static String getRandomData()
	{
		
		Random random=new Random();
		int ran=random.nextInt(1000);
		return ""+ran;
		
	}
	
	
	//This method is used to generate currentdate
	public static String getCurrentDate()
	{
		Date date=new Date();
		String currentdate=date.toString();
		return currentdate;
	}
	
}
