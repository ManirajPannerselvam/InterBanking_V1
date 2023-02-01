package com.interBanking.pageObjects_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CustomisedStatement_page {
	WebDriver idriver;

	public CustomisedStatement_page(WebDriver rdriver) {
		idriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/ul/li[14]/a")
	WebElement Cus;
	@FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")
	WebElement Accno;
	@FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input")
	WebElement Frdate;
	@FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input")
	WebElement Todate;
	@FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input")
	WebElement Mini;
	@FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input")
	WebElement Notran;
	@FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input[1]")
	WebElement Summit;

	public void setCus() {
		Cus.click();
	}

	public void setAccno(String accno) {
		Accno.sendKeys(accno);
	}

	public void setFrdate(String dd, String mm, String yyy) {
		Frdate.sendKeys(dd);
		Frdate.sendKeys(mm);
		Frdate.sendKeys(yyy);

	}

	public void setTodate(String dd, String mm, String yyy) {
		Todate.sendKeys(dd);
		Todate.sendKeys(mm);
		Todate.sendKeys(yyy);

	}

	public void setMini(String mini) {
		Mini.sendKeys(mini);
	}

	public void setNotran(String notran) {
		Notran.sendKeys(notran);
	}

	public void setSummit() {
		Summit.click();
	}
}
