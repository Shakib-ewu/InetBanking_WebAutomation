package com.inetbanking.testCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

@SuppressWarnings("unused")
public class TC_LoginTest_001 extends BaseClass {

	


	@Test
	public void LoginTest() throws IOException
	{
		driver.get(baseURL);
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		lp.setPassword(password);
		logger.info("Entered password");
		lp.clickSubmit();

		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Test Case passed");
		}

		else
		{
			captureScreen(driver,"LoginTest");
			Assert.assertFalse(true);
			logger.info("Test Case passed");
		}

	}

}
