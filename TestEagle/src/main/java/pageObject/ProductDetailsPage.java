package pageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertAll;

public class ProductDetailsPage {
    SelenideElement productColor = $(By.xpath("//div[@class='psp-extras-colors']"));
    SelenideElement productReview = $(By.xpath("//div[@class='psp-extras-reviews']"));
    SelenideElement productPrice = $(By.xpath("//div[@class='psp-extras-price-promo']"));

    public void verifyProductDetailsPageElementsIsPresent() {
        productColor.shouldBe(Condition.appear);
        assertAll("person",
                () -> Assertions.assertTrue(productColor.is(Condition.visible), "Product Color isn't present"),
                () -> Assertions.assertTrue(productReview.is(Condition.visible), "Product Review isn't present"),
                () -> Assertions.assertTrue(productPrice.is(Condition.visible), "Product price isn't present")
        );
    }
}
