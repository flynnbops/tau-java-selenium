package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {

    private WebDriver driver;

    private By result = By.id("result");

    public JavaScriptAlertsPage(WebDriver driver){
        this.driver = driver;
    }

    public String getAlertMessage() {
        return "I am a JS Alert";
    }

    public String getConfirmMessage() {
        return "I am a JS Confirm";
    }

    public String getPromptMessage() {
        return "I am a JS prompt";
    }

    public void triggerJSAlert(){
        clickJavaScriptButton("Alert");
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public void triggerJSConfirm(){
        clickJavaScriptButton("Confirm");
    }

    public void dismissJSConfirm(){
        driver.switchTo().alert().dismiss();
    }

    public void triggerJSPrompt(){
        clickJavaScriptButton("Prompt");
    }
    public void fillInJSPrompt(String message){
        driver.switchTo().alert().sendKeys(message);
        driver.switchTo().alert().accept();
    }

    public String getResultText(){
        return driver.findElement(result).getText();
    }

    public String getJSAlertText(){
        return driver.switchTo().alert().getText();
    }

    private void clickJavaScriptButton(String event){
        driver.findElement(By.xpath(".//button[text()='Click for JS " + event + "']")).click();
    }


}
