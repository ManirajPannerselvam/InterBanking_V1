package com.interBanking.pageObjects_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MiniStatement_page {
	WebDriver idriver;

	public MiniStatement_page(WebDriver rdriver) {
		idriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/ul/li[13]/a")
	WebElement Mini;
	@FindBy(how = How.NAME, using = "accountno")
	WebElement Accno;
	@FindBy(how = How.NAME, using = "AccSubmit")
	WebElement Summit;

	public void setMini() {
		Mini.click();
	}
	public void setAccno(String accno) {
		Accno.sendKeys(accno);
	}
	public void setSummit() {
		Summit.click();
	}

}
