package com.interBanking_testcases;

import org.testng.annotations.Test;

import com.interBanking.pageObjects_POM.BalanceEnquery_page;
import com.interBanking.pageObjects_POM.Login_page;

public class TC_BalanceEqueryTest_013 extends BaseClass1 {
	@Test
	private void BalanceEquery() {
		Login_page login = new Login_page(driver);
		logger.info("UserName provide");
		login.setUserName(username);
		logger.info("Password is Provide");
		login.setPassword(password);
		logger.info("Summit button click");
		login.summit();
		logger.info("Balance Enquery click");
		BalanceEnquery_page bal = new BalanceEnquery_page(driver);
		bal.setBal();
		logger.info("Enter Account number");
		bal.setAccno("118059");
		logger.info("Summit button click");
		bal.setSummit();
	}

}
