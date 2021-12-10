package pageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductListPage {
    SelenideElement productListPageHeader = $(By.xpath("//h3[contains(@class,'product-name')]"));
    SelenideElement emptySearchLabel = $(By.xpath("//*[@class ='search-tips-items']"));
    List<SelenideElement> productsGrid = $$(By.xpath("//img[contains(@class,'product-tile-image')]"));

    public void verifyProductListPageHeader(String searchData) {
        productListPageHeader.shouldHave(Condition.text(searchData));
    }

    public void clickOnFirstProduct() {
        productsGrid.get(0).shouldBe(Condition.visible).click();
    }

    public boolean isEmptySearchLabelPresent() {
        emptySearchLabel.shouldBe(Condition.appear);
        return emptySearchLabel.is(Condition.visible);
    }
}
