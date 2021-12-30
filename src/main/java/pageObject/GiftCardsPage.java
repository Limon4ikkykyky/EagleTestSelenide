package pageObject;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertAll;

public class GiftCardsPage {
    SelenideElement shopEGiftCardsButton = $(By.xpath("//a[text()[contains(.,'SHOP E-GIFT CARDS')]]"));
    SelenideElement shopGiftCardsButton = $(By.xpath("//a[text()[contains(.,'SHOP GIFT CARDS')]]"));
    SelenideElement label = $(By.xpath("//span[text()[contains(.,'when you spend $75+ on gift')]]"));
    SelenideElement title = $(By.xpath("//span[text()[contains(.,'Get a free $25 gift card for you')]]"));

    @Step("Verify Gift Cards Page Elements Is Present")
    public void verifyGiftCardsPageElementsIsPresent() {
        shopEGiftCardsButton.shouldBe(Condition.appear);
        assertAll("gift",
                () -> Assertions.assertTrue(shopEGiftCardsButton.is(Condition.visible), "Shop E-Gift Cards button isn't present"),
                () -> Assertions.assertTrue(shopGiftCardsButton.is(Condition.visible), "Shop Gift Cards Button isn't present"),
                () -> Assertions.assertTrue(title.is(Condition.visible), "title isn't present"),
                () -> Assertions.assertTrue(label.is(Condition.visible), "label isn't present")
        );
    }
}
