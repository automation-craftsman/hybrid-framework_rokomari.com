package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import support.Utilities;

import java.util.List;

public class CartPage extends Base {

	Utilities utils = new Utilities();

	By cartBookList = By.xpath("//div[contains(@class,'cart-item js--cart-product-item cart-checked')]");
	By placeOrderBtn = By.xpath("(//span[normalize-space()='Place Order'])[1]");

	public void getCartList(){

		List<WebElement> bookList = utils.getListOfWebElements(cartBookList);

		for (WebElement book : bookList){
			System.out.println(book);
		}

	}

	public ShippingPage placeOrder(){

		utils.getWebElement(placeOrderBtn).click();

		return new ShippingPage();
	}

}
