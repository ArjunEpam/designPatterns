package gofDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class MyInternetExplorerDriverFactory implements WebDriverFactory {
    @Override
    public WebDriver createWebDriver() {
        System.setProperty("webdriver.ie.driver", "path/to/IEDriverServer.exe");
        return new InternetExplorerDriver();
    }
}
