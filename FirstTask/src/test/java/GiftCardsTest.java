import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GiftCardsTest extends BaseTest {
    @Test
    public void giftCardsTest() {
        aeriePage.switchToAerie();
        Assertions.assertTrue(aeriePage.isAerieIconPresent(), "Aerie Icon  is not present");
        aeriePage.scrollToTheFooter();
        footer.clickOnGiftCards();
        giftCardsPage.verifyGiftCardsPageElementsIsPresent();
    }
}
