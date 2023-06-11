package pages;

import base.Base;
import org.openqa.selenium.By;

public class BookDetails extends Base {

	By shesherKobitaCartBtn = By.xpath("(//span[@id='js--add-to-cart-button'])[2]");
	By closeAfterCartPopup = By.xpath("//button[@class='close js--btn-close-feature-popup']//span[@aria-hidden='true'][normalize-space()='×']");
	By cartBtn = By.xpath("//a[@id='js-cart-menu']//*[name()='svg']");

	public void addToCart(){

		if (!driver.findElement(shesherKobitaCartBtn).isDisplayed()){
			driver.findElement(shesherKobitaCartBtn).click();
			driver.findElement(closeAfterCartPopup).click();
		} else {
			System.out.println("Book already is in cart.");
		}


	}

	public CartPage goToCart(){
		driver.findElement(cartBtn).click();

		return new CartPage();
	}
}
