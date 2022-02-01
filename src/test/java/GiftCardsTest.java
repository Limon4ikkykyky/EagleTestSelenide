import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Epic("Product page.")
@Feature("Gift Cards.")
public class GiftCardsTest extends BaseTest {

    @Test
    @Story("The user visits the page Gift Cards and sees two buttons.")
    @Description("Two buttons are displayed on the page.")
    @Severity(SeverityLevel.CRITICAL)
    @Issue("Test failed")
    @TmsLink("1")
    public void giftCardsTest() {
        pages.aeriePage.switchToAerie();
        Assertions.assertTrue( pages.aeriePage.isAerieIconPresent(), "Aerie Icon  is not present");
        pages.aeriePage.scrollToTheFooter();
        pages.footer.clickOnGiftCards();
        pages.giftCardsPage.verifyGiftCardsPageElementsIsPresent();

    }
}
