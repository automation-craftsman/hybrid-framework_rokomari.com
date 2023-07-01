package pages;

import base.Base;
import org.openqa.selenium.By;
import support.Utilities;

public class ShippingPage extends Base {

	Utilities utils  = new Utilities();

	By nameField = By.xpath("(//input[@id='name'])[1]");
	By phoneField = By.xpath("(//input[@id='phone'])[1]");
	By cityDropDown = By.xpath("//select[@id='js--city']");
	By areaDropDown = By.xpath("//select[@id='js--area']");
	By addressField = By.xpath("//fieldset[@class='mb-0']//textarea[@id='address']");
	By bKash = By.xpath("//img[@alt='bkash']");
	By ackCheckBox = By.xpath("//label[contains(text(),'এই শর্তগুলো মেনে অর্ডার প্রদান করছি।')]");
	By confirmBtn = By.xpath("//span[normalize-space()='Confirm Order']");

	String address  = """
			House : X001,
			Road : Unknown
			""";

	public void fillOutFormDetails(){
		utils.getWebElement(nameField).clear();
		utils.getWebElement(nameField).sendKeys(prop.getProperty("name"));

		utils.getWebElement(phoneField).click();
		utils.getWebElement(phoneField).sendKeys(prop.getProperty("phone"));

		utils.selectFromDropdownByVisibleText(cityDropDown, "ঢাকা");

		utils.selectFromDropdownByVisibleText(areaDropDown, "বনশ্রী");

		utils.getWebElement(addressField).sendKeys(address);
		utils.getWebElement(bKash).click();
		utils.getWebElement(ackCheckBox).click();

	}

	public void confirmOrder(){

		System.out.println("Pressing " + utils.getWebElement(confirmBtn).getText() + "button...");
	}

}
