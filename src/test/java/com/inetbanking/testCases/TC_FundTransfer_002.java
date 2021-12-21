package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.FundTransferPage;
import com.inetbanking.pageObjects.LoginPage;

@SuppressWarnings("unused")
public class TC_FundTransfer_002 extends BaseClass{
	@Test
	public void FundTransfer() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		lp.setPassword(password);
		logger.info("Entered password");
		lp.clickSubmit();
		
		
		FundTransferPage fund=new FundTransferPage(driver);
		fund.fundtransfer();
		
		//logger.info("providing customer details....");
		Thread.sleep(3000);
		
		logger.info("providing customer details.");
        fund.payersInfo("645764");
        Thread.sleep(3000);
        logger.info("providing customer details..");
        fund.payeeInfo("453754");
        logger.info("providing customer details...");
        fund.amount("100000");
        Thread.sleep(3000);
		fund.description("Ok");
		fund.custsubmitr();
		
	
	
	}
}
