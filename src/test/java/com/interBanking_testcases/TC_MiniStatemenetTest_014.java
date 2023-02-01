package com.interBanking_testcases;

import org.testng.annotations.Test;

import com.interBanking.pageObjects_POM.Login_page;
import com.interBanking.pageObjects_POM.MiniStatement_page;

public class TC_MiniStatemenetTest_014 extends BaseClass1 {

	@Test
	private void MiniStatemenetTest() {

		Login_page login = new Login_page(driver);
		logger.info("UserName is provider");
		login.setUserName(username);
		logger.info("PAssword is provide");
		login.setPassword(password);
		logger.info("Summit buttton is click");
		login.summit();
		MiniStatement_page mini = new MiniStatement_page(driver);
		logger.info("Click Mini Statemenet link");
		mini.setMini();
		logger.info("Eneter the Account Number");
		mini.setAccno("118059");
		logger.info("Summit button is click");
		mini.setSummit();
	}

}
