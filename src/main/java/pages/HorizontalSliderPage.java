package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalSliderPage {
    private WebDriver driver;

    private By sliderBar = By.cssSelector(".sliderContainer input");
    private By sliderValue = By.id("range");

    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    public void setSlider(String value){
        while(!getSliderValue().equals(value)){
            driver.findElement(sliderBar).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public String getSliderValue(){
        return driver.findElement(sliderValue).getText();
    }
}
