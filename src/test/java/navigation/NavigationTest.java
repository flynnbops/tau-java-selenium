package navigation;

import base.BaseTest;
import org.junit.jupiter.api.Test;

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
}
