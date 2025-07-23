package testCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.CheckoutPage;
import pageObjects.loginPage;
import testBase.BaseClass;



public class TC005_verify_complete_order extends BaseClass {
	@Test(groups = {"Master"})
	void checkout() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		loginPage lp = new loginPage(driver);
		CheckoutPage ckp = new CheckoutPage(driver);
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
        Thread.sleep(Duration.ofSeconds(2));
        ckp.click_checkout_btn();
        ckp.enterfname(p.getProperty("fname"));
        ckp.enterlname(p.getProperty("lname"));
        ckp.enterpost(p.getProperty("post"));
        ckp.click_cont_btn();
        ckp.click_finish_btn();
        Boolean rs2= ckp.verify_success();
        Assert.assertEquals(rs2, true);
		
	}
	
	

}
