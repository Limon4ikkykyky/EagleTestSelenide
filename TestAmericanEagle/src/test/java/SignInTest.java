import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SignInTest extends BaseTest {
    private final String emailData = "kajan9696@gmail.com";
    private final String passwordData = "qwerty1234";
    private final String emailDataNegative = "kajan9296@gmail.com";
    private final String passwordDataNegative = "qwew";

    @Test
    public void signInTest() {
        signInForm.signIn(emailData, passwordData);
        Assertions.assertTrue(signInForm.loginAccountMessage(), "Login Account Message is not present");
    }

    @Test
    public void signInTestNegative() {
        signInForm.signIn(emailDataNegative, passwordDataNegative);
        Assertions.assertTrue(signInForm.errorMessagePresent(), "Error Message is not present");
    }
}
