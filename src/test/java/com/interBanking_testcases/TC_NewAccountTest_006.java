package com.interBanking_testcases;

import org.testng.annotations.Test;

import com.interBanking.pageObjects_POM.Login_page;
import com.interBanking.pageObjects_POM.NewAccount_page;

public class TC_NewAccountTest_006 extends BaseClass1 {
	@Test
	private void NewAccount() throws InterruptedException {
		Login_page login = new Login_page(driver);
		login.setUserName(username);
		logger.info("UserName Provide");
		login.setPassword(password);
		logger.info("Password Provide");

		login.summit();
		logger.info("login click");

		Thread.sleep(2000);
		NewAccount_page newacc=new NewAccount_page(driver);
		logger.info("New Account click");
		newacc.setNewacc();
		logger.info("customer id enter");
		newacc.setCusId("82480");
		logger.info("select account type");
		newacc.setAcctype();
		//select("index", newacc.setAcctype(),null, 0);	
		logger.info("ammount type");
		newacc.setInitamount("500");
		logger.info("summit account");
		newacc.setSummit();

	}

}
