package pageObject;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ShoppingPage {

    SelenideElement checkItemInBag = $("data-product-id");

    public boolean itemInBag() {
        checkItemInBag.shouldBe(Condition.appear);
        return checkItemInBag.is(Condition.visible);
    }
}
