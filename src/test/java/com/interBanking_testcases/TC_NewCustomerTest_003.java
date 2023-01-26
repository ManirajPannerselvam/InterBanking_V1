package com.interBanking_testcases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.interBanking.pageObjects_POM.Login_page;
import com.interBanking.pageObjects_POM.NewCustomer_page;

public class TC_NewCustomerTest_003 extends BaseClass1 {
	@Test
	private void NewCustomer() throws InterruptedException, IOException {
		Login_page login = new Login_page(driver);
		login.setUserName(username);
		logger.info("UserName Provide");
		login.setPassword(password);
		logger.info("Password Provide");

		login.summit();
		logger.info("login click");

		Thread.sleep(5000);
		

		NewCustomer_page cust = new NewCustomer_page(driver);
		cust.setAdd();
		Thread.sleep(3000);
		cust.setNewcustomerlink();
		logger.info("Click new Customer link");

		cust.setName("Mani");
		logger.info("Name Provide");

		cust.setGander();
		logger.info("Click Gander");

		cust.setDob("16", "09", "1992");
		logger.info("DOB Provide");

		cust.setAddress("East Street Moolasamuthiram");
		logger.info("Address Provide");

		cust.setCity("Ulundurpet");
		logger.info("City Provide");

		cust.setState("Tamilnadu");
		logger.info("State Provide");

		cust.setPinno("606107");
		logger.info("pincode Provide");

		cust.setTelephoneno("8939489688");
		logger.info("MobileNumber Provide");

		String email = randomstring() + "@gmail.com";
		cust.setEmailid(email);
		logger.info("EmailID Provide");

		cust.setPassword("abcdef");
		logger.info("Password Provide");
		
		cust.setSub();
		logger.info("Summit");

		Thread.sleep(3000);
		logger.info("validation start");

		boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");
		if (res == true) {
			Assert.assertTrue(true);
			logger.info("New Customer Successfully Creater");

		} else {
			captureScreen(driver, "NewCustomer");
			logger.info("Take Screenshot");

			Assert.assertTrue(false);
		}
	}

	public String randomstring() {
		String name = RandomStringUtils.randomAlphabetic(8);
		return name;

	}
}
