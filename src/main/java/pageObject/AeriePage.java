package pageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

public class AeriePage {
    SelenideElement switchToAerie = $(By.xpath("//a[contains(@class,'logo-link-aerie')]"));
    SelenideElement aerieIcon = $(By.xpath("//div[contains(@class,'active-logo-aerie')]"));
    SelenideElement footer = $(By.xpath("//div[contains(@class,'footer-default')]"));
    SelenideElement clearenceDropDown = $("[aria-label='Clearance category']");
    SelenideElement accessoriesAndShoesLink = $(By.xpath("//a[contains(@href,'/clearance/accessories-shoes/')]"));

    @Step("Switch to Aerie")
    public void switchToAerie() {
        switchToAerie.click();
    }

    @Step("Verify aerie icon is present")
    public boolean isAerieIconPresent() {
        aerieIcon.shouldBe(Condition.appear);
        return aerieIcon.is(Condition.visible);
    }

    @Step("Scroll to the Footer")
    public void scrollToTheFooter() {
        footer.scrollIntoView(false);
    }

    @Step("Hower Clearence DropDown")
    public void howerClearenceDropDown() {
        clearenceDropDown.hover();
        accessoriesAndShoesLink.click();
    }
}

