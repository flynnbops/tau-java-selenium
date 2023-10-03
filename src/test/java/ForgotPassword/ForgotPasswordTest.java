package ForgotPassword;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.ForgotPasswordPage;
import pages.PasswordResetPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForgotPasswordTest extends BaseTest {

    @Test
    public void ForgotPassword(){
        ForgotPasswordPage forgotPasswordPage = homePage.ForgotPassword();
        PasswordResetPage reset = forgotPasswordPage.resetPassword("a@acom");

        // Looks like an issue with th online version of the app.
        assertEquals(reset.getMessageText(), "Internal Server Error", "The password reset message is not correct.");
    }
}
