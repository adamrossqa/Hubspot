package com.hubspot.qa.pages;

import com.hubspot.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IntroductionPage extends TestBase {

    @FindBy(xpath = "//a[@class='cta--secondary cta--small']")
    WebElement logInButton;
    @FindBy(xpath = "//img[@alt='HubSpot Logo'][@src='https://www.hubspot.com/hubfs/HubSpot_Logos/HSLogo_color.svg']")
    WebElement HubspotLogo;
    @FindBy(xpath = "//a[@id='hs-eu-confirmation-button']")
    WebElement popup;

    public String validateIntroductionPageTitle() {
        return driver.getTitle();
    }

    public boolean validateHubspotLogo() {
        return HubspotLogo.isDisplayed();
    }

    public LoginPage LogIn() {
        popup.click();
        logInButton.click();
        return new LoginPage();
    }
}