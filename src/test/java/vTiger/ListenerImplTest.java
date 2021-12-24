package vTiger;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ecom.appium.GenericUtils.BaseClass;

@Listeners(com.ecom.appium.GenericUtils.ListnerImpl.class)
public class ListenerImplTest extends BaseClass
{



@Test
	public void failtest()
	{
	System.out.println("Test case failed");	
	Assert.fail();
	}
}
