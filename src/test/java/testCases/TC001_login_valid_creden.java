package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.HomePage;
import pageObjects.loginPage;
import pageObjects.CartPage;
import testBase.BaseClass;

public class TC001_login_valid_creden extends BaseClass {
	
	@Test(groups = {"Regression", "Master"})
	void login() {
		
		loginPage lp = new loginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.enterPwd(p.getProperty("pwd"));
		lp.clickLogin();
		HomePage hp = new HomePage(driver);
		boolean rs3=hp.verify_bag();
		Assert.assertEquals(rs3, true);
	
	}
	

}
