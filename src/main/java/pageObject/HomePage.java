package pageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    SelenideElement chatButton = $(By.xpath("//a[contains(@class,'live-chat-tab')]"));
    SelenideElement chatMenu = $(By.xpath("//div[contains(@class,'qa-quick-replies')]"));

    public void openChat() {
        chatButton.click();
    }

    public boolean chatIsClosed() {
        chatButton.shouldBe(Condition.appear);
        return chatMenu.is(Condition.hidden);
    }
}
