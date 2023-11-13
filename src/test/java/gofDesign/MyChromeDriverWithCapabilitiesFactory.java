package gofDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyChromeDriverWithCapabilitiesFactory implements WebDriverFactory {
    @Override
    public WebDriver createWebDriver() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        ChromeOptions options = new ChromeOptions();
        // Set additional Chrome options if needed
        return new ChromeDriver(options);
    }
}
