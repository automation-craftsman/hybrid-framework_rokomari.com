package pages;

import base.Base;
import org.openqa.selenium.By;
import support.Utilities;

public class HomePage extends Base {

//    *** Fixed ***

    By homePageAd = By.xpath("//img[@alt='close']");
    By homePageSignInButton = By.xpath("//a[normalize-space()='Sign in']");
    By loggedUserMenu = By.xpath("//a[@id='dropdownMenu2']");
    By loggedUserName = By.xpath("//span[@class='user-name']");
    By authorHeader = By.xpath("//a[@id='js--authors']");
    By authorName = By.xpath("//a[contains(text(),'রবীন্দ্রনাথ ঠাকুর')]");

    Utilities utils = new Utilities();

    /**
     * This method checks whether the user is logged in or not
     * If user is already logged in then it will not try otherwise it will call the login function from the LoginPage
     * and log in accordingly
     */
    public void checkLogin(){
        utils.closeAd(homePageAd);

        if (driver.findElement(homePageSignInButton).isDisplayed()){

            driver.findElement(homePageSignInButton).click();

            LoginPage loginPage = new LoginPage();

            loginPage.signInWithGmail();

        }else {
            System.out.println(utils.getLoggedUserName(loggedUserName) + " already logged in.");
        }

    }


    /**
     * Will select books of Rabindranath and
     * @return an object od the BooksByAuthor page
     */
    public BooksByAuthor selectBookByRabindranath(){
        utils.closeAd(homePageAd);

        var action = utils.hoverOverElement(authorHeader);
        action.moveToElement(driver.findElement(authorName)).click().perform();

        return new BooksByAuthor();
    }

}
