package iframes;

import base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IframesTest extends BaseTest {

    @Test
    @DisplayName("Interact with an iFrame text editor")
    public void fillInWysiwygEditorTest(){
        String textPart1 = "Hi Aaron!";
        String textPart2 = " Looking good";

        var editor = homePage.clickWysiwyg();
        editor.clearTextEditArea();
        editor.enterText(textPart1);
        editor.increaseIndentation();
        editor.enterText(textPart2);

        assertEquals(textPart1 + textPart2, editor.getTextFromEditor(), "Editor text does not match what we entered.");
    }

}
