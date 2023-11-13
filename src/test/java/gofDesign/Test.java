package gofDesign;

import org.openqa.selenium.WebDriver;

public class Test {
    public static void main(String[] args) {
        Browser chrome = BrowserFactory.getBrowser("chrome");
        chrome.initialize();

        Browser firefox = BrowserFactory.getBrowser("firefox");
        firefox.initialize();

        Browser ie = BrowserFactory.getBrowser("ie");
        ie.initialize();

        WebDriverFactory chromeFactory = new MyChromeDriverFactory();
        WebDriver chromeDriver = chromeFactory.createWebDriver();

        WebDriverFactory chromeWithCapabilitiesFactory = new MyChromeDriverWithCapabilitiesFactory();
        WebDriver chromeDriverWithCapabilities = chromeWithCapabilitiesFactory.createWebDriver();

    }
}
