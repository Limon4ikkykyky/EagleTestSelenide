package sections.chat;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertAll;

public class RealRewardsChatPage {
    SelenideElement realRewardsTitle = $(By.xpath("//h3[contains(@class,'qa-title')]"));
    SelenideElement imNotSeeingMyRewardsButton = $(By.xpath("//button[contains(@class,'not-seeing-my-rewards')]"));
    SelenideElement resettingMyPasswordButton = $(By.xpath("//button[contains(@class,'m-having-issues-resetting-my-password')]"));
    SelenideElement reportMissingPointsButton = $(By.xpath("//button[text()[contains(.,'How do I report missing points')]]"));
    SelenideElement myRewardIfIMakeAReturnButton = $(By.xpath("//button[text()[contains(.,'What happens to my reward if I make a return?')]]"));
    SelenideElement whenArePointsAddedButton = $(By.xpath("//button[text()[contains(.,'When are points added to my account?')]]"));
    SelenideElement myQuestionIsntListedButton = $(By.xpath("//button[text()[contains(.,'My Question ')]]"));
    SelenideElement exitButton = $(By.xpath("//button[contains(@class,'_close-icon-wrapper_1m4r4r')]"));

    public void verifyRealRewardsPageElementsIsPresent() {
        imNotSeeingMyRewardsButton.shouldBe(Condition.appear);
        assertAll("real",
                () -> Assertions.assertTrue(imNotSeeingMyRewardsButton.isDisplayed(), "'I'm not seeing my rewards' Button isn't present"),
                () -> Assertions.assertTrue(realRewardsTitle.isDisplayed(), "Title isn't present"),
                () -> Assertions.assertTrue(resettingMyPasswordButton.isDisplayed(), "I'm having issues resetting my password Button isn't present"),
                () -> Assertions.assertTrue(reportMissingPointsButton.isDisplayed(), "How do I report missing points Button isn't present"),
                () -> Assertions.assertTrue(myRewardIfIMakeAReturnButton.isDisplayed(), "What happens to my reward if I make a return Button isn't present"),
                () -> Assertions.assertTrue(whenArePointsAddedButton.isDisplayed(), "When are points added to my account Button isn't present"),
                () -> Assertions.assertTrue(myQuestionIsntListedButton.isDisplayed(), "My Question Isn't Listed Button isn't present")
        );
    }

    public void clickOnImNotSeeingMyRewards() {
        imNotSeeingMyRewardsButton.click();
    }

    public void clickOnExitButton() {
        exitButton.click();
    }
}
