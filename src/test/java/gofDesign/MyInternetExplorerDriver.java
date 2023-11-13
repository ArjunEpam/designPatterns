package gofDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class MyInternetExplorerDriver implements Browser {
    @Override
    public void initialize() {
        System.setProperty("webdriver.ie.driver", "path/to/IEDriverServer.exe");
        InternetExplorerOptions options = new InternetExplorerOptions();
        // Set additional Internet Explorer options if needed
        WebDriver driver = new InternetExplorerDriver(options);
        // Do any additional setup if required
    }
}
