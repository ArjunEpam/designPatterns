package gofDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class MyFirefoxDriverWithCapabilitiesFactory implements WebDriverFactory {
    @Override
    public WebDriver createWebDriver() {
        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");
        FirefoxOptions options = new FirefoxOptions();
        // Set additional Firefox options if needed
        return new FirefoxDriver(options);
    }
}
