package pageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;


public class FavoritesPage {
    SelenideElement favoritesSignInButton = $(By.xpath("//button[contains(@class,'favorites-sign-in-btn')]"));
    SelenideElement favoritesTextTitle = $(By.xpath("//h3[text()[contains(.,'Save your faves & share gift ideas!')]]"));
    SelenideElement favoritesText = $(By.xpath("//div[contains(@class,'favorites-none-desc')]"));
    SelenideElement createAnAccountButton = $(By.xpath("//a[contains(@class,'btn-create-account')]"));
    SelenideElement emailField = $(By.xpath("//input[contains(@class,'form-input-username')]"));
    SelenideElement passwordField = $(By.xpath("//input[contains(@class,'form-input-password')]"));
    SelenideElement signInButton = $(By.xpath("//button[contains(@class,'qa-btn-login')]"));
    SelenideElement signInTitleText = $(By.xpath("//h1[text()[contains(.,'Favorites')]]"));
    SelenideElement favoritesZeroItemsCount = $(By.xpath("//p[contains(@class,'zeroCount')]"));
    SelenideElement shopAEButton = $(By.xpath("//a[contains(@class,'qa-btn-shop-ae')]"));
    SelenideElement shopAerieButton = $(By.xpath("//a[contains(@class,'qa-btn-shop-aerie')]"));
    SelenideElement favoritesOneItemsCount = $(By.xpath("//p[contains(@class,'qa-1-items')]"));
    SelenideElement favoritesDeleteButton = $(By.xpath("//div[contains(@class,'favorite-button')] "));
    SelenideElement productName = $(By.xpath("//h3[contains(@class,'product-name')]"));
    SelenideElement favoritesItemImg = $(By.xpath("//img[contains(@class,'product-tile-image')]"));
    SelenideElement addToBagButton = $(By.name("addToBag"));
    SelenideElement itemFavoritesIcon = $(By.xpath("//div[contains(@class,'tile-images')]"));
    SelenideElement itemsSizes = $(By.xpath("//div[contains(@class,'tile-size')]"));
    SelenideElement addToBagButtonFavorites = $(By.name("addToBag"));

    @Step("Verify Sign in button Is Present")
    public boolean signInButtonIsPresent() {
        favoritesSignInButton.shouldBe(Condition.appear);
        return favoritesSignInButton.is(Condition.visible);

    }


    @Step("Sign in")
    public void signIn(String email, String password) {
        favoritesSignInButton.click();
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        signInButton.click();
    }

    @Step("Verify signIn title text")
    public boolean verifySignInTitlePresent() {
        signInTitleText.shouldBe(Condition.appear);
        return signInTitleText.is(Condition.visible);
    }

    @Step("Verify Favorites Items Count")
    public boolean verifyFavoritesItemsCountPresent() {
        favoritesZeroItemsCount.shouldBe(Condition.appear);
        return favoritesText.is(Condition.visible);
    }


    @Step("Verify Text Title IS Present")
    public boolean textTitleIsPresent() {
        favoritesTextTitle.shouldBe(Condition.appear);
        return favoritesTextTitle.is(Condition.visible);
    }

    @Step("Verify Text Is Present")
    public boolean textIsPresent() {
        favoritesText.shouldBe(Condition.appear);
        return favoritesText.is(Condition.visible);
    }

    @Step("Verify Create an account button Is Present")
    public boolean createAnAccountButtonIsPresent() {
        createAnAccountButton.shouldBe(Condition.appear);
        return createAnAccountButton.is(Condition.visible);
    }

    @Step("Verify Shop AE button is present")
    public boolean shopAEButtonIsPresent() {
        shopAEButton.shouldBe(Condition.appear);
        return shopAEButton.is(Condition.visible);
    }

    @Step("Verify Shop Aerie button is present")
    public boolean shopAerieButtonIsPresent() {
        shopAerieButton.shouldBe(Condition.appear);
        return shopAerieButton.is(Condition.visible);
    }

    @Step("Click on Shop AE Button")
    public void clickOnShopAEButton() {
        shopAEButton.click();
    }

    @Step("Click on Shop Aerie Button")
    public void clickOnShopAerieButton() {
        shopAerieButton.click();
    }

    @Step("Check that the favorites product is in 1 quantity")
    public boolean verifyFavoritesHaveOneItem() {
        favoritesOneItemsCount.shouldBe(Condition.appear);
        return favoritesOneItemsCount.is(Condition.visible);
    }

    @Step("Remove item from favorites")
    public void deleteItemsFromFavorites() {
        itemFavoritesIcon.hover();
        favoritesDeleteButton.click();
    }

    @Step("Get the name of the product")
    public String getProductName() {
        String str = productName.getText();
        return str;
    }

    @Step("Click on the product image")
    public void clickOnImage() {
        favoritesItemImg.click();
    }

    @Step("Get the size of the product")
    public String getSize() {
        String str = itemsSizes.getText();
        return str;
    }

    @Step("Verify Add To Bag button is present")
    public boolean verifyAddToBagButtonIsPresent() {
        addToBagButton.shouldBe(Condition.appear);
        return addToBagButton.is(Condition.visible);
    }

    @Step("Get 1 items count")
    public String getFavoritesOneItemsCount() {
        String str = favoritesOneItemsCount.getText();
        return str.replaceAll("[^\\da-zA-Zа-яёА-ЯЁ ]", "");
    }

    @Step("Get 0 items count")
    public String getFavoritesZeroItemsCount() {
        String str = favoritesZeroItemsCount.getText();
        return str.replaceAll("[^\\da-zA-Zа-яёА-ЯЁ ]", "");
    }

    @Step("Verify Add To Bag button is present")
    public boolean verifyAddToBagFavoritesIsPresent() {
        addToBagButtonFavorites.shouldBe(Condition.appear);
        return addToBagButtonFavorites.is(Condition.visible);
    }
}
