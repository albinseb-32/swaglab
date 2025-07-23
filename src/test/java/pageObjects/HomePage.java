package pageObjects;

import org.openqa.selenium.By;
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
	 @FindBy(xpath = "//select[@class='product_sort_container']")
	 WebElement Sort_btn;
	 @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")
	 WebElement lowToHigh_btn;
	 @FindBy(xpath = "//a[normalize-space()='Login']")
	 WebElement login_text;
	 @FindBy(xpath = "//*[@id='inventory_container']/div/div[1]/div[2]/div[2]/div")
	 WebElement price1Elem;
	 
	 @FindBy(xpath = "//*[@id='inventory_container']/div/div[2]/div[2]/div[2]/div")
	 WebElement price2Elem;
	 @FindBy(xpath = "//*[@id='inventory_container']/div/div[3]/div[2]/div[2]/div")
	 WebElement price3Elem;
	 
	 @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
		WebElement bag_add_to_cart;
	 @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")
		WebElement bikelight_add_to_cart;
	 @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
		WebElement shirt_add_to_cart;
	 @FindBy(xpath = "//*[@id=\"remove-sauce-labs-bolt-t-shirt\"]")
		WebElement shirt_remove;
	 

	 

     

     public boolean verify_sorting() {
    	 
    	 double price1 = Double.parseDouble(price1Elem.getText().replace("$", ""));
         double price2 = Double.parseDouble(price2Elem.getText().replace("$", ""));
         double price3 = Double.parseDouble(price3Elem.getText().replace("$", ""));
    	 boolean result;

    	    if (price1 <= price2 && price2 <= price3) {
    	        
    	        result = true;
    	    } else {
    	     
    	        result = false;
    	    }

    	    return result;
	 
     }
	 
	 
	 //actions
	 public void click_srt() {
		 Sort_btn.click();
	 }
	 public void click_l2h_btn() {
		 lowToHigh_btn.click();
	 }
	 
	 
	 
		
		
		public void click_bag() {
			bag_add_to_cart.click();
		}
		
		public boolean verify_bag() {
			return bag_add_to_cart.isDisplayed();
		}
		
		public void click_shirt() {
			shirt_add_to_cart.click();
		}
		
		public void click_bikelight() {
			bikelight_add_to_cart.click();
		}
		public void remove_shirt() {
			shirt_remove.click();
		}
	 

}
