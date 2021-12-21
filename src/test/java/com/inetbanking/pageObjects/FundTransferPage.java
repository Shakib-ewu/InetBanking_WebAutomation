package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FundTransferPage {
	
		WebDriver ldriver;
		
		public FundTransferPage(WebDriver rdriver) {
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		@FindBy(xpath="/html[1]/body[1]/div[3]/div[1]/ul[1]/li[10]/a[1]")
		@CacheLookup
		WebElement fundtransfer;
		
		
		@FindBy(name="payersaccount")
		@CacheLookup
		WebElement Payersaccountno;

		@FindBy(name = "payeeaccount")
		@CacheLookup
		WebElement Payeesaccountno;

		@FindBy(name= "ammount")
		@CacheLookup
		WebElement Amount;

		@CacheLookup
		@FindBy(name= "desc")
		WebElement Description;

		@CacheLookup
		@FindBy(name= "AccSubmit")
		WebElement btnSubmit;
		
		public void fundtransfer() {
			fundtransfer.click();
		}
		
		public void payersInfo(String accno) {
			Payersaccountno.sendKeys(accno);
				
		}

		public void payeeInfo(String payno) {
			Payeesaccountno.sendKeys(payno);
			
		}

		public void amount(String amount) {
			Amount.sendKeys(amount);
		}
		public void description(String description) {
			Description.sendKeys(description);
		}
		public void custsubmitr() {
			btnSubmit.click();
		}

		

}
