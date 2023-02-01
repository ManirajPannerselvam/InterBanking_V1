package com.interBanking_testcases;

import org.testng.annotations.Test;

import com.interBanking.pageObjects_POM.Login_page;
import com.interBanking.pageObjects_POM.Withdrawal_page;

public class TC_WithdrawalTest_010 extends BaseClass1 {
	@Test
	private void Withdrawals() {
		Login_page login = new Login_page(driver);
		logger.info("UserName Provider");
		login.setUserName(username);
		logger.info("Password provider");
		login.setPassword(password);
		logger.info("Summit button click");
		login.summit();
		Withdrawal_page with = new Withdrawal_page(driver);
		logger.info("Withdrawals button click");
		with.setWith();
		logger.info("Account number enter");
		with.setAccno("118059");
		logger.info("Ammount enter");
		with.setAmmount("500");
		logger.info("Description typing");
		with.setDes("Food");
		logger.info("Summit button");
		with.setSummit();

	}

}
