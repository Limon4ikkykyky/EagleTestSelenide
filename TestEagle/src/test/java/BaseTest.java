import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import pageObject.*;
import utils.CommonUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


public class BaseTest {
    HomePage homePage;
    ProductListPage productListPage;
    ProductDetailsPage productDetailsPage;
    AeriePage aeriePage;
    UserPage userPage;
    ShoppingPage shoppingPage;

    @BeforeEach
    public void setup() {
        Configuration.browser = CommonUtils.getCentralData("browser");
        Configuration.timeout = 10000;
        Configuration.pageLoadTimeout = 10000;
        open("https://www.ae.com/us/en");
        initializeAllPages();
    }

    private void initializeAllPages() {
        homePage = new HomePage();
        productListPage = new ProductListPage();
        productDetailsPage = new ProductDetailsPage();
        aeriePage = new AeriePage();
        userPage = new UserPage();
        shoppingPage = new ShoppingPage();
    }

    @AfterEach
    public void quite() {
        WebDriverRunner.clearBrowserCache();
        getWebDriver().quit();
    }
}