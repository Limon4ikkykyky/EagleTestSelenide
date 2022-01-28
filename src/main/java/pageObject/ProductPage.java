package pageObject;


import com.codeborne.selenide.Condition;
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
    SelenideElement addToFavoritesImg = $(By.xpath("//div[contains(@class,'favorite-button qa-favorite-button')]"));
    SelenideElement productIcon = $(By.xpath("//div[contains(@class,'qa-product-tile')]"));
    SelenideElement favoritesPopup = $(By.xpath("//a[contains(@class,'qa-view-favorite-text')]"));
    SelenideElement addToFavoritesButton = $(By.xpath("//button[contains(@class,'btn btn-tertiary qa-btn-toggle-favorites')]"));
    SelenideElement goToFavoritesPage = $(By.xpath("//a[contains(@class,'qa-view-favorite-text')]"));


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

    @Step("Add product to favorites")
    public void addToFavorites() {
        productIcon.hover();
        addToFavoritesImg.click();
    }

    @Step("Verify favorites popup is present")
    public boolean favoritesPopupIsPresent() {
        favoritesPopup.shouldBe(Condition.appear);
        return favoritesPopup.is(Condition.visible);
    }

    @Step("Verify favorites size is present")
    public boolean verifySizeIsPresent() {
        sizeDropDown.shouldBe(Condition.appear);
        return sizeDropDown.is(Condition.visible);
    }

    @Step("Choose a product and its size")
    public void takeProduct() {
        shoesPage.click();
        sizeDropDown.click();
        availableSizes.get(0).click();
    }

    @Step("Add product to favorites on the product page")
    public void addProductToFavoritesOnTheProductDetailsPAge() {
        addToFavoritesButton.click();
    }

    @Step("Go to favorites page")
    public void goToFavoritesPage() {
        goToFavoritesPage.click();
    }
}
