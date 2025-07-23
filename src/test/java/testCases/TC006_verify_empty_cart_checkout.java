package testCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.CheckoutPage;
import pageObjects.loginPage;
import testBase.BaseClass;



public class TC006_verify_empty_cart_checkout extends BaseClass {
	@Test(groups = {"Master"})
	void checkout() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		loginPage lp = new loginPage(driver);
		CheckoutPage ckp = new CheckoutPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.enterPwd(p.getProperty("pwd"));
		lp.clickLogin();
		
		CartPage cp = new CartPage(driver);
		cp.click_cart();
        Thread.sleep(Duration.ofSeconds(2));
        ckp.click_checkout_btn();
        
        Boolean rs4= ckp.verify_cont_btn();
        Assert.assertEquals(rs4, false);
		
	}
	
	

}
