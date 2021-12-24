package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExecuteUpdate 
{

	Connection con=null;
	@Test
	public void executeUpdate() throws Throwable
	{
		try
		{
		//Register the datdabase
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		//Establish connection with database
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customers","root","root");
		//issue create statement
		Statement stat=con.createStatement();
		int result=stat.executeUpdate("insert into customer values('8','Aarohi','J','Mexico');");
		if(result==1)
		{
			System.out.println("customer created successfully");
		}

		else
		{
			System.out.println("query failed");
		}
		}
		catch(Exception e)
		{
			
			
		}
		finally
		{
			con.close();
		}
	
	}
		
}