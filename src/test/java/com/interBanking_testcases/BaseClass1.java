package com.interBanking_testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.interBanking_Utilitues.Readfile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {

	Readfile file = new Readfile();

	public String baseUrl = file.getApplicationURL();
	public String username = file.getLoginUsername();
	public String password = file.getLoginPassword();
	public static WebDriver driver;
	public static Logger logger;

	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.properties");
		if (br.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (br.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (br.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else if(br.equals("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		driver.get(baseUrl);
		logger.info("browser is lunched");

	}

	@AfterClass
	public void tearDown() {
		
		driver.quit();
		logger.info("browser is closed");
	}
	public static void captureScreen(WebDriver driver,String tname) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	
	}
	public static void alert(String type,String text) {
		switch (type) {
		case "accept":
			driver.switchTo().alert().accept();
		case "dismiss":
			driver.switchTo().alert().dismiss();
		case "text":
			driver.switchTo().alert().sendKeys(text);
		case "alert":
			driver.switchTo().alert();
		case "default":
			driver.switchTo().defaultContent();
		}
			
	}
	public static void select(String types, WebElement option, String text,int index) {
		switch (types) {
		case "index":
			Select s = new Select(option);
			s.selectByIndex(index);
			break;
			
		case "value":
			Select s1 = new Select(option);
			s1.selectByValue(text);
			break;
		case "visible":
			Select sv = new Select(option);
			sv.selectByVisibleText(text);
			break;
		case "multiple":
			Select sm = new Select(option);
			sm.isMultiple();
			break;
		case "option":
			Select so = new Select(option);
			so.getOptions();
			break;
		case "alloption":
			Select sa = new Select(option);
			sa.getAllSelectedOptions();
			break;
		case "Firstselect":
			Select sf = new Select(option);
			sf.getFirstSelectedOption();
			break;
		case "deselectvalue":
			Select sd = new Select(option);
			sd.deselectByValue(text);
			break;
		case "deselectvisible":
			Select sdd = new Select(option);
			sdd.deselectByVisibleText(text);
			break;
		}
	}

}
