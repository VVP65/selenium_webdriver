package pageobject.basePage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import service.TestDataReader;

import java.time.Duration;

public abstract class BasePage {
    protected WebDriver driver;
    protected static final int TIME_OUT_SECONDS = 20;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected static void wait(WebDriver driver) {
        ExpectedCondition<Boolean> pageLoadCondition = driver1 -> ((JavascriptExecutor) driver1).executeScript("return document.readyState").equals("complete");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT_SECONDS));
        wait.until(pageLoadCondition);
    }

    protected boolean waitForElementVisibility(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT_SECONDS)).until(ExpectedConditions.visibilityOf(element));

        return element.isEnabled();
    }

    protected BasePage openPage(String url) {
        driver.get(TestDataReader.getTestData(url));
        wait(driver);

        return this;
    }

    public String getPageURL() {
        return driver.getCurrentUrl();
    }
}