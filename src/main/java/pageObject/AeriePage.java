package pageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

public class AeriePage {
    SelenideElement switchToAerie = $(By.xpath("//a[contains(@class,'logo-link-aerie')]"));
    SelenideElement aerieIcon = $(By.xpath("//div[contains(@class,'active-logo-aerie')]"));
    SelenideElement footer = $(By.xpath("//div[contains(@class,'footer-default')]"));
    SelenideElement clearenceDropDown = $("[aria-label='Clearance category']");
    SelenideElement accessoriesAndShoesLink=$(By.xpath("//a[contains(@href,'/accessories-shoes/')]"));

    public void switchToAerie() {
        switchToAerie.click();
    }

    public boolean isAerieIconPresent() {
        aerieIcon.shouldBe(Condition.appear);
        return aerieIcon.is(Condition.visible);
    }

    public void scrollToTheFooter() {
        footer.scrollIntoView(false);
    }

    public void howerClearenceDropDown() {
        clearenceDropDown.hover();
        accessoriesAndShoesLink.click();
    }
}

