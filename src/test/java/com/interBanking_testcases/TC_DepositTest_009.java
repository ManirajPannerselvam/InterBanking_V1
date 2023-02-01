package com.interBanking_testcases;

import org.testng.annotations.Test;

import com.interBanking.pageObjects_POM.Deposit_page;
import com.interBanking.pageObjects_POM.Login_page;

public class TC_DepositTest_009 extends BaseClass1 {
@Test
	private void depostamount() throws InterruptedException {
	Login_page login=new Login_page(driver);
	logger.info("UserName provide");
	login.setUserName(username);
	logger.info("Password provide");
	login.setPassword(password);
	logger.info("Summit login");
	login.summit();
	Deposit_page dep=new Deposit_page(driver);
	logger.info("click deposit link page");
	dep.setDep();
	Thread.sleep(2000);
	logger.info("Enter account number");
	dep.setAccno("118059");
	logger.info("Enter Ammount" );
	dep.setAmount("455555");
	logger.info("Description");

	dep.setDes("Home rent");
	logger.info("Enter Summit button");
	dep.setSummit();

}
}
