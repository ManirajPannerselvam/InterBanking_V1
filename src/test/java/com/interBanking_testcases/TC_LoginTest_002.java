package com.interBanking_testcases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.interBanking.pageObjects_POM.Login_page;
import com.interBanking_Utilitues.XLUtils;

public class TC_LoginTest_002 extends BaseClass1 {
	@Test(dataProvider = "LoginData")
	public void LoginDDT(String user, String pass) {
		Login_page login = new Login_page(driver);

		login.setUserName(user);
		logger.info("userName enter");
		login.setPassword(pass);
		logger.info("Password Enter");
		login.summit();
		logger.info("Click login");
		if (isAlertPresent() == true) {
			driver.switchTo().alert().accept();
			//alert("accept", null);
			driver.switchTo().defaultContent();
			//alert("default", null);
			Assert.assertTrue(false);
		} else {
			Assert.assertTrue(true);
			logger.info("Login successfull");
			login.Logout();
			driver.switchTo().alert().accept();
			//alert("accept", null);
			driver.switchTo().defaultContent();
			//alert("default", null);

		}
	}

	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			//alert("alert", null);
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	@DataProvider(name = "LoginData")

	String[][] getdata() throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/java/com/interBanking_testData/Logindata.xlsx";
		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colcount = XLUtils.getCellCount(path, "Sheet1", 1);
		String logindata[][] = new String[rownum][colcount];
		for (int i = 1; i <= rownum; i++) {
			for (int j = 0; j < colcount; j++) {
				logindata[i - 1][j] = XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return logindata;
	}

}
