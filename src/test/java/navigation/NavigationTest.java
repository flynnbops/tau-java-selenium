package navigation;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NavigationTest extends BaseTest {

    @Test
    public void testNavigator(){
        homePage.clickDynamicLoading().clickExample1();
        getwindowManager().goBack();
        getwindowManager().refreshPage();
        getwindowManager().goForward();
        getwindowManager().goTo("https://flynnbops.github.io");
        getwindowManager().refreshPage();
    }

    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindows().clickHere();
        getwindowManager().switchToTab("New Window");
    }

    @Test
    public void navigateToNewlyOpenedTab(){
        var dynamicLoadingPage = homePage.clickDynamicLoading();
        dynamicLoadingPage.openExample2InNewTab();

        getwindowManager().switchToNewTab();

        assertEquals("https://the-internet.herokuapp.com/dynamic_loading/2", getwindowManager().getCurrentURL(), "Not on the newly opened tab");
    }
}
