package tests;

import base.Base;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import pages.BookDetails;
import pages.HomePage;

public class T002_PurchaseTests extends Base {

    HomePage homePage = new HomePage();

    BookDetails bookDetails;

    @Test(priority = 1, description = "Select and filter book by author and criteria.")
    @Description("Select book by Author and Filter out the choice.")
    @Severity(SeverityLevel.CRITICAL)
    public void selectBookTest(){
        var booksByAuthor = homePage.selectBookByRabindranath();
        booksByAuthor.filterBooks();
        bookDetails = booksByAuthor.viewDetails();
        bookDetails.addToCart();

    }

    @Test(priority = 2, description = "Checkout and confirm purchase order.")
    @Description("Checkout the selected book and confirm order.")
    @Severity(SeverityLevel.CRITICAL)
    public void bookCheckoutTest(){
        var cartPage = bookDetails.goToCart();
        cartPage.getCartList();
        var shippingPage = cartPage.placeOrder();
        shippingPage.fillOutFormDetails();
        shippingPage.confirmOrder();
    }

}
