import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Epic("Chat sections test.")
@Feature("Chat sections.")
public class ChatTest extends BaseTest {

    @Test
    @Story("The user opens the chat and goes to the information and leaves the chat.")
    @Description("Verify Chat functionality")
    public void chatTest() {
        pages.homePage.openChat();
        pages.chatPage.verifyChatPageElementsIsPresent();
        pages.chatPage.clickOnRealRewardsButton();
        pages.realRewardsChatPage.verifyRealRewardsPageElementsIsPresent();
        pages.realRewardsChatPage.clickOnImNotSeeingMyRewards();
        pages.notSeeingMyRewardsChatPage.verifyNotSeeingPageElementsIsPresent();
        pages.notSeeingMyRewardsChatPage.clickOnBackButton();
        pages.realRewardsChatPage.clickOnExitButton();
        Assertions.assertTrue(pages.homePage.chatIsClosed(), "chat Not Closed");
    }
}
