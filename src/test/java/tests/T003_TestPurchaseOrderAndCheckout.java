package tests;

import base.Base;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.ShippingPage;

public class T003_TestPurchaseOrderAndCheckout extends Base {

    @Test(description = "Checkout and confirm purchase order.")
    @Description("Checkout the selected book and confirm order.")
    @Severity(SeverityLevel.CRITICAL)
    public void bookCheckoutTest(){
        CartPage cartPage = new CartPage();
        cartPage.getCartList();
        ShippingPage shippingPage = cartPage.placeOrder();
        shippingPage.fillOutFormDetails();
        shippingPage.confirmOrder();
        HomePage homePage = shippingPage.goToHome();

    }
}
