package testCases;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.*;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC001_Acc_reg extends BaseClass {
	//public WebDriver driver;
	
	@Test(groups= {"Sanity", "Master"})
	void reg_validation() throws IOException {
		
		//logger.info("Start with home page");
		HomePage hp = new HomePage(driver);
		//logger.info("Start with reg page");
		RegistrationPage rp = new RegistrationPage(driver);
		hp.click_my_accBtn();
		hp.click_Reg_btn();
		rp.enterFirstName("tester23");
		rp.enterLastName("tester23");
		String email2 = randomEmail();
		p.setProperty("email2", email2);
		rp.enterEmail(email2);
		rp.entertelePhone(randomMbile());
		p.setProperty("pwd2", "tester23");
		//file.close();
		//p.store(file, "soide");
		String path = "./src//test//resources//config.properties";
	      FileOutputStream outputStrem = new FileOutputStream(path);
	      //Storing the properties file
	      p.store(outputStrem, "data required");
		rp.enterpwd("tester23");
		rp.confirmPwd("tester23");
		rp.click_agree_checkBox();
		rp.click_cont();
		
		SoftAssert sa = new SoftAssert();
		boolean visibility = rp.visible_heading();
		Assert.assertTrue(visibility);
		
	
		
	}
		
	}

