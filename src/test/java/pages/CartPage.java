package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends Base {

	By cartBookList = By.xpath("//div[contains(@class,'cart-item js--cart-product-item cart-checked')]");
	By placeOrderBtn = By.xpath("(//span[normalize-space()='Place Order'])[1]");

	public void getCartList(){

		List<WebElement> bookList = driver.findElements(cartBookList);

		for (WebElement i : bookList){
			System.out.println(i);
		}

	}

	public ShippingPage placeOrder(){

		driver.findElement(placeOrderBtn).click();

		return new ShippingPage();
	}

}