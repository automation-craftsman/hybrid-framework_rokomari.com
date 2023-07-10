package pages;

import base.Base;
import org.openqa.selenium.By;
import support.Commons;
import support.Utilities;

public class HomePage extends Base {

    private By homePageAd = By.xpath("//img[@alt='close']");
    private By homePageSignInButton = By.xpath("//a[normalize-space()='Sign in']");
    private By userNameButton = By.xpath("//span[@class='user-name']");
    private By authorSubMenu = By.xpath("//a[@id='js--authors']");
    private By authorName = By.xpath("//a[contains(text(),'রবীন্দ্রনাথ ঠাকুর')]");
    private By signOutBtn = By.xpath("//a[normalize-space()='Sign Out']");

    Utilities utils = new Utilities();
    Commons common = new Commons();


    /**
     * Will select books of Rabindranath and
     * @return an object of the BooksByAuthor page
     */
    public BooksByAuthorPage selectBookByRabindranath(){
        common.closeAd(homePageAd);

        System.out.println("[-] HomePage : Selecting 'Rabindranath Tagore' from Author's list");
        utils.hoverOverElement(authorSubMenu);
        utils.getWebElement(authorName).click();

        return new BooksByAuthorPage();
    }

    public void logOut(){
        common.closeAd(homePageAd);

        if (utils.getWebElement(userNameButton).isDisplayed()){
            System.out.println("[-] HomePage : Logging out active user.");
            utils.getWebElement(userNameButton).click();
            utils.getWebElement(signOutBtn).click();
        }else {
            System.out.println("[-] HomePage : No active user logged in.");
        }
    }

}
