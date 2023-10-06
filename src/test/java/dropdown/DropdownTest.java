package dropdown;

import base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DropdownTest extends BaseTest {

    @Test
    public void testSelectOption(){
        String option = "Option 1";

        var dropDownPage = homePage.clickDropdown();
        dropDownPage.selectFromDropdown(option);

        var selectedOptions = dropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of options selected.");
        assertTrue(selectedOptions.contains(option), "Option 1 not selected.");
    }
}
