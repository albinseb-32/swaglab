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
import pageObjects.loginPage;
import testBase.BaseClass;

public class TC003_verify_sorting extends BaseClass {
	//public WebDriver driver;
	
	@Test(groups= {"Sanity", "Master"})
	void reg_validation() throws IOException, InterruptedException {
		
		
		loginPage lp = new loginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.enterPwd(p.getProperty("pwd"));
		lp.clickLogin();
		
		
		
		
		
		HomePage hp = new HomePage(driver);
		hp.click_srt();
		hp.click_l2h_btn();
		
		
		Thread.sleep(Duration.ofSeconds(5));
		


        boolean rs = hp.verify_sorting();

        Assert.assertEquals(rs, true);
	
		
	}
		
	}

