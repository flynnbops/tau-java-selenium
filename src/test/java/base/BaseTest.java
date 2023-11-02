package base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.HomePage;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeEach
    public void setUp() {
//        System.getProperty("webdriver.chrome.driver", "resources/Google Chrome for Testing.app/Contents/MacOS/Google Chrome for Testing");
        System.getProperty("webdriver.chrome.driver", "resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("headless");

        driver = new ChromeDriver(options);
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }

    @AfterEach
    public void tearDown() {
        // Close window and this session
        driver.quit();

        // Close window but leaves the session running.
        // driver.close();
    }
}
