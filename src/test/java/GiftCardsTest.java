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
        aeriePage.switchToAerie();
        Assertions.assertTrue(aeriePage.isAerieIconPresent(), "Aerie Icon  is not present");
        aeriePage.scrollToTheFooter();
        footer.clickOnGiftCards();
        giftCardsPage.verifyGiftCardsPageElementsIsPresent();

    }
}
