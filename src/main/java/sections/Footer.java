package sections;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Footer {
    SelenideElement giftCardsLink = $(By.xpath("//a[contains(@href,'/us/en/x/gift-cards')]"));

    @Step("Click On Gift Cards")
    public void clickOnGiftCards() {
        giftCardsLink.shouldBe(Condition.appear);
        giftCardsLink.click();
    }
}
