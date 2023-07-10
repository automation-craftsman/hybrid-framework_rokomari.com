package tests;

import base.Base;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import pages.BooksByAuthorPage;
import pages.HomePage;

public class T001_TestBookFilter extends Base {

    HomePage homePage;

    @Test(description = "Book Filtering test.")
    @Description("Filter the book of choice.")
    @Severity(SeverityLevel.CRITICAL)
    public void filterBookTest(){

        homePage = new HomePage();
        BooksByAuthorPage booksByAuthorPage = homePage.selectBookByRabindranath();
        booksByAuthorPage.filterBooks();
    }
}
