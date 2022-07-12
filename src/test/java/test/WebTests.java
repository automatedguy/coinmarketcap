package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.HomePage;
import page.LoginPage;
import setup.BaseWebTest;

import static org.testng.Assert.assertEquals;

public class WebTests extends BaseWebTest {
    HomePage homePage;

    @BeforeMethod
    public void openHomePage(){
        homePage = PageFactory.initElements(getWebDriver(), HomePage.class);
    }

    @Test
    public void verifyHomePageTitle(){
        assertEquals(homePage.getTitle(), "Cryptocurrency Prices, Charts And Market Capitalizations | CoinMarketCap");
    }

    @Test
    public void loginTest(){
        LoginPage loginPage = homePage.clickOnLoginButton();
        loginPage.enterEmailAddress("asd@asd.net");
        loginPage.enterPassword("xxxxxxxxxx");
    }
}
