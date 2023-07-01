package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        String text = "Launched using Chrome DevTools";

//        String driverPath = "D:\\SQA\\webdriver_java\\rokomari.com_automation\\src\\test\\resources\\chromedriver.exe";
//
//        System.setProperty("webdriver.chrome.driver", driverPath);

//        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");

//        driver = WebDriverManager.chromedriver().create();
        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]")).sendKeys(text);

        Thread.sleep(2000);

        driver.quit();


    }
}
