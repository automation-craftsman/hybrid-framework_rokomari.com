package pages;

import base.Base;
import org.openqa.selenium.By;
import support.Utilities;

public class ShippingPage extends Base {

	Utilities utils  = new Utilities();

	private By nameField = By.xpath("(//input[@id='name'])[1]");
	private By phoneField = By.xpath("(//input[@id='phone'])[1]");
	private By cityDropDown = By.xpath("//select[@id='js--city']");
	private By areaDropDown = By.xpath("//select[@id='js--area']");
	private By addressField = By.xpath("//fieldset[@class='mb-0']//textarea[@id='address']");
	private By bKash = By.xpath("//img[@alt='bkash']");
	private By ackCheckBox = By.xpath("//label[contains(text(),'এই শর্তগুলো মেনে অর্ডার প্রদান করছি।')]");
	private By confirmBtn = By.xpath("//span[normalize-space()='Confirm Order']");

	private By goHomeButton = By.xpath("//img[@alt='Rokomari.com']");

	String address  = """
			House : X001,
			Road : Unknown
			""";

	public void fillOutFormDetails(){
		System.out.println("[-] ShippingPage : Filing out purchase info...");
		utils.getWebElement(nameField).clear();
		utils.getWebElement(nameField).sendKeys(prop.getProperty("name"));

		utils.getWebElement(phoneField).click();
		utils.getWebElement(phoneField).sendKeys(prop.getProperty("phone"));

		utils.selectFromDropdownByVisibleText(cityDropDown, "ঢাকা");

		utils.selectFromDropdownByVisibleText(areaDropDown, "বনশ্রী");

		utils.getWebElement(addressField).sendKeys(address);

		utils.scrollPageTo("bottom");

		utils.getWebElement(bKash).click();
		utils.getWebElement(ackCheckBox).click();
	}

	public void confirmOrder(){

		utils.scrollPageTo("bottom");
		System.out.println("[-] ShippingPage : Pressing " + "'" + utils.getWebElement(confirmBtn).getText() +
				"'" + " to confirm order...");
	}

	public HomePage goToHome(){

		System.out.println("[-] ShippingPage : Order confirmed. Heading back to home.");
		utils.getWebElement(goHomeButton).click();

		return new HomePage();
	}

}
