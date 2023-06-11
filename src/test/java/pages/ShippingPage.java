package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
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
		driver.findElement(nameField).clear();
		driver.findElement(nameField).sendKeys(prop.getProperty("name"));

		driver.findElement(phoneField).click();
		driver.findElement(phoneField).sendKeys(prop.getProperty("phone"));

		utils.selectFromDropdownByVisibleText(cityDropDown, "ঢাকা");

		utils.selectFromDropdownByVisibleText(areaDropDown, "বনশ্রী");

		driver.findElement(addressField).sendKeys(address);
		driver.findElement(bKash).click();
		driver.findElement(ackCheckBox).click();

	}

	public void confirmOrder(){
		driver.findElement(confirmBtn).click();
	}

}
