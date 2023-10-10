package modals;

import base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModalTest extends BaseTest {

    @Test
    public void contextMenuModalTest(){
        var contextMenuPage = homePage.clickContextMenu();
        assertEquals("Context Menu", contextMenuPage.getTitle(), "Not on the Context Menu Page");
        contextMenuPage.activateContextMenu();

        assertEquals("You selected a context menu", contextMenuPage.getAlertText(), "Context menu alert text is incorrect.");
    }
}
