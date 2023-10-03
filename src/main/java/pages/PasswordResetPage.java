package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordResetPage {
    private WebDriver driver;

    private By statusMessage = By.cssSelector("body > h1");

    public PasswordResetPage(WebDriver driver){
        this.driver = driver;
    }

    public String getMessageText(){
        return driver.findElement(statusMessage).getText();
    }

}
