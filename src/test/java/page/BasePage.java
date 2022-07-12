package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Logger;

public abstract class BasePage {
    private final WebDriver webDriver;
    private final Logger logger = Logger.getLogger("page.BasePage");
    public WebDriverWait webDriverWait;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
    }

    public void logInfo(String info){
        logger.info(info);
    }

    public void waitUntilElementIsVisible(WebElement webElement){
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public String getTitle(){
        return webDriver.getTitle();
    }
}
