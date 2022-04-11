package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;

public class LogOutTest extends BaseTest{

    private static final String EMAIL = "outthedj@gmail.com";
    private static final String PASSWORD = "2807389out";

    @Test(description = "Check logout")
    public void logOutTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login(EMAIL, PASSWORD);

        MainPage mainPage = new MainPage();
        mainPage.clickOnLogOutButton();

        Assert.assertEquals(loginPage.isLoginLogoShown(),true);
    }
}
