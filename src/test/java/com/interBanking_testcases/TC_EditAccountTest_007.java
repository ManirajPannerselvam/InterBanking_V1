package com.interBanking_testcases;

import org.testng.annotations.Test;

import com.interBanking.pageObjects_POM.EditAccount_page;
import com.interBanking.pageObjects_POM.Login_page;

public class TC_EditAccountTest_007 extends BaseClass1{
	@Test
	private void EditAccount() throws InterruptedException {
		Login_page login = new Login_page(driver);
		login.setUserName(username);
		logger.info("UserName Provide");
		login.setPassword(password);
		logger.info("Password Provide");

		login.summit();
		logger.info("login click");

		Thread.sleep(2000);
		
		EditAccount_page edit=new EditAccount_page(driver);
		logger.info("click edit customer");
		edit.setEditacc();
		logger.info("enter the account number");
		edit.setAccno("118059");
		logger.info("summit");
		edit.setSummit();
	}

}
