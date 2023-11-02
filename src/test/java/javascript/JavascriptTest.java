package javascript;

import base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
}
