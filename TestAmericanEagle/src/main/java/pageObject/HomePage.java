package pageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    SelenideElement mansButton = $(By.xpath("//a[contains(@href,'men/mens?pagetype=clp')]"));
    SelenideElement shopButton = $(By.xpath("//a[contains(@href,'/men/tops/hoodies-sweatshirts/cat90020?pagetype=plp')]"));
    SelenideElement productImg = $(By.xpath("//img[contains(@class,'product-tile-image')]"));
    SelenideElement mansMessage = $(By.xpath("//div[contains(@class,'hidden-sm hidden-xs')]"));
    SelenideElement scrollUpButton = $(By.xpath("//button[contains(@class,'min-height-reached')]"));
    SelenideElement eagleLogo = $(By.xpath("//div[contains(@class,'active-logo-aeo')]"));
    SelenideElement accessibilityModeBotton = $(By.id("usableNetAssistive"));
    SelenideElement checkAccessibilityMode = $(By.xpath("//div[contains(@class,'cms-sub-header-lg-ae_holiday_gifting_2021_red_aa1d37_100')]"));
    SelenideElement scroll = $(By.xpath("//div[contains(@class,'page-outlet')]"));

    public void goToProductPage() {
        mansButton.click();
        shopButton.click();
        productImg.click();
    }

    public void activiteAccessibilityMode() {
        accessibilityModeBotton.click();
    }


    public void scrollToTop() {
        scroll.scrollIntoView(false);
        scrollUpButton.click();
    }

    public boolean isEagleLogoPresent() {
        eagleLogo.shouldBe(Condition.appear);
        return eagleLogo.is(Condition.visible);
    }

    public boolean isAccessibilityMode() {
        checkAccessibilityMode.shouldBe(Condition.appear);
        return accessibilityModeBotton.is(Condition.visible);
    }

    public boolean isMansPageMessagePresent() {
        mansMessage.shouldBe(Condition.appear);
        return mansMessage.is(Condition.visible);
    }
}

