package com.inetbanking.pageObjects;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
	//import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.PageFactory;

	public class AddCustomerPage {

		WebDriver ldriver;
		
		public AddCustomerPage(WebDriver rdriver) {
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		@FindBy(xpath="/html/body/div[3]/div/ul/li[2]/a")
		@CacheLookup
		WebElement lnkAddNewCustomer;

		@FindBy(name = "name")
		@CacheLookup
		WebElement txtCustomerName;

		@FindBy(name= "rad1")
		@CacheLookup
		WebElement rdGender;

		@CacheLookup
		@FindBy(name= "dob")
		WebElement txtdob;

		@CacheLookup
		@FindBy(name= "addr")
		WebElement txtaddress;

		@CacheLookup
		@FindBy(name= "city")
		WebElement txtcity;

		@CacheLookup
		@FindBy(name= "state")
		WebElement txtstate;

		@CacheLookup
		@FindBy(name= "pinno")
		WebElement txtpinno;

		@CacheLookup
		@FindBy(name= "telephoneno")
		WebElement txttelephoneno;

		@CacheLookup
		@FindBy(name = "emailid")
		WebElement txtemailid;

		@CacheLookup
		@FindBy(name= "password")
		WebElement txtpassword;

		@CacheLookup
		@FindBy(name= "sub")
		WebElement btnSubmit;
		
		public void clickAddNewCustomer() {
			lnkAddNewCustomer.click();
				
		}

		public void custName(String cname) {
			txtCustomerName.sendKeys(cname);
			
		}

		public void custgender(String cgender) {
			rdGender.click();
		}

		public void custdob(String mm,String dd,String yy) {
			txtdob.sendKeys(mm);
			txtdob.sendKeys(dd);
			txtdob.sendKeys(yy);
			
		}

		public void custaddress(String caddress) {
			txtaddress.sendKeys(caddress);
		}

		public void custcity(String ccity) {
			txtcity.sendKeys(ccity);
		}

		public void custstate(String cstate) {
			txtstate.sendKeys(cstate);
		}

		public void custpinno(String cpinno) {
			txtpinno.sendKeys(String.valueOf(cpinno));
		}

		public void custtelephoneno(String ctelephoneno) {
			txttelephoneno.sendKeys(ctelephoneno);
		}

		public void custemailid(String cemailid) {
			txtemailid.sendKeys(cemailid);
		}

		public void custpassword(String cpassword) {
			txtpassword.sendKeys(cpassword);
		}

		public void custsubmit() {
			btnSubmit.click();
		}
		
		
		
	}

