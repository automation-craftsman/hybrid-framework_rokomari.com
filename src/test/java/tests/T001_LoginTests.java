package tests;

import base.Base;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import pages.HomePage;

public class T001_LoginTests extends Base {

    HomePage homePage = new HomePage();

    /**
     * This method is to test login functionality
     */
    @Test(priority = 1, description = "Login with Gmail account.")
    @Description("Check login with Gmail Account.")
    @Severity(SeverityLevel.BLOCKER)
    public void gmailLoginTest(){
        homePage.checkLogin();

    }

}
