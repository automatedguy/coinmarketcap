package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    WebDriver webDriver;

    @FindBy(xpath="//input[@type=\"email\"]")
    WebElement emailAddressInput;

    @FindBy(xpath="//input[@type=\"password\"]")
    WebElement passwordInput;


    public LoginPage(WebDriver webDriver) {
        super(webDriver);
        this.webDriver = webDriver;
    }

    public void enterEmailAddress(String emailAddress){
        logInfo("Filling email address: " + emailAddress);
        waitUntilElementIsVisible(emailAddressInput);
        emailAddressInput.sendKeys(emailAddress);
    }

    public void enterPassword(String password){
        logInfo("Filling password: " + password);
        waitUntilElementIsVisible(passwordInput);
        passwordInput.sendKeys(password);
    }
}
