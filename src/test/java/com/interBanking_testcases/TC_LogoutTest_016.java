package com.interBanking_testcases;

import org.testng.annotations.Test;

import com.interBanking.pageObjects_POM.Login_page;
import com.interBanking.pageObjects_POM.Logout_page;

public class TC_LogoutTest_016 extends BaseClass1 {
	
	@Test
	private void LogoutTest() {
		Login_page login = new Login_page(driver);
		logger.info("UserName is Enter ");
		login.setUserName(username);
		logger.info("Password is Enter");
		login.setPassword(password);
		logger.info("Summit button is click");
		login.summit();
		Logout_page log=new Logout_page(driver);
		logger.info("Logout Successfully");
		log.setLogout();
		alert("accept", null);
		
	}
}
