package iframes;

import base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NestedFramesTest extends BaseTest {

    @Test
    @DisplayName("Get the text values from nested iFrames")
    public void getIFramesTextTest(){
        var nestedFrames = homePage.clickNestedFrames();
        String leftFrameText = nestedFrames.getLeftPaneText();
        assertEquals("LEFT", leftFrameText, "Right Iframe text did not match");

        String bottomFrameText = nestedFrames.getBottomPaneText();
        assertEquals("BOTTOM", bottomFrameText, "Bottom Iframe text did not match");
    }
}
