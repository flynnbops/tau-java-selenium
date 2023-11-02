package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private String linkXPathFormat= ".//a[contains(text(), '%s')]";
    private By linkExample1= By.xpath(String.format(linkXPathFormat, "Example 1"));

    public DynamicLoadingPage(WebDriver driver){
        this.driver= driver;
    }

    public DynamicLoadingExample1Page clickExample1(){
        driver.findElement(linkExample1).click();
        return new DynamicLoadingExample1Page(driver);
    }

}
