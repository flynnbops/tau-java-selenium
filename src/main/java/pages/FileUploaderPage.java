package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploaderPage {
    private WebDriver driver;

    private By uploadFileInput = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFileMessage = By.id("uploaded-files");

    public FileUploaderPage(WebDriver driver){
        this.driver = driver;
    }

    public String getTitle() {
        return driver.findElement(By.cssSelector("h3")).getText();
    }

    public String getUploadMessage() {
        return driver.findElement(uploadedFileMessage).getText();
    }

    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }

    public void uploadFile(String absoluteFilePath){
        driver.findElement(uploadFileInput).sendKeys(absoluteFilePath);
        clickUploadButton();
    }
}
