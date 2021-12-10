package pageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UserPage {
    SelenideElement addToFavoritesButton = $(By.xpath("//button[contains(@class,'btn-toggle-favorites')]"));
    SelenideElement goToFavoritesButton = $(By.xpath("//button[contains(@class,'qa-view-favorite-text')]"));
    SelenideElement checkFavoritesItem = $(By.xpath("//div[contains(@class,'favorites-tile')]"));


    public void clickOnFavoritesButton() {
        addToFavoritesButton.click();
        goToFavoritesButton.click();

    }

    public boolean isFavoritesItemPresent() {
        checkFavoritesItem.shouldBe(Condition.appear);
        return checkFavoritesItem.is(Condition.visible);
    }
}
