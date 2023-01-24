package core.driver;

import core.service.TestDataReader;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteChromeDriverManager extends DriverManager {

    private static final String GRID_URL_PROPERTY = "grid.host";

    public RemoteChromeDriverManager() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(DriverType.CHROME_REMOTE.getBrowser());

        try {
            driver = new RemoteWebDriver(new URL(TestDataReader.getTestData(GRID_URL_PROPERTY)), capabilities);
        } catch (
                MalformedURLException exception) {

            exception.printStackTrace();

            throw new NotImplementedException("No supported Webdriver were found. " +
                    "Supported browsers are: Chrome, Firefox, Edge");
        }
    }
}