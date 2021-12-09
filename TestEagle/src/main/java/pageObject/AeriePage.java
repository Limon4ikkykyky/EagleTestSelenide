package pageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AeriePage {
    SelenideElement transitionToAerie = $(By.xpath("//a[contains(@href,'/aerie/cat4840006?pagetype=clp')]"));
    SelenideElement aerieIcon = $(By.xpath("//div[contains(@class,'active-logo-aerie __ea455')]"));

    public void transitionToAerie() {
        transitionToAerie.click();
    }

    public boolean aerieIconPresent() {
        aerieIcon.shouldBe(Condition.appear);
        return aerieIcon.is(Condition.visible);
    }
}
