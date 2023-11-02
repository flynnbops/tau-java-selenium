package waitstrategies;

import base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WaitStrategiesTest extends BaseTest {

    @Test
    @DisplayName("Wait for hidden element to load on page")
    public void waitForHiddenElementTest(){
        var loadingPage = homePage.clickDynamicLoading().clickExample1();
        loadingPage.clickStartButton();
        assertEquals("Hello World!",loadingPage.getLoadedElementText(),"The text of the loaded element does not match.");
    }

    @Test
    @DisplayName("Wait for element to render onto the page")
    public void waitForElementRenderTest(){
        var loadingPage = homePage.clickDynamicLoading().clickExample2();
        loadingPage.clickStartButton();
        assertEquals("Hello World!",loadingPage.getLoadedElementText(),"The text of the loaded element does not match.");
    }
}
