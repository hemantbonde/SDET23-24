package com.ecom.appium.GenericUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class databaseUtils
{

	static Connection con=null;
	static ResultSet result=null;
	
	
	/**
	 * 
	 * @throws Throwable
	 */
	public void connectToDB() throws Throwable
	{
		Driver driverRef;
		driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
		
	}
	/**
	 * 
	 * 
	 * @throws Throwable
	 */
	public void closeDb() throws Throwable
	{
		con.close();
		
	}
	/**
	 * 
	 * @param query
	 * @return
	 * @throws Throwable
	 */
	public static ResultSet executeQuerty(String query) throws Throwable
	{
		result =con.createStatement().executeQuery(query);
		return result;
	}
	
	
	/**
	 * 
	 * @param query
	 * @param columnName
	 * @param expectedData
	 * @return
	 * @throws Throwable
	 */
	public static String executeQueryAndGetData(String query,int columnName,String expectedData) throws Throwable
	{
		boolean flag=false;
		result=con.createStatement().executeQuery(query);
		while(result.next())
		{
			if(result.getString(columnName).equals(expectedData))
			{
				flag=true;
				break;
			}
			
		}
	
		if(flag)
		{
			System.out.println(expectedData + "===> data verified in database table");
			return expectedData;
		}
			else
			{
				System.out.println(columnName +"===> data not verified in database table");
				return expectedData;
				
			}
		}
		
		
	}

