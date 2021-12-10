package pageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class ShoppingPage {

    SelenideElement sizeButton = $(By.xpath("//div[contains(@class,'dropdown-toggle qa-dropdown-toggle')]"));
    SelenideElement elementDropDownList = $(By.xpath("//div[contains(@class,'cart-item')]"));
    SelenideElement addToBagButtom = $(By.xpath("//button[contains(@class,'qa-btn-add-to-bag')]"));
    SelenideElement viewBagButton = $(By.xpath("//button[contains(@class,' qa-btn-view-bag')]"));
    SelenideElement checkItemInBag = $(By.xpath("//a[contains(@href,'/p/0414_5501_400')]"));

    public void addToBag() {
        sizeButton.click();
        elementDropDownList.click();
        addToBagButtom.click();
        viewBagButton.click();
    }

    public boolean itemInBag() {
        checkItemInBag.shouldBe(Condition.appear);
        return checkItemInBag.is(Condition.visible);
    }

}
