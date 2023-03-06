package core.driver;

import core.enums.DriverType;

public class DriverManagerFactory {

    public static DriverManager getManager(DriverType driverType) {
        DriverManager driverManager = null;

        switch (driverType) {
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case FIREFOX:
                driverManager = new FirefoxDriverManager();
                break;
            case CHROME_REMOTE:
                driverManager = new RemoteChromeDriverManager();
                break;
            case EDGE:
                driverManager = new EdgeDriverManager();
                break;
            case CHROME_DECORATOR:
                driverManager = new ChromeDecoratorDriverManager();
        }

        return driverManager;
    }
}