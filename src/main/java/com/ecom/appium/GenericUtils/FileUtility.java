package com.ecom.appium.GenericUtils;

import java.io.FileInputStream;

import java.io.FileReader;

import java.util.Properties;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



public class FileUtility 
{
/*
 * author @Ashish
 */
	/**
	 * This method is used to read data from properties file and return value based on key specified
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	
	
	public String getPropertyKeyValue(String key) throws Throwable 
	{
		FileInputStream file=new FileInputStream(IPathConstant.PROPERTY);
		Properties prop=new Properties();
		prop.load(file);
		return prop.getProperty(key);
		
	}
	
	/**
	 * This method will return json value based on json key
	 * @param jsonKey
	 * @return
	 * @throws Throwable
	 */
	public String  getDataFromJson(String jsonKey) throws Throwable
	{
		FileReader reader=new FileReader(IPathConstant.JSON_FILEPATH);
		JSONParser parser=new JSONParser();
		Object object=parser.parse(reader);
		JSONObject jsonObject=(JSONObject)object;
		String value=jsonObject.get(jsonKey).toString();
		return value;
		
		
	}
	
	
	
}
