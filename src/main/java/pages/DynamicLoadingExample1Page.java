package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class DynamicLoadingExample1Page {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");

    private By loadedTextId = By.id("finish");
    private By loadingIndicator = By.id("loading");

    public DynamicLoadingExample1Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStartButton() {
        driver.findElement(startButton).click();
        FluentWait wait= new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        // Wait for the loading bar to disappear
        wait.until(ExpectedConditions.invisibilityOf(
                driver.findElement(loadingIndicator)));

    }

    public String getLoadedElementText() {
        return driver.findElement(loadedTextId).getText();
    }

}