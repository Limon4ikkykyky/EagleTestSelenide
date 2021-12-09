import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchTest extends BaseTest {
    private final String searchData = "AE Denim High-Top Sneaker";
    private final String searchIncorrectData = "fsfdgdghsdsfd";

    @Test
    public void searchTest() {
        homePage.searchData(searchData);
        productListPage.verifyProductListPageHeader(searchData);
        productListPage.clickOnFirstProduct();
        productDetailsPage.verifyProductDetailsPageElementsIsPresent();
    }

    @Test
    public void searchTestNegative() {
        homePage.searchData(searchIncorrectData);
        Assertions.assertTrue(productListPage.isEmptySearchLabelPresent(), "Empty search is not present");
    }
}
