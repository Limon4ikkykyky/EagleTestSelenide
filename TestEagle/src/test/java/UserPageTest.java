import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserPageTest extends BaseTest {
    private final String emailData = "kajan9696@gmail.com";
    private final String passwordData = "qwerty1234";
    private final String searchData = "AE Denim High-Top Sneaker";

    @Test
    public void addToFavorites() {
        homePage.signIn(emailData, passwordData);
        homePage.searchData(searchData);
        productListPage.clickOnFirstProduct();
        userPage.clickFavoritesButton();
        Assertions.assertTrue(userPage.favoritesItem(), "Favorites Item is empty");
    }
}
