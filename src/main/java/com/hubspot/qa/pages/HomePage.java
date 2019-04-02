package com.hubspot.qa.pages;
//Adam Ross
import com.hubspot.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends TestBase {


    @FindBy(xpath = "//li[@role='none']//img[@class='logo']")
    WebElement homeLogo;

    @FindBy(xpath = "//span[contains(text(),'Test')]")
    WebElement accountNameLogo;

    @FindBy(xpath = "//a[@id='nav-primary-contacts-branch']//*[@class='nav-icon arrow-down-icon']")
    WebElement contactsLink;

    @FindBy(xpath = "//a[@id='nav-secondary-contacts'][@role='menuitem']")
    WebElement contactsPageLink;

    @FindBy(xpath = "//a[@id='nav-primary-conversations-branch']//*[@class='nav-icon arrow-down-icon']")
    WebElement conversationsLink;

    @FindBy(xpath = "//a[@id='nav-primary-marketing-branch']//*[@class='nav-icon arrow-down-icon']")
    WebElement marketingLink;

    @FindBy(xpath = "//a[@id='nav-primary-sales-branch']//*[@class='nav-icon arrow-down-icon']")
    WebElement salesLink;

    @FindBy(xpath = "//a[@id='nav-primary-service-branch']//*[@class='nav-icon arrow-down-icon']")
    WebElement serviceLink;

    @FindBy(xpath = "//a[@id='nav-primary-reports-branch']//*[@class='nav-icon arrow-down-icon']")
    WebElement reportsLink;

    @FindBy(xpath = "//span[@id='navSearch-cancel']")
    WebElement searchIcon;


    public String homePageTitleValidation() {
        return driver.getTitle();
    }

    public boolean homePageLogoValidation() {

        return homeLogo.isDisplayed();
    }
    public boolean accountNameValidation() {
        return accountNameLogo.isDisplayed();
    }

    public ContactsPage clickOnContactsPageLink() {
        contactsLink.click();
        contactsPageLink.click();
        return new ContactsPage();
    }
    public ContactsPage clickOnConversationPageLink() {
        conversationsLink.click();
        return new ContactsPage();
    }
    public MarketingPage clickOnMarketingPageLink() {
        marketingLink.click();
        return new MarketingPage();
    }
    public SalesPage clickOnSalesPageLink() {
        salesLink.click();
        return new SalesPage();
    }
    public ServicePage clickOnServicePageLink() {
        serviceLink.click();
        return new ServicePage();
    }
    public ReportsPage clickOnReportsPageLink() {
        reportsLink.click();
        return new ReportsPage();
    }
    public void clickOnSearchIcon() {
        searchIcon.click();
    }
}























