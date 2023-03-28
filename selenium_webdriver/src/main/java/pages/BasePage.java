package pages;

import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public abstract class BasePage {

    protected WebDriver driver;

    public Logger logger = LogManager.getRootLogger();

    protected BasePage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("User can see Main page url")
    public String getPageURL() {
        return driver.getCurrentUrl();
    }

    protected BasePage clickWebElementUsingActions(WebElement element) {
        new Actions(driver).click(element).perform();

        return this;
    }

    protected BasePage sendKeysViaActions(String text) {
        new Actions(driver).sendKeys(text).perform();

        return this;
    }
}