package slider;

import base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SliderTest extends BaseTest {

    @Test
    @DisplayName("Slider value is set to 0 by default")
    public void sliderSetToZeroByDefault(){
        String expectedSliderValue = "0";
        var sliderPage = homePage.clickHorizontalSlider();

        assertEquals(sliderPage.getSliderValue(), expectedSliderValue, "Slider value was not " + expectedSliderValue);
    }

    @Test
    @DisplayName("Slider value automatically increments with the slider")
    public void setSliderValueIncrementsAutomatically(){
        var sliderPage = homePage.clickHorizontalSlider();

        var firstValue = sliderPage.getSliderValue();
        sliderPage.setSlider("0.5");
        var secondValue = sliderPage.getSliderValue();

        assertEquals(firstValue, "0", "Slider value was not initially set to 0");
        assertEquals(secondValue, "0.5", "Slider value did not increase to 0.5");
    }



    @ParameterizedTest(name = "Run: {index} - value: {arguments}")
    @ValueSource(strings = {"0", "0.5", "1", "4.5", "5"})
    @DisplayName("Slider boundary values")
    public void setSliderToMinimumValue(String value){
        var sliderPage = homePage.clickHorizontalSlider();
        sliderPage.setSlider(value);

        assertEquals(sliderPage.getSliderValue(), value, "Slider value was not " + value);
    }
}
