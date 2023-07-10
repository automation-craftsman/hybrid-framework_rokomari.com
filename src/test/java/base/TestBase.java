package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import support.Utilities;

public class TestBase {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        By languageFilter = By.xpath("//p[normalize-space()='Languages']");
        By clickable = By.xpath("//label[contains(text(),'বিশ্বসাহিত্য কেন্দ্র')]");

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");

        driver = WebDriverManager.chromedriver().capabilities(options).create();

//        driver.manage().window().maximize();
        driver.get("https://www.rokomari.com/book/author/930/rabindranath-tagore?sort=SOLD_COUNT_DESC&inStock=on&categoryIds=678&priceRange=0to66000&discountRange=0to100");

        WebElement elm = driver.findElement(languageFilter);

        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", elm);
//        driver.findElement(clickable).click();

        Thread.sleep(2000);
        driver.quit();
    }
}
