package core.driver;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public enum DriverType {
    CHROME("chrome"),
    FIREFOX("firefox"),
    EDGE("edge"),
    CHROME_REMOTE("chrome");

    private String browser;
}