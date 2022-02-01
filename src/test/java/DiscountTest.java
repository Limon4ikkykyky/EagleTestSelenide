import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Epic("Product page test.")
@Feature("Discount.")
public class DiscountTest extends BaseTest {

    @Test
    @Story("The user visits the page with discount products and sees that the discount is displayed.")
    @Description("Verify that discount is displayed")
    public void discountTest() {
        pages.aeriePage.switchToAerie();
        pages.aeriePage.isAerieIconPresent();
        pages.aeriePage.howerClearenceDropDown();
        Assertions.assertTrue(pages.accessoriesShoesPage.checkDiscount(), "size are not equal");
        Assertions.assertTrue(pages.accessoriesShoesPage.isAllProductsHaveDiscount(), "Some products don't have discount");
    }
}
