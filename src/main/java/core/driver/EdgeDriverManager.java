package core.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManager extends DriverManager {

    public EdgeDriverManager() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
    }
}