package sections.chat;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertAll;

public class NotSeeingMyRewardsChatPage {
    SelenideElement notSeeingMyRewardsTitle = $(By.xpath("//h3[contains(text(),'not seeing my rewards')]"));
    SelenideElement notSeeingMyRewardsLabel = $(By.xpath("//h4[contains(@class,'qa-faq-subtitle')]"));
    SelenideElement backButton = $("span._btn-back-text_10lye7");

    public void verifyNotSeeingPageElementsIsPresent() {
        notSeeingMyRewardsTitle.shouldBe(Condition.appear);
        assertAll("chat",
                () -> Assertions.assertTrue(notSeeingMyRewardsTitle.is(Condition.visible), "not Seeing My Rewards Title isn't present"),
                () -> Assertions.assertTrue(notSeeingMyRewardsLabel.is(Condition.visible), "not Seeing MyRewards Label isn't present")
        );
    }

    public void clickOnBackButton() {
        backButton.click();
    }
}

