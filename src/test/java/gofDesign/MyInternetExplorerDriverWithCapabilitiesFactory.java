package gofDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class MyInternetExplorerDriverWithCapabilitiesFactory implements WebDriverFactory {
    @Override
    public WebDriver createWebDriver() {
        System.setProperty("webdriver.ie.driver", "path/to/IEDriverServer.exe");
        InternetExplorerOptions options = new InternetExplorerOptions();
        // Set additional Internet Explorer options if needed
        return new InternetExplorerDriver(options);
    }
}
