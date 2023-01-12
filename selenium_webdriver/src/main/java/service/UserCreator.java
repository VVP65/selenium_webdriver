package service;

import model.User;

public class UserCreator {
    public static final String TESTDATA_STANDARD_USER_NAME = "testdata.standard.user.name";
    public static final String TESTDATA_STANDARD_USER_PASSWORD = "testdata.standard.user.password";
    public static final String TESTDATA_LOCKED_USER_NAME = "testdata.locked.user.name";
    public static final String TESTDATA_LOCKED_USER_PASSWORD = "testdata.locked.user.password";

    public static User getStandardUser() {
        return new User(TestDataReader.getTestData(TESTDATA_STANDARD_USER_NAME), TestDataReader.getTestData(TESTDATA_STANDARD_USER_PASSWORD));
    }

    public static User getLockedOutUser() {
        return new User(TestDataReader.getTestData(TESTDATA_LOCKED_USER_NAME), TestDataReader.getTestData(TESTDATA_LOCKED_USER_PASSWORD));
    }
}