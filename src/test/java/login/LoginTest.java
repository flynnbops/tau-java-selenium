package login;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        SecureAreaPage secureAreaPage = loginPage.login("tomsmith","SuperSecretPassword!");
        String alertText = secureAreaPage.getAlertText();
        assertTrue(alertText.contains("You logged into a secure area!"), "Alert text incorrect");
    }
}
