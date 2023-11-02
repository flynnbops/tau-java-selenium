package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private String linkXPathFormat= ".//a[contains(text(), '%s')]";
    private By linkExample1= By.xpath(String.format(linkXPathFormat, "Example 1"));
    private By linkExample2= By.xpath(String.format(linkXPathFormat, "Example 2"));

    public DynamicLoadingPage(WebDriver driver){
        this.driver= driver;
    }

    public DynamicLoadingExample1Page clickExample1(){
        driver.findElement(linkExample1).click();
        return new DynamicLoadingExample1Page(driver);
    }
    public DynamicLoadingExample2Page clickExample2(){
        driver.findElement(linkExample2).click();
        return new DynamicLoadingExample2Page(driver);
    }

    public void openExample2InNewTab(){
        // Doesn't appear to open the link in new tab.
        // Not going to sort it out now.
        driver.findElement(linkExample2).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
    }

}
