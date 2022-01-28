import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Epic("Favorites page")
@Feature("Favorites page")
public class FavoritesPageNotBeLoggedTest extends BaseTest{
    @Test
    @Story("The user visits the favorites page and sees all the options")
    @Description("Text and buttons are present")
    @Severity(SeverityLevel.CRITICAL)
    @Issue("Test works")
    @TmsLink("2")
    public void FirstTestCase()
    {
        pages.homePage.openFavoritesPage();
        Assertions.assertTrue( pages.favoritesPage.signInButtonIsPresent(), "Sign in Button  is not present");
        Assertions.assertTrue( pages.favoritesPage.textTitleIsPresent(), "Text title  is not present");
        Assertions.assertTrue( pages.favoritesPage.textIsPresent(), "text  is not present");
        Assertions.assertTrue( pages.favoritesPage.createAnAccountButtonIsPresent(), "Create an account button is not present");
    }
}
