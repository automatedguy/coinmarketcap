package setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.logging.Logger;

public class BaseWebTest {
    WebDriver webDriver;
    private final Logger logger = Logger.getLogger("setup.BaseWebTest");

    @BeforeClass
    public void setUpChromeDriver(){
        logInfo("Running driver setup");
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setUp() {
        startBrowser();
        maximizeBrowserWindow();
        openBaseUrl();
    }

    public void startBrowser(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--window-size=1400,800");
        logInfo("Starting browser");
        webDriver = new ChromeDriver(chromeOptions);
    }

    public void closeBrowser(){
        logInfo("Closing browser");
        webDriver.close();
    }

    public void maximizeBrowserWindow(){
        logInfo("Maximizing browser window");
        webDriver.manage().window().maximize();
    }
    public void openBaseUrl(){
        logInfo("Opening base URL");
        webDriver.get("https://coinmarketcap.com/");
    }

    public void logInfo(String info){
        logger.info(info);
    }

    public WebDriver getWebDriver(){
        return webDriver;
    }

    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }
}