package JDBC;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadingDataFromXML 
{
	@Test
public void datafromxml(XmlTest xml)
{
System.out.println("hiii");
System.out.println("execute1");
String URL=xml.getParameter("url");
String UN=xml.getParameter("username");
System.out.println(URL);
System.out.println(UN);

}
}
