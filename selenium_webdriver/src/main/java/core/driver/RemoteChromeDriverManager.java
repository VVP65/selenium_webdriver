package core.driver;

import core.service.TestDataReader;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteChromeDriverManager extends DriverManager {

    private static final String GRID_HOST_URL = "grid.host";

    public RemoteChromeDriverManager() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(DriverType.CHROME_REMOTE.getBrowser());

        try {
            driver = new RemoteWebDriver(new URL(TestDataReader.getTestData(GRID_HOST_URL)), capabilities);
        } catch (
                MalformedURLException exception) {

            exception.printStackTrace();
        }
    }
}