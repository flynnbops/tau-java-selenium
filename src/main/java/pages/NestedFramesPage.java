package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;

    private String topFrameName = "frame-top";
    private String leftFrameName = "frame-left";
    private String bottomFrameName = "frame-bottom";
    private By body = By.tagName("body");


    public NestedFramesPage(WebDriver driver){
        this.driver = driver;
    }

    public String getLeftPaneText(){
        driver.switchTo().frame(topFrameName);
        driver.switchTo().frame(leftFrameName);
        String text = getBodyText();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return text;
    }

    public String getBottomPaneText(){
        driver.switchTo().frame(bottomFrameName);
        String text = getBodyText();
        driver.switchTo().parentFrame();
        return text;
    }

    private String getBodyText(){
        return driver.findElement(body).getText();
    }
}
