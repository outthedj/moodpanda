package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HowAreYouPage;
import pages.LoginPage;
import pages.MainPage;
import pages.MoodUpdatedPage;

public class MoodUpdatedTest extends BaseTest{

    private static final String EMAIL = "outthedj@gmail.com";
    private static final String PASSWORD = "2807389out";

    @Test(description = "Check Inscription")
    public void howAreYouTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.login(EMAIL, PASSWORD);
        MainPage mainPage = new MainPage();
        mainPage.clickonpostUpdatedButton();
        HowAreYouPage howAreYouPage = new HowAreYouPage();
        howAreYouPage.updatingMood();
        MoodUpdatedPage moodUpdatedPage = new MoodUpdatedPage();
        moodUpdatedPage.isMoodUpdatedDisplayed();
        Assert.assertTrue(moodUpdatedPage.isMoodUpdatedDisplayed(), "How are you?");
    }
}
