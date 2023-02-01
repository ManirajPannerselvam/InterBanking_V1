package com.interBanking.pageObjects_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Logout_page {
	WebDriver rdriver;
	public Logout_page(	WebDriver idriver) {

	rdriver =idriver;
	PageFactory.initElements(idriver, this);}

	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/ul/li[15]/a")
	WebElement logout;
	public void setLogout() {
		logout.click();
	}


}
