package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myAccPage {
	WebDriver driver;
	//constructer
	public myAccPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locaters
	@FindBy(xpath = "//*[@id=\"content\"]/h2[text()='My Orders']")
	WebElement my_orders;
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
	WebElement my_acc;
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")
	WebElement logout_txt;
	
	//actions
	public boolean verify_myaccpage() {
		return my_orders.isDisplayed();
	}
	public void click_myAcc() {
		my_acc.click();
	}
	public void click_logout() {
		logout_txt.click();
	}
	

}
