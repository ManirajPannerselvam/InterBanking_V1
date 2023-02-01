package com.interBanking_testcases;

import org.testng.annotations.Test;

import com.interBanking.pageObjects_POM.EditCustomerpage;
import com.interBanking.pageObjects_POM.Login_page;
import com.interBanking.pageObjects_POM.NewCustomer_page;

public class TC_EditeCustomerID_004 extends BaseClass1 {
	@Test
	private void EditeCustomer() throws InterruptedException {
		Login_page login = new Login_page(driver);
		login.setUserName(username);
		logger.info("UserName Provide");
		login.setPassword(password);
		logger.info("Password Provide");

		login.summit();
		logger.info("login click");

		Thread.sleep(2000);
		
		EditCustomerpage cus=new EditCustomerpage(driver);
		logger.info("click editcustomer");
		cus.setEdit();
		logger.info("enter customer id");
		cus.setCusid("82480");
		logger.info("summit");
		cus.setSummit();
		NewCustomer_page ne=new NewCustomer_page(driver);
		logger.info("new mobile no update");
		ne.setTelephoneno("9956458956");
		logger.info("summit");
		ne.setSub();
		alert("accept", null);
		
	}
}
