package com.interBanking.pageObjects_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NewCustomer_page {
	WebDriver idriver;

	public NewCustomer_page(WebDriver rdriver) {
		idriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
@FindBy(how=How.XPATH,using="/html/body/div[3]/div/ul/li[2]/a")
WebElement Newcustomerlink;
@FindBy(how=How.NAME,using="name")
WebElement Name;
@FindBy(how=How.NAME,using="rad1")
WebElement Gander;
@FindBy(how=How.ID_OR_NAME,using="dob")
WebElement Dob;
@FindBy(how=How.NAME,using="addr")
WebElement Address;
@FindBy(how=How.NAME,using="city")
WebElement City;
@FindBy(how=How.NAME,using="state")
WebElement State;
@FindBy(how=How.NAME,using="pinno")
WebElement Pinno;
@FindBy(how=How.NAME,using="telephoneno")
WebElement Telephoneno;
@FindBy(how=How.NAME,using="emailid")
WebElement Emailid;
@FindBy(how=How.NAME,using="password")
WebElement Password;
@FindBy(how=How.NAME,using="sub")
WebElement Sub;
@FindBy(how=How.XPATH,using="//iframe[@nam='google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0']")
WebElement frame;
@FindBy(how=How.XPATH,using="//*[@id=\"dismiss-button\"]/div")
WebElement add;
@FindBy(how=How.XPATH,using="/html/body/table/tbody/tr/td/table/tbody/tr[3]/td")
WebElement cusid;


public void setCusid(WebElement cusid) {
	this.cusid = cusid;
}
public void setAdd() {
	add.click();
}
public void setNewcustomerlink() {
	Newcustomerlink.click();
}
public void setName(String name) {
	Name.sendKeys(name);
}
public void setGander() {
	Gander.click();
}
public void setDob(String mm,String dd,String yy) {
	Dob.sendKeys(mm);
	Dob.sendKeys(dd);
	Dob.sendKeys(yy);
}
public void setAddress(String address) {
	Address.sendKeys(address);
}
public void setCity(String city) {
	City.sendKeys(city);
}
public void setState(String state) {
	State.sendKeys(state);
}
public void setPinno(String pinno) {
	Pinno.sendKeys(pinno);
}
public void setTelephoneno(String telephoneno) {
	Telephoneno.clear();
	Telephoneno.sendKeys(telephoneno);
}	
public void setEmailid(String emailid) {
	Emailid.sendKeys(emailid);
}
public void setPassword(String password) {
	Password.sendKeys(password);
}
public void setSub() {
	Sub.click();
}

}
