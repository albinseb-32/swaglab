package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.HomePage;
import pageObjects.loginPage;
import pageObjects.myAccPage;
import testBase.BaseClass;

public class TC002_login_valid_creden extends BaseClass {
	
	@Test(groups = {"Regression", "Master"})
	void login() {
		HomePage hp = new HomePage(driver);
		hp.click_my_accBtn();
		hp.click_login_text();
		loginPage lp = new loginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.enterPwd(p.getProperty("pwd"));
		lp.clickLogin();
		
		SoftAssert sa = new SoftAssert();
		myAccPage map = new myAccPage(driver);
		Assert.assertEquals(map.verify_myaccpage(), true);
	}
	

}
