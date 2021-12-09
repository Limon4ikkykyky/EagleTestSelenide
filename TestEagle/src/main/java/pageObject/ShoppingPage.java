package pageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;


public class ShoppingPage {

    SelenideElement sizeList = $(By.xpath("//div[contains(@class,'dropdown-toggle qa-dropdown-toggle')]"));
    SelenideElement elementDropDown = $(By.xpath("//li[contains(@data-value,'0035680974')]"));
    SelenideElement addToBagBottom = $(By.xpath("//button[contains(@class,'btn btn-primary qa-btn-add-to-bag   qa-add-to-bag btn-block')]"));
    SelenideElement viewBagButton = $(By.xpath("//button[contains(@class,'btn btn-primary qa-btn-view-bag   btn-sm')]"));
    SelenideElement checkItemInBag = $(By.xpath("//a[contains(@href,'/p/0414_5501_400')]"));

    public void addToBag() {
        sizeList.click();
        elementDropDown.click();
        addToBagBottom.click();
        viewBagButton.click();
    }

    public boolean itemInBag() {
        checkItemInBag.shouldBe(Condition.appear);
        return checkItemInBag.is(Condition.visible);
    }

}
