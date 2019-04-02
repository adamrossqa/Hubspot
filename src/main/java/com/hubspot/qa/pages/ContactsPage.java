package com.hubspot.qa.pages;

import com.hubspot.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends TestBase {

    @FindBy(xpath = "//input[@type='search']")
    WebElement searchContactsInputForm;
    @FindBy(xpath = "//button[@aria-owns='dropdown-354']")
    WebElement buttonActionsDropDown;
    @FindBy(xpath = "//a[@data-onboarding='import-button']")
    WebElement buttonImport;
    @FindBy(xpath = "//button[@data-onboarding='new-object-button']")
    WebElement buttonCreateContact;
    @FindBy(xpath = "//a[contains(@class,'private-link uiLinkWithoutUnderline uiLinkDark f')]")
    WebElement buttonAllContacts;
    @FindBy(xpath = "(//span[@class='private-table-sort-toggle__inner'])[1]")
    WebElement tableSortLinkName;
    @FindBy(xpath = "(//span[@class='private-table-sort-toggle__inner'])[2]")
    WebElement tableSortLinkEmail;
    @FindBy(xpath = "(//span[@class='private-table-sort-toggle__inner'])[3]")
    WebElement tableSortLinkPhoneNumber;
    @FindBy(xpath = "(//span[@class='private-table-sort-toggle__inner'])[4]")
    WebElement tableSortLinkContactOwner;
    @FindBy(xpath = "(//span[@class='private-table-sort-toggle__inner'])[5]")
    WebElement tableSortLinkLastActivityDate;
    @FindBy(xpath = "(//span[@class='private-table-sort-toggle__inner'])[6]")
    WebElement tableSortLinkLastContacted;
    @FindBy(xpath = "(//span[@class='private-table-sort-toggle__inner'])[7]")
    WebElement tableSortLinkLeadStatus;
    @FindBy(xpath = "(//span[@class='private-table-sort-toggle__inner'])[8]")
    WebElement tableSortLinkCreateDate;


    public String contactsPageTitleVerification() {
        return driver.getTitle();

    }
    public void clickCreateContact(){
        buttonCreateContact.click();
    }

}




















