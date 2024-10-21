package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	//constructer
	public HomePage(WebDriver driver){
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 //locaters
	 @FindBy(xpath = "//span[normalize-space()='My Account']")
	 WebElement My_Acc_btn;
	 @FindBy(xpath = "//a[normalize-space()='Register']")
	 WebElement Reg_btn;
	 @FindBy(xpath = "//a[normalize-space()='Login']")
	 WebElement login_text;
	 
	 //actions
	 public void click_my_accBtn() {
		 My_Acc_btn.click();
	 }
	 public void click_Reg_btn() {
		 Reg_btn.click();
	 }
	 public void click_login_text() {
		 login_text.click();
	 }

}
