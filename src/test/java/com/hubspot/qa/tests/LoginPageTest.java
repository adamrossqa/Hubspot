package com.hubspot.qa.tests;
//Adam Ross
import com.hubspot.qa.base.TestBase;
import com.hubspot.qa.pages.HomePage;
import com.hubspot.qa.pages.IntroductionPage;
import com.hubspot.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    LoginPage loginPage;
    IntroductionPage introductionPage;

    public LoginPageTest() {
        super();
    }

    @BeforeMethod

    public void setUp() {
        initialization();
        introductionPage = new IntroductionPage();
        loginPage = new LoginPage();
        introductionPage.LogIn();
    }
    @Test
    public void loginPageTitleVerificationTest() {
        String title = loginPage.loginPageTitleVerification();
        Assert.assertEquals(title, "HubSpot Login");
    }
    @Test
    public void loginPageTest() {
        loginPage.logIn(prop.getProperty("username"), prop.getProperty("password"));
    }
    @AfterMethod
    public void tearDown() {
       // driver.quit();
    }

}
