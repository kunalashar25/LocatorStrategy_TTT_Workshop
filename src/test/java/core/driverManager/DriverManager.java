package core.driverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class DriverManager {

    private String pageUrl = "";

    /**
     * Navigate to Home Page
     *
     * @return WebDriver instance
     */
    public WebDriver loadHomePage() {
        WebDriver driver = createDriver();
        driver.get(pageUrl);

        return driver;
    }

    /**
     * Create new driver
     *
     * @return WebDriver
     */
    private WebDriver createDriver() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));

        // maximize window
        driver.manage().window().maximize();

        return driver;
    }

    /**
     * Set Chrome options
     *
     * @return options
     */
    private ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        return options;
    }
}
