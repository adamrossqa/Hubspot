package com.hubspot.qa.pages;

import com.hubspot.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends TestBase {

    @FindBy(xpath = "//input[@id='username']")
    WebElement emailAddress;
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;
    @FindBy(xpath = "//button[@id='loginBtn']")
    WebElement logInBtn;

    public String loginPageTitleVerification() {
        return driver.getTitle();
    }

    public HomePage logIn(String userName, String pasw) {

        password.sendKeys(pasw);
        emailAddress.sendKeys(userName);
        logInBtn.click();
        return new HomePage();
    }

}
