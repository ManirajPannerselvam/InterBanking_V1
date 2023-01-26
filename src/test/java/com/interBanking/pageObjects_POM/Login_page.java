package com.interBanking.pageObjects_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	WebDriver idriver;

	public Login_page(WebDriver rdriver) {
		idriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(name = "uid")
	WebElement UserName;
	@FindBy(name = "password")
	WebElement Password;
	@FindBy(name = "btnLogin")
	@CacheLookup
	WebElement btnLogin;
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	WebElement Logout;

	public void setUserName(String username) {
		UserName.sendKeys(username);
	}

	public void setPassword(String password) {
		Password.sendKeys(password);
	}

	public void summit() {
		btnLogin.click();;
	}
	public void Logout() {
		Logout.click();
	}

}
