package core.driver;

import core.patterns.CustomDriverDecorator;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDecoratorDriverManager extends DriverManager {

    public ChromeDecoratorDriverManager() {
        WebDriverManager.chromedriver().setup();
        driver = new CustomDriverDecorator(new ChromeDriver());
    }
}