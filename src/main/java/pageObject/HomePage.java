package pageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;


import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


public class HomePage {
    SelenideElement chatButton = $(By.xpath("//a[contains(@class,'live-chat-tab')]"));
    SelenideElement chatMenu = $(By.xpath("//div[contains(@class,'qa-quick-replies')]"));
    SelenideElement bagIndicator = $(By.xpath("//span[contains(@class, 'bag-indicator-content') and text() = '1']"));

    public void openChat() {
        chatButton.click();
    }

    public boolean chatIsClosed() {
        chatButton.shouldBe(Condition.appear);
        return chatMenu.is(Condition.hidden);
    }

    public void openDuplicate() {
        getWebDriver().switchTo().newWindow(WindowType.TAB);
        getWebDriver().get("https://www.ae.com/us/en");
    }

    public void switchToFirstTab() {
        switchTo().window(0);
        ;
        getWebDriver().navigate().refresh();
    }

    public boolean checkBagIndicator() {
        bagIndicator.shouldBe(Condition.appear);
        return bagIndicator.is(Condition.visible);
    }
}
