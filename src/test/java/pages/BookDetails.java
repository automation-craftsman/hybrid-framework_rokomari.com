package pages;

import base.Base;
import org.openqa.selenium.By;
import support.Utilities;

public class BookDetails extends Base {

	By shesherKobitaCartBtn = By.xpath("(//span[@id='js--add-to-cart-button'])[2]");
	By afterCartPopup = By.xpath("//button[@class='close js--btn-close-feature-popup']//span[@aria-hidden='true'][normalize-space()='×']");
	By cartBtn = By.xpath("//a[@id='js-cart-menu']//*[name()='svg']");

	Utilities utils = new Utilities();

	public void addToCart(){

		if (!utils.getWebElement(shesherKobitaCartBtn).isDisplayed()){
			utils.getWebElement(shesherKobitaCartBtn).click();
			utils.waitForElement(afterCartPopup);
			utils.getWebElement(afterCartPopup).click();
		} else {
			System.out.println("Book already is in cart.");
		}


	}

	public CartPage goToCart(){
		utils.getWebElement(cartBtn).click();

		return new CartPage();
	}
}
