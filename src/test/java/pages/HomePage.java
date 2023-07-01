package pages;

import base.Base;
import org.openqa.selenium.By;
import support.Commons;
import support.Utilities;

public class HomePage extends Base {

    By homePageAd = By.xpath("//img[@alt='close']");
    By homePageSignInButton = By.xpath("//a[normalize-space()='Sign in']");
    By loggedUserName = By.xpath("//span[@class='user-name']");
    By authorHeader = By.xpath("//a[@id='js--authors']");
    By authorName = By.xpath("//a[contains(text(),'রবীন্দ্রনাথ ঠাকুর')]");
    By signOutBtn = By.xpath("//a[normalize-space()=\"Sign Out\"]");

    Utilities utils = new Utilities();
    Commons common = new Commons();

    /**
     * This method checks whether the user is logged in or not
     * If user is already logged in then it will not try otherwise it will call the login function from the LoginPage
     * and log in accordingly
     */
    public void checkLogin(){
        common.closeAd(homePageAd);

        if (utils.getWebElement(homePageSignInButton).isDisplayed()){

            utils.getWebElement(homePageSignInButton).click();

            LoginPage loginPage = new LoginPage();

            loginPage.signInWithGmail();

        }else {
            System.out.println(common.getLoggedUserName(loggedUserName) + " already logged in.");
        }

    }


    /**
     * Will select books of Rabindranath and
     * @return an object od the BooksByAuthor page
     */
    public BooksByAuthor selectBookByRabindranath(){
        common.closeAd(homePageAd);

        var action = utils.hoverOverElement(authorHeader);
        action.moveToElement(utils.getWebElement(authorName)).click().perform();

        return new BooksByAuthor();
    }

    public void logOut(){
        if (utils.getWebElement(loggedUserName).isDisplayed()){
            utils.getWebElement(loggedUserName).click();
            utils.getWebElement(signOutBtn).click();
        }else {
            System.out.println("No logged user found.");
        }
    }

}
