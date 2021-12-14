package sections;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Footer {
    SelenideElement giftCardsLink=$(By.xpath("//a[contains(@href,'/us/en/x/gift-cards')]"));

    public void clickOnGiftCards()
    {
        giftCardsLink.shouldBe(Condition.appear);
        giftCardsLink.click();
    }
}
