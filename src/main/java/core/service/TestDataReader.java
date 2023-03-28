package core.service;

import java.util.ResourceBundle;

public class TestDataReader {
    private static final ResourceBundle testResourceBundle = ResourceBundle.getBundle("test");
    private static final ResourceBundle envResourceBundle = ResourceBundle.getBundle("environments\\" + getTestData("environment"));

    public static String getEnvData(String key) {
        return envResourceBundle.getString(key);
    }

    public static String getTestData(String key) {
        return testResourceBundle.getString(key);
    }
}