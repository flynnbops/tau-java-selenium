package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {
    private WebDriver driver;
    private String editorIframeID = "mce_0_ifr";
    private By textAreaIframeID = By.id("tinymce");

    private By increaseIndentationBtn = By.xpath("//*[@title=\"Increase indent\"]");



    public WysiwygEditorPage(WebDriver driver){
        this.driver = driver;
    }

    private void switchToEditArea(){
        driver.switchTo().frame(editorIframeID);
    }

    private void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }

    public void clearTextEditArea(){
        switchToEditArea();
        driver.findElement(textAreaIframeID).clear();
        switchToParentFrame();
    }

    public void enterText(String text){
        switchToEditArea();
        driver.findElement(textAreaIframeID).sendKeys(text);
        switchToParentFrame();
    }

    public String getTextFromEditor(){
        switchToEditArea();
        String text =  driver.findElement(textAreaIframeID).getText();
        switchToParentFrame();
        return text;
    }

    public void increaseIndentation(){
        driver.findElement(increaseIndentationBtn).click();
    }
}
