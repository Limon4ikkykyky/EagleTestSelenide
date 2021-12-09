package pageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    SelenideElement mansButton = $(By.xpath("//a[contains(@href,'men/mens?pagetype=clp')]"));
    SelenideElement buttons = $(By.xpath("//a[contains(@href,'/men/tops/hoodies-sweatshirts/cat90020?pagetype=plp')]"));
    SelenideElement buy = $(By.xpath("//*[contains(@src,'/image/aeo/4171_1922_864_of?$cat-main_large$')]"));
    SelenideElement search = $(By.xpath("//a[contains(@class,'clickable qa-show-sidetray-search sidetray-search')]"));
    SelenideElement searchField = $(By.xpath("//input[contains(@class,'form-input-search')]"));
    SelenideElement searchButton = $(By.xpath("//button[contains(@class,'btn-link    btn search-btn')]"));
    SelenideElement SignIn = $(By.xpath("//a[contains(@class,'clickable qa-show-sidetray-account sidetray-account')]"));
    SelenideElement signInButton = $(By.xpath("//button[contains(@class,'btn btn-secondary qa-btn-signin   btn-sm btn-action')]"));
    SelenideElement emailField = $(By.xpath("//input[contains(@class,'form-control form-input-username ember-text-field ember-view')]"));
    SelenideElement passwordField = $(By.xpath("//input[contains(@class,'form-control form-input-password ember-text-field ember-view')]"));
    SelenideElement wrongData = $(By.xpath("//div[contains(@class,'ember-view help-block qa-error-help-block has-error  ')]"));
    SelenideElement loginButton = $(By.xpath("//button[contains(@class,'btn btn-primary qa-btn-login   btn-block')]"));
    SelenideElement loginMessage = $(By.xpath("//h2[contains(@class,'modal-title')]"));
    SelenideElement mansMessage = $(By.xpath("//div[contains(@class,' __31bd4 hidden-sm hidden-xs')]"));
    SelenideElement exit = $(By.xpath("//button[contains(@class,'btn-close sidetray-close-button qa-btn-cancel')]"));
    SelenideElement up = $(By.xpath("//button[contains(@class,' __1aa78 min-height-reached')]"));
    SelenideElement eagleLogo = $(By.xpath("//div[contains(@class,'active-logo qa-active-logo active-logo-aeo __ea455')]"));
    SelenideElement accessibilityModeBotton = $(By.xpath("//a[contains(@class,' _accessibility-btn_f1m2hn accessibility-link visible-lg-inline')]"));
    SelenideElement checkAccessibilityMode = $(By.xpath("//div[contains(@class,'cms-sub-header-lg-ae_holiday_gifting_2021_red_aa1d37_100 ')]"));
    SelenideElement scroll = $(By.xpath("//div[contains(@class,'page-outlet __b62fc')]"));

    public void searchData(String searchData) {
        search.click();
        searchField.sendKeys(searchData);
        searchButton.click();
    }

    public void click() {
        mansButton.click();
        buttons.click();
        buy.click();
    }

    public void signIn(String emailData, String passwordData) {
        SignIn.click();
        signInButton.click();
        emailField.sendKeys(emailData);
        passwordField.sendKeys(passwordData);
        loginButton.click();
        exit.click();
    }

    public void transitionToAccessibilityMode() {
        accessibilityModeBotton.click();
    }


    public void up() {
        scroll.scrollIntoView(false);
        up.click();
    }

    public boolean loginAccountMessage() {
        loginMessage.shouldBe(Condition.appear);
        return loginMessage.is(Condition.visible);
    }

    public boolean eagleLogo() {
        eagleLogo.shouldBe(Condition.appear);
        return eagleLogo.is(Condition.visible);
    }


    public boolean errorMessagePresent() {
        wrongData.shouldBe(Condition.appear);
        return wrongData.is(Condition.visible);
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

