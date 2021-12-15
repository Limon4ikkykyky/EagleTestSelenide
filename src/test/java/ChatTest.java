import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChatTest extends BaseTest {
    @Test
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
