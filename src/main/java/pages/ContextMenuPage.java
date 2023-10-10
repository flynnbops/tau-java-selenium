package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage{
    private WebDriver driver;

    private By contextMenuBox = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public String getTitle() {
        return driver.findElement(By.cssSelector("h3")).getText();
    }
    public void activateContextMenu(){
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(contextMenuBox)).perform();
    }

    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }

}
