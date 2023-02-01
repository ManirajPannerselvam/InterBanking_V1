package com.interBanking.pageObjects_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Deposit_page {
	WebDriver idriver;
	
	public Deposit_page(WebDriver rdriver) {
		idriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/ul/li[8]/a")
	WebElement Dep;
	@FindBy(how=How.NAME,using="accountno")
	WebElement Accno;
	@FindBy(how=How.NAME,using="ammount")
	WebElement Amount;
	@FindBy(how=How.NAME,using="desc")
	WebElement Des;
	@FindBy(how=How.NAME,using="AccSubmit")
	WebElement Summit;
	public void setDep() {
		Dep.click();
	}
	public void setAccno(String accno) {
		Accno.sendKeys(accno);
	}
	public void setAmount(String amount) {
		Amount.sendKeys(amount);
	}
	public void setDes(String des) {
		Des.sendKeys(des);
	}
	public void setSummit() {
		Summit.click();
	}
}
