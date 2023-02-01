package core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.NotImplementedException;

import java.util.Arrays;

@AllArgsConstructor
@Getter
public enum DriverType {
    CHROME("chrome"),
    FIREFOX("firefox"),
    EDGE("edge"),
    CHROME_REMOTE("chrome_remote");

    private String browser;

    public static DriverType getType(String browser) {

        return Arrays.stream(DriverType.values())
                .filter(type -> type.getBrowser().equals(browser))
                .findFirst()
                .orElseThrow(() -> new NotImplementedException("No supported Webdriver were found"));
    }
}