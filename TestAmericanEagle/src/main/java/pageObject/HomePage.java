package pageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    SelenideElement mansButton = $(By.xpath("//a[contains(@href,'men/mens?pagetype=clp')]"));
    SelenideElement shopButton = $(By.xpath("//a[contains(@href,'/men/tops/hoodies-sweatshirts/cat90020?pagetype=plp')]"));
    SelenideElement transitionToProductImg = $(By.xpath("//*[contains(@src,'/image/aeo/4171_1922_864_of?$cat-main_large$')]"));
    SelenideElement mansMessage = $(By.xpath("//div[contains(@class,'hidden-sm hidden-xs')]"));
    SelenideElement scrollUpButton = $(By.xpath("//button[contains(@class,'min-height-reached')]"));
    SelenideElement eagleLogo = $(By.xpath("//div[contains(@class,'active-logo-aeo')]"));
    SelenideElement accessibilityModeBotton = $(By.xpath("//a[contains(@class,'_accessibility-btn_f1m2hn')]"));
    SelenideElement checkAccessibilityMode = $(By.xpath("//div[contains(@class,'cms-sub-header-lg-ae_holiday_gifting_2021_red_aa1d37_100')]"));
    SelenideElement scroll = $(By.xpath("//div[contains(@class,'page-outlet')]"));

    public void transitionToProductPfge() {
        mansButton.click();
        shopButton.click();
        transitionToProductImg.click();
    }

    public void transitionToAccessibilityMode() {
        accessibilityModeBotton.click();
    }


    public void scrollToTop() {
        scroll.scrollIntoView(false);
        scrollUpButton.click();
    }

    public boolean eagleLogo() {
        eagleLogo.shouldBe(Condition.appear);
        return eagleLogo.is(Condition.visible);
    }

    public boolean checkAccessibilityMode() {
        checkAccessibilityMode.shouldBe(Condition.appear);
        return accessibilityModeBotton.is(Condition.visible);
    }

    public boolean mansPageMessage() {
        mansMessage.shouldBe(Condition.appear);
        return mansMessage.is(Condition.visible);
    }
}

