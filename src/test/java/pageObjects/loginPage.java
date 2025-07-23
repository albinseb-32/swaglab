package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	//constructer
	WebDriver driver;
	public loginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locater
	@FindBy(xpath = "//input[@id='user-name']")
	WebElement email_txtbox;
	@FindBy(xpath = "//input[@id='password']")
	WebElement pwd_txtbox;
	@FindBy(xpath = "//input[@id='login-button']")
	WebElement login_bnt;
	@FindBy(xpath = "//h3[@data-test='error']")
	WebElement error_popup;
	
	//actions
	
	public void setEmail(String email) {
		email_txtbox.sendKeys(email);
	}
	public void enterPwd(String pwd) {
		pwd_txtbox.sendKeys(pwd);
	}
	
	public void clickLogin() {
		login_bnt.click();
	}
	public boolean verifyError() {
		return error_popup.isDisplayed();
	}
	
	

}
