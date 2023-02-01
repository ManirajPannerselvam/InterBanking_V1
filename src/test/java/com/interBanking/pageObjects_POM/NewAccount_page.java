package com.interBanking.pageObjects_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NewAccount_page {
	WebDriver idriver;
	public NewAccount_page(WebDriver rdriver){
		idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/ul/li[5]/a")
	WebElement Newacc;
	@FindBy(how=How.NAME,using="inideposit")
	WebElement Initamount;
	@FindBy(how=How.NAME,using="button2")
	WebElement Summit;
	@FindBy(how=How.NAME,using="cusid")
	WebElement CusId;
	@FindBy(how=How.XPATH,using="/html/body/table/tbody/tr/td/table/tbody/tr[3]/td[2]/select")
	WebElement Acctype;
	public void setAcctype() {
		Acctype =null;
	}
	public void setNewacc() {
		Newacc.click();
	}
	public void setInitamount(String initamount) {
		Initamount.sendKeys(initamount);
	}
	public void setSummit() {
		Summit.click();
	}
	public void setCusId(String cusId) {
		CusId.sendKeys(cusId);;
	}
	

}
