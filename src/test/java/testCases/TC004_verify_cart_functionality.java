package testCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.CheckoutPage;
import pageObjects.loginPage;
import testBase.BaseClass;



public class TC004_verify_cart_functionality extends BaseClass {
	@Test(groups = {"Master"})
	void checkout() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		loginPage lp = new loginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.enterPwd(p.getProperty("pwd"));
		lp.clickLogin();
		hp.click_bag();
		hp.click_bikelight();
		hp.click_shirt();
		hp.remove_shirt();
		CartPage cp = new CartPage(driver);
		cp.click_cart();
		boolean rs_bag = cp.verify_bag();
        Assert.assertEquals(rs_bag, true);
        boolean rs_bikelight = cp.verify_bikelight();
        Assert.assertEquals(rs_bikelight, true);
        Thread.sleep(Duration.ofSeconds(3));
		
	}
	
	

}
