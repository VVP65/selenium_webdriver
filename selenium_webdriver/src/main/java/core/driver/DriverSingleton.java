package core.driver;

import core.enums.DriverType;
import core.service.TestDataReader;
import lombok.Getter;
import org.openqa.selenium.WebDriver;

@Getter
public class DriverSingleton {

    private static DriverSingleton instance;
    private WebDriver driver;

    private DriverSingleton() {
        DriverType driverType = DriverType.getType((TestDataReader.getTestData("browser")));
        driver = DriverManagerFactory.getManager(driverType).getDriver();
    }

    public static DriverSingleton getInstance() {
        if (instance == null) {
            instance = new DriverSingleton();
        }

        return instance;
    }

    public void close() {
        driver.quit();
        instance = null;
    }
}