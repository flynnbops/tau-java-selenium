package javascript;

import base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavascriptTest extends BaseTest {

    @Test
    @DisplayName("Use JavaScript to scroll to the table")
    public void scrollToTableTest(){
        homePage.clickLargeDeepDOM().scrollToTable();
    }

    @Test
    @DisplayName("Use JavaScript to scroll to the fifth paragraph of text")
    public void scrollToFifthParagraph(){
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }

    @Test
    @DisplayName("Use JavaScript to change a dropdown attribute")
    public void changeDropdownToMultiple(){
        var dropdown = homePage.clickDropdown();

        dropdown.changeToMultiple();
        dropdown.selectFromDropdown("Option 1");
        dropdown.selectFromDropdown("Option 2");

        // Verify both options are selected
        var selectedOptions = dropdown.getSelectedOptions();
        assertEquals(2,selectedOptions.size(),"both options where not selected");
        assertEquals("Option 1",selectedOptions.get(0),"Option 1 was not the first selected option");
        assertEquals("Option 2",selectedOptions.get(1),"Option 2 was not the second selected option");
    }
}
