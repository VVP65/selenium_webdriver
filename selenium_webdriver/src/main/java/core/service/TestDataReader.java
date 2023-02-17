package core.service;

import java.util.ResourceBundle;

public class TestDataReader {
    private static final ResourceBundle testResourceBundle = ResourceBundle.getBundle("rest-assured");

    public static String getTestData(String key) {
        return testResourceBundle.getString(key);
    }
}