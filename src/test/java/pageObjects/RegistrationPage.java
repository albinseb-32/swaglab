package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	WebDriver driver;
	//constructer
	public RegistrationPage(WebDriver driver){
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 
	 
	 //locaters
	 @FindBy(xpath = "//input[@id='input-firstname']")
	 WebElement first_name_txtBox;
	 @FindBy(xpath = "//input[@id='input-lastname']")
	 WebElement last_name_txtBox;
	 @FindBy(xpath = "//input[@id='input-email']")
	 WebElement email_txtBox;
	 @FindBy(xpath = "//input[@id='input-telephone']")
	 WebElement telePhone_txtBox;
	 @FindBy(xpath = "//input[@id='input-password']")
	 WebElement pwd_txtBox;
	 @FindBy(xpath = "//input[@id='input-confirm']")
	 WebElement confirm_pwd_txtBox;
	 @FindBy(xpath = "//input[@name='agree']")
	 WebElement agree_checkBox;
	 @FindBy(xpath = "//input[@value='Continue']")
	 WebElement continue_btn;
	 
	 @FindBy(xpath= "//*[@id=\"content\"]/h1[text()='Your Account Has Been Created!']")
	 WebElement heading;
	 
	 
	 //actions
	public void enterFirstName(String fname) {
		 first_name_txtBox.sendKeys(fname);
	 }
	public void enterLastName(String lname) {
		 last_name_txtBox.sendKeys(lname);
	 }

	public void enterEmail(String email) {
		 email_txtBox.sendKeys(email);
	 }
	public void entertelePhone(String ph_no) {
		 telePhone_txtBox.sendKeys(ph_no);
	 }
	public void enterpwd(String pwd) {
		 pwd_txtBox.sendKeys(pwd);
	 }
	public void confirmPwd(String confirmPwd) {
		 confirm_pwd_txtBox.sendKeys(confirmPwd);
	 }
	public void click_agree_checkBox() {
		 agree_checkBox.click();;
	 }
	public void click_cont() {
		 continue_btn.click();;
	 }
	public boolean visible_heading() {
		return heading.isDisplayed();
	}

}
