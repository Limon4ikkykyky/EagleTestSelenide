package sections;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInForm {
    SelenideElement signInIcon = $(By.xpath("//a[contains(@class,'sidetray-account')]"));
    SelenideElement signInButton = $(By.xpath("//button[contains(@class,'qa-btn-signin')]"));
    SelenideElement emailField = $(By.xpath("//input[contains(@class,'form-input-username')]"));
    SelenideElement passwordField = $(By.xpath("//input[contains(@class,'form-input-password')]"));
    SelenideElement wrongDataMessage = $(By.xpath("//div[contains(@class,'qa-error-help-block')]"));
    SelenideElement loginButton = $(By.name("login"));
    SelenideElement loginMessage = $("h2.modal-title");
    SelenideElement exitButton = $(By.xpath("//button[contains(@class,'qa-btn-cancel')]"));

    public void signIn(String emailData, String passwordData) {
        signInIcon.click();
        signInButton.click();
        emailField.sendKeys(emailData);
        passwordField.sendKeys(passwordData);
        loginButton.click();
        exitButton.click();
    }
    public boolean isLoginAccountMessagePresent() {
        loginMessage.shouldBe(Condition.appear);
        return loginMessage.is(Condition.visible);
    }
    public boolean isErrorMessagePresent() {
        wrongDataMessage.shouldBe(Condition.appear);
        return wrongDataMessage.is(Condition.visible);
    }
}
