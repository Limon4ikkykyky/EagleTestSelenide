import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShoppingPageTest extends BaseTest{
    private final String searchData = "AE Denim High-Top Sneaker";
    @Test
    public void addToBag()
    {
        homePage.searchData(searchData);
        productListPage.clickOnFirstProduct();
        shoppingPage.addToBag();
        Assertions.assertTrue(shoppingPage.itemInBag(),"Not found item in Bag");
    }
}
