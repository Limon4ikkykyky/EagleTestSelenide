import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.CommonUtils;

@Epic("Home page test")
@Feature("Bag count")
public class HomePageTest extends BaseTest {

    @Test
    @Story("The user makes a purchase in the duplicated tab after returning to the first tab and checks for a bag change.")
    @Description("The test checks the change of the indicator in the bag")
    public void testSwitchingBetweenToTabs() {
        homePage.openNewTab(CommonUtils.getCentralData("url"));
        productPage.addToBag();
        int bagCountOnFirstPage = homePage.getBagCount();
        homePage.switchToFirstTab();
        homePage.refreshPage();
        Assertions.assertEquals(bagCountOnFirstPage, homePage.getBagCount());
    }
}
