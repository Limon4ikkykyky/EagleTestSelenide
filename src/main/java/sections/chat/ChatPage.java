package sections.chat;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertAll;

public class ChatPage {
    SelenideElement title = $(By.xpath("//h3[contains(@class,'qa-title')]"));
    SelenideElement returnsAndExchangesButton = $(By.name("Returns and Exchanges"));
    SelenideElement orderStatusAndShippingButton = $(By.name("Order Status and Shipping"));
    SelenideElement cancelAndEditAnOrderButton = $(By.name("Cancel and Edit an Order"));
    SelenideElement realRewardsButton = $(By.name("Real Rewards"));
    SelenideElement productInformationAndAvailabilityButton = $(By.name("Product Information and Availability"));
    SelenideElement aECreditCardButton = $(By.name("AE Credit Card"));
    SelenideElement inStorePickupButton = $(By.name("In-Store Pickup"));
    SelenideElement iNeedHelpWithSomethingElseButton = $(By.name("I need help with something else"));

    public void verifyChatPageElementsIsPresent() {
        title.shouldBe(Condition.appear);
        assertAll("verify chat elements",
                () -> Assertions.assertTrue(returnsAndExchangesButton.is(Condition.visible), "Returns and Exchanges button isn't present"),
                () -> Assertions.assertTrue(orderStatusAndShippingButton.is(Condition.visible), "Order Status and Shipping Button isn't present"),
                () -> Assertions.assertTrue(title.is(Condition.visible), "title isn't present"),
                () -> Assertions.assertTrue(cancelAndEditAnOrderButton.is(Condition.visible), "Cancel and Edit an Order Button isn't present"),
                () -> Assertions.assertTrue(realRewardsButton.is(Condition.visible), "Real Rewards Button isn't present"),
                () -> Assertions.assertTrue(productInformationAndAvailabilityButton.is(Condition.visible), "Product Information and Availability Button isn't present"),
                () -> Assertions.assertTrue(aECreditCardButton.is(Condition.visible), "AE Credit Card Button isn't present"),
                () -> Assertions.assertTrue(inStorePickupButton.is(Condition.visible), "In-Store Pickup Button isn't present"),
                () -> Assertions.assertTrue(iNeedHelpWithSomethingElseButton.is(Condition.visible), "I need help with something elseButton isn't present")
        );
    }
    public void clickOnRealRewardsButton() {
        realRewardsButton.click();
    }
}
