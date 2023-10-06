package keys;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KeysTest extends BaseTest {

    @Test
    public void testBackspace(){
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(), "You entered: BACK_SPACE", "'Backspace' was not the last keystroke.");
    }

    @Test
    public void testDollar(){
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterText(Keys.chord(Keys.ALT, "p"));
        assertEquals(keyPage.getResult(), "You entered: P", "'P' was not the last keystroke.");
    }
    @Test
    public void testPi(){
        var keyPage = homePage.clickKeyPresses();
        keyPage.enterPi();
        assertEquals(keyPage.getResult(), "You entered: 4", "'4' was not the last keystroke");
    }

}
