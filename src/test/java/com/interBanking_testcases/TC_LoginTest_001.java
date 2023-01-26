package com.interBanking_testcases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.interBanking.pageObjects_POM.Login_page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_LoginTest_001 extends BaseClass1 {
	@Test
	private void loginTest() throws IOException {
		 Logger logger=Logger.getLogger("TC_LoginTest_001");
		PropertyConfigurator.configure("Log4j.properties");
		logger.info("URL is opened");
		Login_page lp= new Login_page(driver);
		lp.setUserName(username);
		logger.info("UserName is Enter");

		lp.setPassword(password);
		logger.info("Password is Enter");

		lp.summit();
		logger.info("Press Login Button");

		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
				{
			Assert.assertTrue(true);
			logger.info("Login is Pass");

		}else {
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Login is Fail");


		}
	}
}
