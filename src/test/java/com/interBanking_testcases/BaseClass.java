package com.interBanking_testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public String baseUrl = "https://demo.guru99.com/v4/index.php";
	public String username = "mngr471699";
	public String password = "vabypuq";
	public static WebDriver driver;
	public static Logger logger;

	@BeforeClass
	private void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
			logger=Logger.getLogger("ebanking");
			PropertyConfigurator.configure("Log4j.properties");
	}

	@AfterClass
	private void tearDown() {
		driver.quit();
	}

}
