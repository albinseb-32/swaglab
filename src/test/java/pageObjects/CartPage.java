package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	WebDriver driver;
	//constructer
	public CartPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locaters
	@FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
	WebElement cart;
	@FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div")
	WebElement bag_cartpage;
	@FindBy(xpath = "//*[@id=\"item_0_title_link\"]/div")
	WebElement bikelight_cartpage;
	
	
	//actions
	public boolean verify_bag() {
		return bag_cartpage.isDisplayed();
	}
	public boolean verify_bikelight() {
		return bikelight_cartpage.isDisplayed();
	}
	
	public void click_cart() {
		cart.click();
	}
	
	
	
	
	

}
