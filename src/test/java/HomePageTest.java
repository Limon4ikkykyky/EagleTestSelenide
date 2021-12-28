import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.CommonUtils;

public class HomePageTest extends BaseTest {

    @Test
    public void testSwitchingBetweenToTabs() {
        homePage.openNewTab(CommonUtils.getCentralData("url"));
        productPage.addToBag();
        int bagCountOnFirstPage = homePage.getBagCount();
        homePage.switchToFirstTab();
        homePage.refreshPage();
        Assertions.assertEquals(bagCountOnFirstPage, homePage.getBagCount());
    }
}
