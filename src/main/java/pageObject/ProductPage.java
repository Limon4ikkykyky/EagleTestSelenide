package pageObject;


import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductPage {
    SelenideElement shoesPage = $(By.xpath("//img[contains(@class,'product-tile-image')]"));
    SelenideElement mansDropDown = $("[aria-label='Men category']");
    SelenideElement ShoesLink = $(By.xpath("//a[contains(@href,'/us/en/c/men/shoes/cat4840024?pagetype=plp')]"));
    SelenideElement addToBagButton = $(By.xpath("//button[contains(@class,'qa-btn-add-to-bag')]"));
    SelenideElement sizeDropDown = $("[aria-label='Size']");
    List<SelenideElement> availableSizes = $$(By.xpath("//div[contains(@class,'qa-select-size')]//li[not(contains(@class,'visually-disabled'))]"));
    SelenideElement closeButton = $("[aria-label='Close']");

    @Step("Add product to bag")
    public void addToBag() {
        mansDropDown.hover();
        ShoesLink.click();
        shoesPage.click();
        sizeDropDown.click();
        availableSizes.get(0).click();
        addToBagButton.click();
        closeButton.click();
    }
}
