package pageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


public class HomePage {
    SelenideElement chatButton = $(By.xpath("//a[contains(@class,'live-chat-tab')]"));
    SelenideElement chatMenu = $(By.xpath("//div[contains(@class,'qa-quick-replies')]"));
    SelenideElement bagIndicator = $(By.xpath("//span[contains(@class,'bag-indicator-content')]"));

    public void openChat() {
        chatButton.click();
    }

    public boolean chatIsClosed() {
        chatButton.shouldBe(Condition.appear);
        return chatMenu.is(Condition.hidden);
    }

    @Step("Open new Tab {url}")
    public void openNewTab(String url) {
        getWebDriver().switchTo().newWindow(WindowType.TAB);
        getWebDriver().get(url);
    }

    @Step("Switch to first tab")
    public void switchToFirstTab() {
        switchTo().window(0);
    }

    @Step("Refresh page")
    public void refreshPage() {
        getWebDriver().navigate().refresh();
    }

    @Step("Get bag count")
    public int getBagCount() {
        String str = bagIndicator.getText();
        return Integer.parseInt(str.trim());
    }

    public boolean checkBagIndicator() {
        bagIndicator.shouldBe(Condition.appear);
        return bagIndicator.is(Condition.visible);
    }
}
