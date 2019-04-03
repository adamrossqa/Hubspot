package com.hubspot.qa.tests;

import com.hubspot.qa.base.TestBase;
import com.hubspot.qa.pages.ContactsPage;
import com.hubspot.qa.pages.HomePage;
import com.hubspot.qa.pages.IntroductionPage;
import com.hubspot.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactsPageTest extends TestBase {

    IntroductionPage introductionPage;
    LoginPage loginPage;
    HomePage homePage;
    ContactsPage contactsPage;

    public ContactsPageTest() {
        super();
    }

    @BeforeMethod

    public void setUp() {
        initialization();
        introductionPage = new IntroductionPage();
        loginPage = new LoginPage();
        contactsPage = new ContactsPage();
        homePage = new HomePage();
        introductionPage.LogIn();
        loginPage.logIn(prop.getProperty("username"), prop.getProperty("password"));
        homePage.clickOnContactsPageLink();

    }

    @Test
    public void contactsPageTitleVerification(){
        String title = driver.getTitle();
        Assert.assertEquals(title,"Contacts");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
