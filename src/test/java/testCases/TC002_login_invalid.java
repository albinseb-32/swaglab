package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.HomePage;
import pageObjects.loginPage;
import pageObjects.CartPage;
import testBase.BaseClass;

public class TC002_login_invalid extends BaseClass {
	
	@Test(groups = {"Regression", "Master"})
	void login() {
		
		loginPage lp = new loginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.enterPwd(p.getProperty("wrongpwd"));
		lp.clickLogin();
		Boolean error1 = lp.verifyError();
		
		
		
		//SoftAssert sa = new SoftAssert();
		
		Assert.assertEquals(error1, true);
	}
	

}
