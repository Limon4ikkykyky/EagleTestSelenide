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
    SelenideElement favoritesButton = $(By.xpath("//a[contains(@class,'favorites-button')]"));
    SelenideElement aELogo = $(By.xpath("//div[contains(@class,'active-logo-aeo')]"));
    SelenideElement searchLink = $(By.xpath("//a[contains(@class,'sidetray-search')]"));
    SelenideElement searchInput = $(By.xpath("//input[contains(@class,'form-input-search')]"));
    SelenideElement searchButton = $(By.xpath("//button[contains(@class,'btn search-btn')]"));
    SelenideElement accountButton = $(By.xpath("//a[contains(@class,'qa-show-sidetray-account')]"));
    SelenideElement signInButton=$(By.xpath("//button[contains(@class,'qa-btn-signin')]"));
    SelenideElement emailField=$(By.xpath("//input[contains(@class,'form-input-username')]"));
    SelenideElement passwordField=$(By.xpath("//input[contains(@class,'form-input-password')]"));
    SelenideElement loginButton=$(By.xpath("//button[contains(@class,'qa-btn-login')]"));
    SelenideElement closeButton=$(By.xpath("//button[contains(@class,'btn-close')]"));

    @Step("Open Chat")
    public void openChat() {
        chatButton.click();
    }

    @Step("Check that the Chat is closed")
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

    @Step("Check Bag Indicator")
    public boolean checkBagIndicator() {
        bagIndicator.shouldBe(Condition.appear);
        return bagIndicator.is(Condition.visible);
    }

    @Step("Open favorites page")
    public void openFavoritesPage() {
        favoritesButton.click();
    }

    @Step("Verify AE logo is present")
    public boolean verifyAELogoIsPresent() {
        aELogo.shouldBe(Condition.appear);
        return aELogo.is(Condition.visible);

    }

    @Step("Product search")
    public void searchProducts(String productName) {
        searchLink.click();
        searchInput.sendKeys(productName);
        searchButton.click();
    }

    @Step("Login")
    public void login(String email, String password) {
        accountButton.click();
        signInButton.click();
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
        closeButton.click();
    }
}
