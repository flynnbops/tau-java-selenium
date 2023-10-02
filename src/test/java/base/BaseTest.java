package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTest {
private WebDriver driver;

    public void setUp() {
        System.getProperty("webdriver.chrome.driver", "resources/Google Chrome for Testing.app/Contents/MacOS/Google Chrome for Testing");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        List<WebElement> links = driver.findElements(new By.ByTagName("a"));
        System.out.println(links.size());

        WebElement inputsLink = driver.findElement(new By.ByLinkText("Hello"));
        inputsLink.click();

        System.out.println(driver.getTitle());
        // Close window and this session
        driver.quit();

        // Close window but leaves the session running.
        // driver.close();
    }

    public static void  main(String[] args){
        BaseTest test = new BaseTest();
        test.setUp();
    }
}
