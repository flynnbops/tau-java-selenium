package base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import pages.HomePage;
import utils.EventReporter;
import utils.WindowManager;

public class BaseTest {
    private EventFiringWebDriver driver;
    protected HomePage homePage;

    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("disable-infobars");
        return options;
    }

    private void setCookie(){
        Cookie cookie = new Cookie.Builder("name", "123")
                .domain("t")
                .build();
        driver.manage().addCookie(cookie);
    }
    @BeforeEach
    public void setUp() {
        System.getProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));
        driver.register(new EventReporter());
        setCookie();
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

    public WindowManager getwindowManager(){
        return new WindowManager(driver);
    }
}
