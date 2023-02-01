package com.interBanking_testcases;

import org.testng.annotations.Test;

import com.interBanking.pageObjects_POM.ChangePassword_Page;
import com.interBanking.pageObjects_POM.Login_page;

public class TC_ChangePasswordTest_012 extends BaseClass1 {
	@Test
	private void ChangePassword() {
		Login_page login = new Login_page(driver);
		logger.info("UserName is Enter");
		login.setUserName(username);
		logger.info("Password is Enter");
		login.setPassword(password);
		logger.info("Summit button is enter");
		login.summit();
		ChangePassword_Page chang = new ChangePassword_Page(driver);
		logger.info("Click Chnage password link");
		chang.setChang();
		logger.info("Enter old password");
		chang.setOld("vabypuq");
		logger.info("Enter new Password");
		chang.setNew("vabypup@1");
		logger.info("Confirm password is Enter");
		chang.setConf("vabypup@1");
		logger.info("Summit button click");
		chang.setSummit();
		alert("accept", null);

	}
}
