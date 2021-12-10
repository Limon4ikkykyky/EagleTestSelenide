import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest {
    @Test
    public void clickTest() {
        homePage.goToProductPage();
        Assertions.assertTrue(homePage.isMansPageMessagePresent(), "Mans Page Message is not present");
    }

    @Test
    public void upTest() {
        homePage.scrollToTop();
        Assertions.assertTrue(homePage.isEagleLogoPresent(), "Eagle Logo Message is not present");
    }

    @Test
    public void accessibilityMode() {
        homePage.activiteAccessibilityMode();
        Assertions.assertTrue(homePage.isAccessibilityMode(), "Accessibility mode not found");
    }
}
