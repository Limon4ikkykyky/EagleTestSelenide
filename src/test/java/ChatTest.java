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
    @Description("Chat test with check displayability elements.")
    public void chatTest() {
        homePage.openChat();
        chatPage.verifyChatPageElementsIsPresent();
        chatPage.clickOnRealRewardsButton();
        realRewardsChatPage.verifyRealRewardsPageElementsIsPresent();
        realRewardsChatPage.clickOnImNotSeeingMyRewards();
        notSeeingMyRewardsChatPage.verifyNotSeeingPageElementsIsPresent();
        notSeeingMyRewardsChatPage.clickOnBackButton();
        realRewardsChatPage.clickOnExitButton();
        Assertions.assertTrue(homePage.chatIsClosed(), "chat Not Closed");
    }
}
