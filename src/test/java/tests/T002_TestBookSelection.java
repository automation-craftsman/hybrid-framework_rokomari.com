package tests;

import base.Base;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import pages.BooksByAuthorPage;
import pages.CartPage;

public class T002_TestBookSelection extends Base {

    @Test(description = "Select book after filtering.")
    @Description("Select book by Author after filtering out the boom of choice.")
    @Severity(SeverityLevel.CRITICAL)
    public void selectBookTest(){

        BooksByAuthorPage booksByAuthorPage = new BooksByAuthorPage();
        booksByAuthorPage.addBooksToCart();
        CartPage cartPage = booksByAuthorPage.goToCart();

    }

}
