package tests;

import core.service.TestDataReader;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    private static final String BASE_URI = "base.uri";

    @BeforeTest
    public void initialTest() {
        RestAssured.baseURI = TestDataReader.getTestData(BASE_URI);
    }
}