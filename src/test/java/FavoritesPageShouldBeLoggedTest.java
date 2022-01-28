import io.qameta.allure.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@Epic("Favorites page")
@Feature("Favorites page")
public class FavoritesPageShouldBeLoggedTest extends BaseTest {
    private final String email = "kajan9696@gmail.com";
    private final String password = "qwerty1234";
    private final String productName = "Jeans";
    private final String productCategory = "Shoes";
    private final String nameJeans = "AE Ripped Highest Waist '90s Boyfriend Jean";
    private final String shoesName = "AE Sherpa O-Ring Sandal";
    private final String size = "Size: 5";
    private final String zeroFavoritesItems="0 items saved";
    private final String oneFavoritesItem = "1 item";

    @BeforeEach
    void SignIn() {
        pages.homePage.openFavoritesPage();
        pages.favoritesPage.signIn(email, password);
    }


    @Test
    @Story("The user visits the favorites page and sees all the options")
    @Description("Text and buttons are present")
    @Severity(SeverityLevel.CRITICAL)
    @Issue("Test works")
    @TmsLink("3")
    public void secondTestCase() {
        pages.homePage.openFavoritesPage();
        Assertions.assertTrue(pages.favoritesPage.verifySignInTitlePresent(), "Title not present");
        Assertions.assertTrue(pages.favoritesPage.verifyFavoritesItemsCountPresent(), "Items count not present");
        Assertions.assertTrue(pages.favoritesPage.textTitleIsPresent(), "Text title not present");
        Assertions.assertTrue(pages.favoritesPage.textIsPresent(), "Text not present");
        Assertions.assertTrue(pages.favoritesPage.shopAEButtonIsPresent(), "Shop AE button not present");
        Assertions.assertTrue(pages.favoritesPage.shopAerieButtonIsPresent(), "Shop Aerie button not present");
        pages.favoritesPage.clickOnShopAEButton();
        Assertions.assertTrue(pages.homePage.verifyAELogoIsPresent(), "Ae Logo is not present");
        pages.homePage.openFavoritesPage();
        pages.favoritesPage.clickOnShopAerieButton();
        Assertions.assertTrue(pages.aeriePage.isAerieIconPresent(), "Aerie Logo is not present");
    }

    @Test
    @Story("The user searches for a product in the search and adds it to favorites and checks to find that product there")
    @Description("The selected product is present on the page")
    @Severity(SeverityLevel.CRITICAL)
    @Issue("Test works")
    @TmsLink("4")
    public void thirdTestCase() {
        pages.homePage.searchProducts(productName);
        pages.productPage.addToFavorites();
        Assertions.assertTrue(pages.productPage.favoritesPopupIsPresent(), "Favorites Popup is not present");
        pages.homePage.openFavoritesPage();
        Assertions.assertEquals(pages.favoritesPage.getFavoritesOneItemsCount(), oneFavoritesItem);
        Assertions.assertEquals(nameJeans, pages.favoritesPage.getProductName());
    }

    @Test
    @Story("The user searches for a product in the search and adds it to favorites and see that the size has not yet been selected ")
    @Description("No size selected")
    @Severity(SeverityLevel.CRITICAL)
    @Issue("Test works")
    @TmsLink("5")
    public void fourthTestCase() {
        pages.homePage.searchProducts(productCategory);
        pages.productPage.addToFavorites();
        Assertions.assertTrue(pages.productPage.favoritesPopupIsPresent(), "Favorites Popup is not present");
        pages.homePage.openFavoritesPage();
        Assertions.assertEquals(pages.favoritesPage.getFavoritesOneItemsCount(), oneFavoritesItem);
        Assertions.assertEquals(shoesName, pages.favoritesPage.getProductName());
        pages.favoritesPage.clickOnImage();
        Assertions.assertTrue(pages.productPage.verifySizeIsPresent(), "Size not present");
    }

    @Test
    @Story("The user searches for a product then adds it to favorites and sees the size an other buttons on the page")
    @Description("Size and buttons is present on the page")
    @Severity(SeverityLevel.CRITICAL)
    @Issue("Test works")
    @TmsLink("6")
    public void fifthTestCase() {
        pages.homePage.searchProducts(productCategory);
        pages.productPage.takeProduct();
        pages.productPage.addProductToFavoritesOnTheProductDetailsPAge();
        pages.productPage.goToFavoritesPage();
        Assertions.assertEquals(pages.favoritesPage.getFavoritesOneItemsCount(), oneFavoritesItem);
        Assertions.assertEquals(size, pages.favoritesPage.getSize());
        Assertions.assertTrue(pages.favoritesPage.verifyAddToBagButtonIsPresent(), "Bag button not present");
    }

    @Test
    @Story("The user searches for a product then adds it to favorites and sees the size an other buttons on the page")
    @Description("Size and buttons is present on the page")
    @Severity(SeverityLevel.CRITICAL)
    @Issue("Test works")
    @TmsLink("7")
    public void sixthTestCase() {
        pages.homePage.searchProducts(productCategory);
        pages.productPage.takeProduct();
        pages.productPage.addProductToFavoritesOnTheProductDetailsPAge();
        pages.productPage.goToFavoritesPage();
        Assertions.assertEquals(pages.favoritesPage.getFavoritesOneItemsCount(), oneFavoritesItem);
        Assertions.assertEquals(size, pages.favoritesPage.getSize());
        Assertions.assertTrue(pages.favoritesPage.verifyAddToBagFavoritesIsPresent(), "Add To Bag button not Present");
    }

    @AfterEach
    public void deleteItemsFromFavorites() {
        pages.favoritesPage.deleteItemsFromFavorites();
        pages.favoritesPage.textTitleIsPresent();
        Assertions.assertEquals(zeroFavoritesItems, pages.favoritesPage.getFavoritesZeroItemsCount());
    }
}
