import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShoppingPageTest extends BaseTest{
    private final String searchData = "AE Denim High-Top Sneaker";
    @Test
    public void addToBag()
    {
        searchForm.searchData(searchData);
        productListPage.clickOnFirstProduct();
        productDetailsPage.addToBag();
        Assertions.assertTrue(shoppingPage.itemInBag(),"Not found item in Bag");
    }
}
