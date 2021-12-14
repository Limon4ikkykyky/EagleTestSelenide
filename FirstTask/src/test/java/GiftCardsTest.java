import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GiftCardsTest extends BaseTest {
    @Test
    public void giftCardsTest() {
        aeriePage.switchToAerie();
        aeriePage.isAerieIconPresent();
        aeriePage.scrollToTheFooter();
        footer.clickOnGiftCards();
        giftCardsPage.verifyGiftCardsPageElementsIsPresent();
    }
}
