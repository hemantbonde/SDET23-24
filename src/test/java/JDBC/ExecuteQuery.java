package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;


public class ExecuteQuery 
{
	@Test
public void executeQuery() throws Throwable
{
Driver driverref=new Driver();
DriverManager.registerDriver(driverref);

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customers","root","root");
Statement stat=con.createStatement();
//execute query
ResultSet result=stat.executeQuery("select * from customer;");

while(result.next())
{
	System.out.println(result.getString(2));
}

}
}

