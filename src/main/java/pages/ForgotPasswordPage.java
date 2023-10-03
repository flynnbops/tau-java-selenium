package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage{
    private WebDriver driver;

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    private By emailField = By.id("email");
    // private By retrievePassword = By.id("form_submit");

    public PasswordResetPage resetPassword(String password){
        driver.findElement(emailField).sendKeys(password);

        // In this simple example I could just refer to the ID directly.
        driver.findElement(By.id("form_submit")).click();

        return new PasswordResetPage(driver);
    }
}
