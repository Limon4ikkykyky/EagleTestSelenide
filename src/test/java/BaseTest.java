import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Screenshots;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.common.io.Files;
import io.qameta.allure.Attachment;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pageObject.AeriePage;
import pageObject.GiftCardsPage;
import pageObject.HomePage;
import pageObject.ProductPage;
import pagesConfiguration.Pages;
import sections.AccessoriesShoesPage;
import sections.Footer;
import sections.chat.ChatPage;
import sections.chat.NotSeeingMyRewardsChatPage;
import sections.chat.RealRewardsChatPage;
import utils.CommonUtils;

import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {
    Pages pages;

    @BeforeEach
    public void setup() {
        Configuration.browser = CommonUtils.getCentralData("browser");
        Configuration.timeout = 10000;
        Configuration.pageLoadTimeout = 10000;
        open("https://www.ae.com/us/en");
        injectPages();
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));

    }

    private void injectPages() {
        Injector injector = Guice.createInjector(new pagesConfiguration.Configuration());
        pages = injector.getInstance(Pages.class);
    }

    @AfterEach
    public void quite() throws IOException {
        WebDriverRunner.clearBrowserCache();
        getWebDriver().quit();
        screenshot();
    }

    @Attachment(type = "image/png")
    public byte[] screenshot() throws IOException {
        File screenshot = Screenshots.getLastScreenshot();
        return screenshot == null ? null : Files.toByteArray(screenshot);
    }
}