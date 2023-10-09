package javascriptalerts;

import base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaScriptAlertsTest extends BaseTest {

    @Test
    @DisplayName("Can close a Javascript alert")
    public void javaScriptAlertTest(){
        var jsAlertsPage = homePage.clickJavaScriptAlerts();
        jsAlertsPage.triggerJSAlert();
        assertEquals("I am a JS Alert", jsAlertsPage.getJSAlertText(), "Alert text is not what we expected");
        jsAlertsPage.acceptAlert();
        assertEquals("You successfully clicked an alert", jsAlertsPage.getResultText(), "The result text is not correct");
    }

    @Test
    @DisplayName("Can accept a Javascript confirm")
    public void acceptJavaScriptConfirmTest(){
        var jsAlertsPage = homePage.clickJavaScriptAlerts();
        jsAlertsPage.triggerJSConfirm();
        assertEquals("I am a JS Confirm", jsAlertsPage.getJSAlertText(), "Alert text is not what we expected");
        jsAlertsPage.acceptAlert();
        assertEquals("You clicked: Ok", jsAlertsPage.getResultText(), "The result does not show the pop up was dismissed");
    }

    @Test
    @DisplayName("Can dismiss a Javascript confirm")
    public void dismissJavaScriptConfirmTest(){
        var jsAlertsPage = homePage.clickJavaScriptAlerts();
        jsAlertsPage.triggerJSConfirm();
        assertEquals("I am a JS Confirm", jsAlertsPage.getJSAlertText(), "Alert text is not what we expected");
        jsAlertsPage.dismissJSConfirm();
        assertEquals("You clicked: Cancel", jsAlertsPage.getResultText(), "The result does not show the pop up was dismissed");
    }

    @Test
    @DisplayName("Can fill in a Javascript prompt")
    public void fillInJavaScriptPromptTest(){
        String message = "Hello there!";
        var jsAlertsPage = homePage.clickJavaScriptAlerts();
        jsAlertsPage.triggerJSPrompt();
        assertEquals("I am a JS prompt", jsAlertsPage.getJSAlertText(), "Alert text is not what we expected");
        jsAlertsPage.fillInJSPrompt(message);
        assertEquals("You entered: " + message, jsAlertsPage.getResultText(), "The result does not match what was entered into the prompt.");
    }

    @Test
    @DisplayName("Can cancel a Javascript prompt")
    public void cancelJavaScriptPromptTest(){
        var jsAlertsPage = homePage.clickJavaScriptAlerts();
        jsAlertsPage.triggerJSPrompt();
        assertEquals("I am a JS prompt", jsAlertsPage.getJSAlertText(), "Alert text is not what we expected");
        jsAlertsPage.dismissJSConfirm();
        assertEquals("You entered: null", jsAlertsPage.getResultText(), "The result does not show the prompt was cancelled.");
    }

}
