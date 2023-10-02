package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Chapter3ExerciseTest {

    private static WebDriver driver;

    public void setUp() {
        System.getProperty("webdriver.chrome.driver", "resources/Google Chrome for Testing.app/Contents/MacOS/Google Chrome for Testing");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
    }

    public void tearDown() {
        driver.quit();
    }

    public static void main(String[] args){
        Chapter3ExerciseTest test =  new Chapter3ExerciseTest();
        test.setUp();

        driver.findElement(new By.ByLinkText("Shifting Content")).click();
        driver.findElement(new By.ByLinkText("Example 1: Menu Element")).click();
        List<WebElement> links = driver.findElements(new By.ByTagName("a"));
        System.out.println(links.size());
        test.tearDown();
    }

}
