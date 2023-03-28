package core.driver;

import core.enums.DriverType;
import core.service.TestDataReader;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteChromeDriverManager extends DriverManager {

    private static final String GRID_URL_PROPERTY = "grid.host";

    public RemoteChromeDriverManager() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(DriverType.CHROME.getBrowser());

        try {
            driver = new RemoteWebDriver(new URL(TestDataReader.getEnvData(GRID_URL_PROPERTY)), capabilities);
        } catch (
                MalformedURLException exception) {

            exception.printStackTrace();

            throw new RuntimeException("No legal protocol could be found or supported Webdriver were not found. " +
                    "Supported browsers are: Chrome, Firefox, Edge");
        }
    }
}