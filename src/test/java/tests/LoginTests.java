package tests;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTests extends Base {

    HomePage homePage = new HomePage();

    /**
     * This method is to test login functionality with invalid user credentials
     */
    @Test(priority = 1)
    public void gmailLoginTest(){
        homePage.checkLogin();

    }

}
