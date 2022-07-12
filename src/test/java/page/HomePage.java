package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    final WebDriver webDriver;

    @FindBy(xpath="//button[text()=\"Log In\"]")
    WebElement loginButton;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
        this.webDriver = webDriver;
    }

    public LoginPage clickOnLoginButton(){
        logInfo("Clicking on login button");
        loginButton.click();
        return PageFactory.initElements(webDriver, LoginPage.class);
    }
}
