package sections;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class AccessoriesShoesPage {
    List<SelenideElement> accessoriesShoesList = $$(By.xpath("//div[contains(@class,'qa-product-tile')]"));
    List<SelenideElement> discount = $$(By.xpath("//div[contains(@class,'product-sale-price')]"));
    List<SelenideElement> basePrice = $$(By.xpath("//div[contains(@class,'product-list-price-on-sale')]"));

    public boolean checkDiscount() {
        int listSize = accessoriesShoesList.size();
        int discountSize = discount.size();
        return listSize == discountSize;
    }

    private List<Double> convertPriceToDouble(List<SelenideElement> elements) {
        List<Double> prices = new ArrayList<>();
        for (SelenideElement discount : elements) {
            String str = discount.getText();
            String num = str.replaceAll("\\$", "");
            double p = Double.parseDouble(num);
            prices.add(p);
        }
        return prices;
    }

    public boolean isAllProductsHaveDiscount() {
        return convertPriceToDouble(discount).size() == convertPriceToDouble(basePrice).size();
    }
}

