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
    WebElement buttonName;
    @FindBy(xpath = "(//span[@class='private-table-sort-toggle__inner'])[2]")
    WebElement buttonEmail;
    @FindBy(xpath = "(//span[@class='private-table-sort-toggle__inner'])[3]")
    WebElement buttonPhoneNumber;
    @FindBy(xpath = "(//span[@class='private-table-sort-toggle__inner'])[4]")
    WebElement buttonContactOwner;
    @FindBy(xpath = "(//span[@class='private-table-sort-toggle__inner'])[5]")
    WebElement buttonLastActivityDate;
    @FindBy(xpath = "(//span[@class='private-table-sort-toggle__inner'])[6]")
    WebElement buttonLastContacted;
    @FindBy(xpath = "(//span[@class='private-table-sort-toggle__inner'])[7]")
    WebElement buttonLeadStatus;
    @FindBy(xpath = "(//span[@class='private-table-sort-toggle__inner'])[8]")
    WebElement buttonCreateDate;

    public String contactsPageTitleVerification() {
        return driver.getTitle();
    }

    public void clickCreateContactButton() {
        buttonCreateContact.click();
    }

    public void clickActionButton() {
        buttonActionsDropDown.click();
    }

    public void clickImportButton() {
        buttonImport.click();
    }

    public void clickSearchContactsForm() {
        searchContactsInputForm.click();
    }

    public void clickAllContactsButton() {
        buttonAllContacts.click();
    }

    public void clickNameButton() {
        buttonName.click();
    }

    public void clickEmailButton() {
        buttonEmail.click();
    }

    public void clickPhoneNumberButton() {
        buttonPhoneNumber.click();
    }

    public void clickContactOwnerButton() {
        buttonContactOwner.click();
    }

    public void clickLastActivityDateButton() {
        buttonLastActivityDate.click();
    }

    public void clickLastContactedButton() {
        buttonLastContacted.click();
    }

    public void clickLeadStatusButton() {
        buttonLeadStatus.click();
    }

    public void clickCreateDateButton() {
        buttonCreateDate.click();
    }
}




















