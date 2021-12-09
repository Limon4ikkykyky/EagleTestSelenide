package pageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UserPage {
    SelenideElement favoritesButton = $(By.xpath("//button[contains(@class,'btn-block btn-toggle-favorites')]"));
    SelenideElement favorites = $(By.xpath("//button[contains(@class,'ember-view btn btn-block btn-primary btn-sm qa-view-favorite-text view-favorite-text')]"));
    SelenideElement favoritesItem = $(By.xpath("//div[contains(@class,'favorites-tile col-md-3 col-xs-6 __aa844')]"));


    public void clickFavoritesButton() {
        favoritesButton.click();
        favorites.click();

    }

    public boolean favoritesItem() {
        favoritesItem.shouldBe(Condition.appear);
        return favoritesItem.is(Condition.visible);
    }
}
