import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Epic("Product page.")
@Feature("Gift Cards.")
public class GiftCardsTest extends BaseTest {

    @Test
    @Story("The user visits the page Gift Cards and sees two buttons.")
    @Description("Two buttons are displayed on the page.")
    public void giftCardsTest() {
        aeriePage.switchToAerie();
        Assertions.assertTrue(aeriePage.isAerieIconPresent(), "Aerie Icon  is not present");
        aeriePage.scrollToTheFooter();
        footer.clickOnGiftCards();
        giftCardsPage.verifyGiftCardsPageElementsIsPresent();

    }
}
