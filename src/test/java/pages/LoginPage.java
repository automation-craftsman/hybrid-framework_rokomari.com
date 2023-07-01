package pages;

import base.Base;
import org.openqa.selenium.By;
import support.Utilities;

public class LoginPage extends Base {

    Utilities utils = new Utilities();

    By googleBtn = By.xpath("//button[normalize-space()='Google']");

    By otherEmailSignInBtn = By.xpath("//div[@class='BHzsHc']");
    By emailField = By.xpath("//input[@id='identifierId']");
    By afterEmailIDNextBtn = By.xpath("//span[normalize-space()='Next']");
    By passwordField = By.xpath("//input[@name='Passwd']");
    By afterPasswordNextBtn = By.xpath("//span[normalize-space()='Next']");


    /**
     * Will Sign In using the Gmail Account
     */
    public void signInWithGmail(){

        utils.getWebElement(googleBtn).click();

//        if (utils.getWebElement(otherEmailSignInBtn).isDisplayed()){
//            utils.getWebElement(otherEmailSignInBtn).click();
//        }else {
//            System.out.println("No active email found. Logging in for the first time.");
//        }

        utils.getWebElement(emailField).clear();
        utils.getWebElement(emailField).sendKeys(prop.getProperty("emailID"));
        utils.getWebElement(afterEmailIDNextBtn).click();

        utils.waitForElement(passwordField);

        utils.getWebElement(passwordField).clear();
        utils.getWebElement(passwordField).sendKeys(prop.getProperty("loginPassword"));
        utils.getWebElement(afterPasswordNextBtn).click();

    }
}
