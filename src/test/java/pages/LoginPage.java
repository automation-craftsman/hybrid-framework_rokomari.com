package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import support.Utilities;

public class LoginPage extends Base {

//    *** Fixed ***

    Utilities utils = new Utilities();

    By googleBtn = By.xpath("//button[normalize-space()='Google']");
    By googleEmail = By.xpath("(//div[@class='WBW9sf'])[1]");
    By emailPassword = By.xpath("//input[@name='password']");
    By nextBtn = By.xpath("//span[normalize-space()='Next']");


    /**
     * Will Sign In using the Gmail Account
     */
    public void signInWithGmail(){

        driver.findElement(googleBtn).click();
        driver.findElement(googleEmail).click();
        driver.findElement(emailPassword).sendKeys(prop.getProperty("loginPassword"));
        driver.findElement(nextBtn).click();

    }
}
