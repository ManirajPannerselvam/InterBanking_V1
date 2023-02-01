package com.interBanking.pageObjects_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ChangePassword_Page {
	WebDriver idriver;
	
	public ChangePassword_Page(	WebDriver rdriver) {
		idriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/ul/li[11]/a")
	WebElement Chang;
	@FindBy(how=How.NAME,using="oldpassword")
	WebElement Old;
	@FindBy(how=How.NAME,using="newpassword")
	WebElement New;
	@FindBy(how=How.NAME,using="confirmpassword")
	WebElement Conf;
	@FindBy(how=How.NAME,using="sub")
	WebElement Summit;

	public void setChang() {
		Chang.click();
	}
	public void setOld(String old) {
		Old.sendKeys(old);
	}
	public void setNew(String new1) {
		New.sendKeys(new1);
	}
	public void setConf(String conf) {
		Conf.sendKeys(conf);
	}
	public void setSummit() {
		Summit.click();
	}

}
