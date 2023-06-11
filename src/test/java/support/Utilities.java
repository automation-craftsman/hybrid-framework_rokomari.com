package support;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utilities extends Base {

//    *** Fixed ***

    Actions act;
    public void waitForElement(By locator){
        WebElement elm = driver.findElement(locator);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(elm));
    }

    public void scrollToElement(By locator){
        WebElement elm = driver.findElement(locator);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", elm);
    }

    public Actions hoverOverElement(By locator){
        WebElement elm = driver.findElement(locator);
        act = new Actions(driver);
        return act.moveToElement(elm);
    }

    /**
     * this method is to close the Ad on the HomePage
     */
    public void closeAd(By locator){
        try {
            waitForElement(locator);

            WebElement element = driver.findElement(locator);

            if (element.isDisplayed()){
                element.click();
            }
        }catch (Exception e){
            System.out.println("[i] Homepage Ad is not present.");
        }

    }

    public void viewBookDetails(By locator){

        driver.findElement(locator).click();
    }

    /**
     * This method will get the name of the logged user
     * @return Logged user's name
     */
    public String getLoggedUserName(By locator){

        return driver.findElement(locator).getText();
    }

    public void selectFromDropdownByVisibleText(By locator, String text){

        Select item = new Select(driver.findElement(locator));

        item.selectByVisibleText(text);
    }

    private void waitForElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(element));

    }



}
