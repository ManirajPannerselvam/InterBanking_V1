package com.interBanking.pageObjects_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerpage {
	WebDriver idriver;

	public EditCustomerpage(WebDriver rdriver) {
		idriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(how=How.NAME,using="cusid")
	WebElement Cusid;
	@FindBy(how=How.NAME,using="AccSubmit")
	WebElement Summit;
	
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/ul/li[3]/a")
	WebElement Edit;

	
	public void setCusid(String cusid) {
		Cusid.sendKeys(cusid);
	}
	public void setSummit() {
		Summit.click();
	}
	
	public void setEdit() {
		Edit.click();
	}

}
