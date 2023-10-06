package hovers;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.HoversPage;

import static org.junit.jupiter.api.Assertions.*;

public class HoversTest extends BaseTest {

    @Test
    public void HoverOverUser1(){
        HoversPage hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);

        assertTrue(caption.isCaptionDisplayed(), "Caption is not displayed");
        assertEquals(caption.getTitle(), "name: user1", "The title is not correct for user 1.");
        assertEquals(caption.getLinkText(), "View profile", "Link text of th caption does not match");
        assertTrue(caption.getLink().endsWith("/users/1"), "The link does not contain 'users/1'");
    }
}
