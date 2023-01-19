package core.service;

import java.util.ResourceBundle;

public class TestDataReader {
    private static final ResourceBundle resourceBundle = ResourceBundle.getBundle("environments\\" + (System.getProperty("environment")));

    public static String getTestData(String key) {
        return resourceBundle.getString(key);
    }
}