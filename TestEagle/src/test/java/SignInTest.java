import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SignInTest extends BaseTest {
    private final String emailData = "kajan9696@gmail.com";
    private final String passwordData = "qwerty1234";
    private final String emailDataNegative = "kajan9296@gmail.com";
    private final String passwordDataNegative = "qwew";

    @Test
    public void signInTest() {
        homePage.signIn(emailData, passwordData);
        Assertions.assertTrue(homePage.loginAccountMessage(), "Login Account Message is not present");
    }

    @Test
    public void signInTestNegative() {
        homePage.signIn(emailDataNegative, passwordDataNegative);
        Assertions.assertTrue(homePage.errorMessagePresent(), "Error Message is not present");
    }
}
