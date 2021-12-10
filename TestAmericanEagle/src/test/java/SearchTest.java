import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchTest extends BaseTest {
    private final String searchData = "AE Denim High-Top Sneaker";
    private final String searchIncorrectData = "fsfdgdghsdsfd";

    @Test
    public void searchTest() {
        searchForm.searchData(searchData);
        productListPage.verifyProductListPageHeader(searchData);
        productListPage.clickOnFirstProduct();
        productDetailsPage.verifyProductDetailsPageElementsIsPresent();
    }

    @Test
    public void searchTestNegative() {
        searchForm.searchData(searchIncorrectData);
        Assertions.assertTrue(productListPage.isEmptySearchLabelPresent(), "Empty search is not present");
    }
}
