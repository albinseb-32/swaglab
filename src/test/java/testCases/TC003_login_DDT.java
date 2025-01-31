package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.HomePage;
import pageObjects.loginPage;
import pageObjects.myAccPage;
import testBase.BaseClass;
import utilities.dataprovidr;

public class TC003_login_DDT extends BaseClass{
	//WebDriver driver;
	@Test(dataProvider = "datapro",dataProviderClass= dataprovidr.class, groups= {"Datadriven"})
	public void login(String email, String pwd, String exp) {
		HomePage hp = new HomePage(driver);
		hp.click_my_accBtn();
		hp.click_login_text();
		loginPage lp = new loginPage(driver);
		lp.setEmail(email);
		lp.enterPwd(pwd);
		lp.clickLogin();
		
//		SoftAssert sa = new SoftAssert();
//		myAccPage map = new myAccPage(driver);
//		//Assert.assertEquals(map.verify_myaccpage(), true);
//		if(map.verify_myaccpage()){
//			map.click_myAcc();
//			map.click_logout();
//			Assert.assertTrue(true);
//			}
		
		myAccPage macc=new myAccPage(driver);
		boolean targetPage=macc.verify_myaccpage();
		
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(targetPage==true)
			{
				macc.click_logout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		if(exp.equalsIgnoreCase("Invalid"))
		{
			if(targetPage==true)
			{
				macc.click_logout();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
	}
		
	}


