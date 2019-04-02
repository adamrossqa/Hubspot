package com.hubspot.qa.tests;

import com.hubspot.qa.base.TestBase;
import com.hubspot.qa.pages.IntroductionPage;
import com.hubspot.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IntroductionPageTest extends TestBase {


    IntroductionPage introductionPage;
    LoginPage loginPage;


    public IntroductionPageTest() {
        super();
    }
    @BeforeMethod
    public void setUp() {

        initialization();
        introductionPage = new IntroductionPage();
    }
    @Test
    public void introductionPageTitleTest() {

        String title = introductionPage.validateIntroductionPageTitle();
        Assert.assertEquals(title, "HubSpot | Inbound Marketing, Sales, and Service Software");
    }
    @Test
    public void validateHutSpotLogoTest() {
        boolean flag = introductionPage.validateHubspotLogo();
        Assert.assertTrue(flag);

    }
    @Test
    public void logInTest() {
       loginPage = introductionPage.LogIn();
    }
    @AfterMethod
    public void tearDown() {

       driver.quit();
    }
}
