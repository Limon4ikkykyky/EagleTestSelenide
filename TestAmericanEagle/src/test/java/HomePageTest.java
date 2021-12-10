import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest {
    @Test
    public void clickTest() {
        homePage.transitionToProductPfge();
        Assertions.assertTrue(homePage.mansPageMessage(), "Mans Page Message is not present");
    }

    @Test
    public void upTest() {
        homePage.scrollToTop();
        Assertions.assertTrue(homePage.eagleLogo(), "Eagle Logo Message is not present");
    }

    @Test
    public void accessibilityMode() {
        homePage.transitionToAccessibilityMode();
        Assertions.assertTrue(homePage.checkAccessibilityMode(), "Accessibility mode not found");
    }
}
