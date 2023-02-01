package com.interBanking_testcases;

import org.testng.annotations.Test;

import com.interBanking.pageObjects_POM.FoundTransfer_page;
import com.interBanking.pageObjects_POM.Login_page;

public class TC_FoundtransferTest_011 extends BaseClass1 {
	@Test
	private void Foundtransfer() {

		Login_page login = new Login_page(driver);
		logger.info("UserName Provide");
		login.setUserName(username);
		logger.info("Password provide");
		login.setPassword(password);
		logger.info("Summit click");
		login.summit();
		FoundTransfer_page found = new FoundTransfer_page(driver);
		logger.info("Click foundTransfer ");
		found.setFoundtran();
		logger.info("Enter payers account Number");
		found.setPayers(baseUrl);
		logger.info("Enter Payees Account Number");
		found.setPayees(baseUrl);
		logger.info("Enter Ammount");
		found.setAmount(baseUrl);
		logger.info("Desscription");
		found.setDes(baseUrl);
		logger.info("Summit button click");
		found.setSummit();

	}
}
