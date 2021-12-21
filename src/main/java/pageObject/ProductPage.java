package pageObject;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductPage {
    SelenideElement shoesPage = $(By.xpath("//img[contains(@class,'product-tile-image')]"));
    SelenideElement mansDropDown = $("[aria-label='Men category']");
    SelenideElement ShoesLink = $(By.xpath("//a[contains(@href,'/us/en/c/men/shoes/cat4840024?pagetype=plp')]"));
    SelenideElement addToBagButton = $(By.xpath("//button[contains(@class,'qa-btn-add-to-bag')]"));
    SelenideElement sizeList = $("[aria-label='Size']");
    SelenideElement sizePick = $("[data-value='0035742857']");
    SelenideElement closeButton = $("[aria-label='Close']");


    public void buyProduct() {
        mansDropDown.hover();
        ShoesLink.click();
        shoesPage.click();
        sizeList.click();
        sizePick.click();
        addToBagButton.click();
        closeButton.click();
    }
}
