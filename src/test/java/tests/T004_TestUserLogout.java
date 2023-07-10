package tests;

import base.Base;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import pages.HomePage;

public class T004_TestUserLogout extends Base {

    HomePage homePage;

    @Test(description = "Check logout functionality.")
    @Description("Logout if any user is logged in.")
    @Severity(SeverityLevel.BLOCKER)
    public void logoutUserTest(){

        homePage.logOut();
    }
}
