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
    @Description("Discount display test.")
    public void discountTest() {
        aeriePage.switchToAerie();
        aeriePage.isAerieIconPresent();
        aeriePage.howerClearenceDropDown();
        Assertions.assertTrue(accessoriesShoesPage.checkDiscount(), "size are not equal");
        Assertions.assertTrue(accessoriesShoesPage.isAllProductsHaveDiscount(), "Some products don't have discount");
    }
}
