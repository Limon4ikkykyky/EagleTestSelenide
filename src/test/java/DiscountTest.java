import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sections.AccessoriesShoesPage;

public class DiscountTest extends BaseTest {
    @Test
    public void discountTest() {
        aeriePage.switchToAerie();
        aeriePage.isAerieIconPresent();
        aeriePage.howerClearenceDropDown();
        Assertions.assertTrue(accessoriesShoesPage.checkDiscount(), "size are not equal");
        Assertions.assertTrue(accessoriesShoesPage.isAllProductsHaveDiscount(), "Some products don't have discount");
    }
}
