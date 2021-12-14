import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChatTest extends BaseTest {
    @Test
    public void chatTest() {
        homePage.openChat();
        chatPage.verifyChatPageElementsIsPresent();
        chatPage.goToRealRewardsButton();
        realRewardsChatPage.verifyRealRewardsPageElementsIsPresent();
        realRewardsChatPage.goToImNotSeeingMyRewards();
        notSeeingMyRewardsChatPage.verifyNotSeeingPageElementsIsPresent();
        notSeeingMyRewardsChatPage.clickOnBackButton();
        realRewardsChatPage.clickOnExitButton();
        homePage.chatIsClosed();
        Assertions.assertTrue(homePage.chatIsClosed(), "chat Not Closed");
    }
}
