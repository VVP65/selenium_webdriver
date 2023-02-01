package core.service;

import core.enums.UserType;
import models.User;

public class UserCreator {
    public static final String TESTDATA_STANDARD_USER_NAME = "standard.user.name";
    public static final String TESTDATA_STANDARD_USER_PASSWORD = "standard.user.password";
    public static final String TESTDATA_LOCKED_USER_NAME = "locked.user.name";
    public static final String TESTDATA_LOCKED_USER_PASSWORD = "locked.user.password";

    public static User getUser(UserType userType) {
        User user = new User(TestDataReader.getEnvData(TESTDATA_STANDARD_USER_NAME), TestDataReader.getEnvData(TESTDATA_STANDARD_USER_PASSWORD));

        switch (userType) {
            case LOCKED_OUT_USER:
                user = new User(TestDataReader.getEnvData(TESTDATA_LOCKED_USER_NAME), TestDataReader.getEnvData(TESTDATA_LOCKED_USER_PASSWORD));
        }

        return user;
    }
}