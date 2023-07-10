package support;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Commons extends Base {

    Utilities utils = new Utilities();


    /**
     * this method is to close the Ad on the HomePage
     */
    public void closeAd(By locator){
        try {
            utils.waitForElement(locator, 3);

            WebElement element = utils.getWebElement(locator);

            if (element.isDisplayed()){
                element.click();
            }
        }catch (Exception e){
            System.out.println("[i] Homepage Ad is not present.");
        }

    }

    /**
     * This method will get the name of the logged user
     * @return Logged user's name
     */
    public String getLoggedUserName(By locator){

        return utils.getWebElement(locator).getText();
    }

}
