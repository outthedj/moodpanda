package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CrisisCenterPage;
import pages.LoginPage;
import pages.MainPage;

public class CrisisCenterTest extends BaseTest{

    private static final String EMAIL = "outthedj@gmail.com";
    private static final String PASSWORD = "2807389out";

    @Test(description = "Check Crisis Inscription")
    public void isCrisisInscriptionVisible() {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login(EMAIL, PASSWORD);
        MainPage mainPage = new MainPage();
        mainPage.clickOnCrisisButton();
        CrisisCenterPage crisisCenterPage = new CrisisCenterPage();
        crisisCenterPage.isCrisisCenterDisplayed();
        Assert.assertTrue(crisisCenterPage.isCrisisCenterDisplayed(), "Crisis center");
    }
}
