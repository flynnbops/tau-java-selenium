package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InfiniteScrollPage {

    private WebDriver driver;
    private By textBlocks = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver){
        this.driver = driver;
    }

    private int getNumberOfParagraphsShown(){
        return driver.findElements(textBlocks).size();
    }

    /**
     * Scrolls until paragraph with specified index is shown.
     * @param index is 1-indexed
     */
    public void scrollToParagraph(int index){
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        var jsExecutor = (JavascriptExecutor)driver;

        while(getNumberOfParagraphsShown() < index){
            jsExecutor.executeScript(script);
        }
    }
}
