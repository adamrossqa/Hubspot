package com.hubspot.qa.pages;

import com.hubspot.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateContactFormPage extends TestBase {

    @FindBy(xpath = "//input[@data-field='email']")
    WebElement email;
    @FindBy(xpath = "//input[@data-field='firstname']")
    WebElement firstName;
    @FindBy(xpath = "//input[@data-field='lastname']")
    WebElement lastName;
    @FindBy(xpath = "//span[contains(@class,'private-dropdown')]//span[@role='presentation']")
    WebElement contactOwnerDropDown;
    @FindBy(xpath = "//input[@data-field='jobtitle']")
    WebElement jobTitle;
    @FindBy(xpath = "//button[contains(@class,'uiButton private-button private-button--default private-button--primary p')]")
    WebElement createContactButton;
    @FindBy(xpath = " //button[contains(@class,'uiButton private-button private-button--default private-button--secondary pull')]")
    WebElement createAndAddAnotherButton;
    @FindBy(xpath = " //button[contains(@class,'uiButton private-button private-button--default private-button--secondary private-button--n')]")
    WebElement cancelButton;
}
