import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ForthTestCase extends BaseTest {
    @Test
    public void forthTestCase() {
        homePage.openDuplicate();
        productPage.buyProduct();
        Assertions.assertTrue(homePage.checkBagIndicator(), "Bag locator Not 1");
        homePage.switchToFirstTab();
        Assertions.assertTrue(homePage.checkBagIndicator(), "Bag locator Not 1 ");
    }
}
