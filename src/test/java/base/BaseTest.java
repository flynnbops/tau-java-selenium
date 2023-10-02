package base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
private WebDriver driver;

    public void setUp() {
        System.getProperty("webdriver.chrome.driver", "resources/Google Chrome for Testing.app/Contents/MacOS/Google Chrome for Testing");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        driver.manage().window().setSize(new Dimension(375, 812));

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
