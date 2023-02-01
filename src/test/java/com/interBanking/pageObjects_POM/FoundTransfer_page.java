package com.interBanking.pageObjects_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FoundTransfer_page {
	WebDriver idriver;

	public FoundTransfer_page(WebDriver rdriver) {
		idriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/ul/li[10]/a")
	WebElement Foundtran;
	@FindBy(how = How.NAME, using = "payersaccount")
	WebElement Payers;
	@FindBy(how = How.NAME, using = "payeeaccount")
	WebElement Payees;
	@FindBy(how = How.NAME, using = "ammount")
	WebElement Amount;
	@FindBy(how = How.NAME, using = "desc")
	WebElement Des;
	@FindBy(how = How.NAME, using = "AccSubmit")
	WebElement Summit;

	
	public void setPayees(String payees) {
		Payees.sendKeys(payees);
	}
	public void setFoundtran() {
		Foundtran.click();
	}
	public void setPayers(String payers) {
		Payers.sendKeys(payers);
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
