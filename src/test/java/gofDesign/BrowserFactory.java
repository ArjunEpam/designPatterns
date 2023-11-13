package gofDesign;

public class BrowserFactory {
    public static Browser getBrowser(String browserType) {
        switch (browserType.toLowerCase()) {
            case "chrome":
                return new MyChromeDriver();
            case "firefox":
                return new MyFirefoxDriver();
            case "ie":
                return new MyInternetExplorerDriver();
            default:
                throw new IllegalArgumentException("Unsupported browser type: " + browserType);
        }
    }
}
