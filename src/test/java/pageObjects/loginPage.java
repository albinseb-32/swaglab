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
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement email_txtbox;
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement pwd_txtbox;
	@FindBy(xpath = "//input[@value='Login']")
	WebElement login_bnt;
	
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
	

}
