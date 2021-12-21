package com.inetbanking.testCases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;


public class TC_AdCustomerPage_002 extends BaseClass {
	@Test
	public void AddNewCustomer() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		lp.setPassword(password);
		logger.info("Entered password");
		lp.clickSubmit();
		//Thread.sleep(3000);
		
		AddCustomerPage adcust=new AddCustomerPage(driver);
		
        adcust.clickAddNewCustomer();
		logger.info("providing customer details....");
		adcust.custName("Sakib");
		adcust.custgender("male");
		adcust.custdob("12","11","1997");
		//Thread.sleep(3000);
		adcust.custaddress("Dhaka");
		adcust.custcity("Chandpur");
		adcust.custstate("Cumilla");
		adcust.custpinno("1280");
		adcust.custtelephoneno("03772979383");
		

	      String email=randomstring()+"@gmail.com";
	      adcust.custemailid(email);
	      adcust.custpassword("abcdef");
	      adcust.custsubmit();
	      Thread.sleep(3000);
	      
	      logger.info("validation started....");
			
			boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
			
			if(res==true)
			{
				Assert.assertTrue(true);
				logger.info("test case passed....");
				
			}
			else
			{
				logger.info("test case failed....");
				captureScreen(driver,"AddNewCustomer");
				Assert.assertTrue(false);
			}
	

}
}
