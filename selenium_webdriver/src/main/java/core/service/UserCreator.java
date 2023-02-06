package core.service;

import core.enums.UserType;
import models.User;

public class UserCreator {
    public static final String TESTDATA_STANDARD_USER_NAME = "standard.user.name";
    public static final String TESTDATA_STANDARD_USER_PASSWORD = "standard.user.password";
    public static final String TESTDATA_LOCKED_USER_NAME = "locked.user.name";
    public static final String TESTDATA_LOCKED_USER_PASSWORD = "locked.user.password";
    public static final String TESTDATA_PROBLEM_USER_NAME = "problem.user.name";
    public static final String TESTDATA_PROBLEM_USER_PASSWORD = "problem.user.password";
    public static final String TESTDATA_PERFORMANCE_GLITCH_NAME = "performance.glitch.user.name";
    public static final String TESTDATA_PERFORMANCE_GLITCH_PASSWORD = "performance.glitch.user.password";

    public static User getUser(UserType userType) {
        User user = new User(TestDataReader.getEnvData(TESTDATA_STANDARD_USER_NAME), TestDataReader.getEnvData(TESTDATA_STANDARD_USER_PASSWORD));

        switch (userType) {
            case LOCKED_OUT_USER:
                user = new User(TestDataReader.getEnvData(TESTDATA_LOCKED_USER_NAME), TestDataReader.getEnvData(TESTDATA_LOCKED_USER_PASSWORD));
                break;
            case PROBLEM_USER:
                user = new User(TestDataReader.getEnvData(TESTDATA_PROBLEM_USER_NAME), TestDataReader.getEnvData(TESTDATA_PROBLEM_USER_PASSWORD));
                break;
            case PERFORMANCE_GLITCH_USER:
                user = new User(TestDataReader.getEnvData(TESTDATA_PERFORMANCE_GLITCH_NAME), TestDataReader.getEnvData(TESTDATA_PERFORMANCE_GLITCH_PASSWORD));
                break;
        }

        return user;
    }
}