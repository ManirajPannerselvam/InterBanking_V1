package com.interBanking_testcases;

import org.testng.annotations.Test;

import com.interBanking.pageObjects_POM.CustomisedStatement_page;
import com.interBanking.pageObjects_POM.Login_page;

public class TC_CustomisedStatementTest_015 extends BaseClass1 {
	@Test
	private void CustomisedStatement() {
		Login_page login = new Login_page(driver);
		logger.info("UserName is Enter ");
		login.setUserName(username);
		logger.info("Password is Enter");
		login.setPassword(password);
		logger.info("Summit button is click");
		login.summit();
		CustomisedStatement_page cusst = new CustomisedStatement_page(driver);
		logger.info("click Customised Statement link");
		cusst.setCus();
		logger.info("Enter Account number");
		cusst.setAccno("118059");
		logger.info("Enter from date");
		cusst.setFrdate("02", "15", "2023");
		logger.info("Enter to date ");
		cusst.setTodate("03", "02", "2023");
		logger.info("Minimum transaction enter");
		cusst.setMini("5");
		logger.info("Enter Number transaction ");
		cusst.setNotran("3");
		logger.info("click summit button");
		cusst.setSummit();
	}
}
