import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import pageObject.*;
import sections.Footer;
import utils.CommonUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


public class BaseTest {
    AeriePage aeriePage;
    Footer footer;
    GiftCardsPage giftCardsPage;


    @BeforeEach
    public void setup() {
        Configuration.browser = CommonUtils.getCentralData("browser");
        Configuration.timeout = 10000;
        Configuration.pageLoadTimeout = 10000;
        open("https://www.ae.com/us/en");
        initializeAllPages();
    }

    private void initializeAllPages() {
        aeriePage = new AeriePage();
        footer = new Footer();
        giftCardsPage = new GiftCardsPage();
    }

    @AfterEach
    public void quite() {
        WebDriverRunner.clearBrowserCache();
        getWebDriver().quit();
    }
}