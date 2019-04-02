import com.hubspot.qa.base.TestBase;
import com.hubspot.qa.pages.HomePage;
import com.hubspot.qa.pages.IntroductionPage;
import com.hubspot.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    IntroductionPage introductionPage;
    LoginPage loginPage;
    HomePage homePage;

    public HomePageTest() {
        super();
    }
    @BeforeMethod
    public void setUp() {
        initialization();
        introductionPage = new IntroductionPage();
        loginPage = new LoginPage();
        homePage = new HomePage();
        introductionPage.LogIn();
        loginPage.logIn(prop.getProperty("username"), prop.getProperty("password"));
    }
    @Test
    public void homePageTitleValidationTest() {

        String title = homePage.homePageTitleValidation();
        Assert.assertEquals(title, "HubSpot Login");
    }
    @Test
    public void homePageLogoValidationTest() {
        boolean flag = homePage.homePageLogoValidation();
        Assert.assertTrue(flag);
    }
    @Test
    public void accountNameValidationTest() {
        boolean flag = homePage.accountNameValidation();
        Assert.assertTrue(flag);
    }
    @Test
    public void clickOnContactsPageLinkTest() {
        homePage.clickOnContactsPageLink();
    }
    @Test
    public void clickOnConversationPageLinkTest() {
        homePage.clickOnConversationPageLink();
    }
    @Test
    public void clickOnMarketingPageLinkTest() {
        homePage.clickOnMarketingPageLink();
    }
    @Test
    public void clickOnSalesPageLinkTest() {
        homePage.clickOnSalesPageLink();
    }
    @Test
    public void clickOnServicePageLinkTest (){
        homePage.clickOnServicePageLink();
    }
    @Test
    public void clickOnReportsPageLinkTest(){
        homePage.clickOnReportsPageLink();
    }
    @Test
    public void clickOnSrearchIconTest(){
        homePage.clickOnSearchIcon();
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}





















