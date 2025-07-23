package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class CheckoutPage extends BaseClass{
	WebDriver driver;
	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//button[@id='checkout']")
	WebElement checkout_btn;
	@FindBy(xpath = "//input[@id='first-name']")
	WebElement name_inputField;
	@FindBy(xpath = "//input[@id='last-name']")
	WebElement lname_input;
	@FindBy(xpath = "//input[@id='continue']")
	WebElement cont_btn;
	@FindBy(xpath = "//button[@id='finish']")
	WebElement finish_btn;
	@FindBy(xpath = "//*[@id=\"checkout_complete_container\"]/h2")
	WebElement success_header;
	@FindBy(xpath = "//input[@id='postal-code']")
	WebElement postal_code;

	
	public void click_cont_btn() {
		cont_btn.click();
	}
	
	public boolean verify_cont_btn() {
		return cont_btn.isDisplayed();
	}
	public void click_checkout_btn() {
		checkout_btn.click();
	}
	
	public void click_finish_btn() {
		finish_btn.click();
	}
	
	public boolean verify_success() {
		return success_header.isDisplayed();
	}
	
	
	
	public void enterfname(String name1) {
		name_inputField.sendKeys(name1);
	}
	public void enterlname(String name) {
		lname_input.sendKeys(name);
	}
	
	public void enterpost(String name) {
		postal_code.sendKeys(name);
	}
	

	
	

}
