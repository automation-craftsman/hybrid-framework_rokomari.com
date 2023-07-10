package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import support.Utilities;

import java.util.List;

public class CartPage extends Base {

	Utilities utils = new Utilities();

	private By cartBookList = By.xpath("//div[@class='book-info__content--book-meta']");
	private By placeOrderBtn = By.xpath("(//span[normalize-space()='Place Order'])[1]");

	public void getCartList(){

		List<WebElement> bookList = utils.getListOfWebElements(cartBookList);
		System.out.println("[-] CartPage : Found the following books in the cart list: ");
		for (WebElement book : bookList){
			System.out.println(book.getText());
		}

	}

	public ShippingPage placeOrder(){

		System.out.println("[-] CartPage : Placing order...");
		utils.getWebElement(placeOrderBtn).click();

		return new ShippingPage();
	}

}
