package sections;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchForm {
    SelenideElement searchIcon = $(By.xpath("//a[contains(@class,'sidetray-search')]"));
    SelenideElement searchField = $(By.xpath("//input[contains(@class,'form-input-search')]"));
    SelenideElement searchButton = $(By.xpath("//button[contains(@class,'search-btn')]"));

    public void searchData(String searchData) {
        searchIcon.click();
        searchField.sendKeys(searchData);
        searchButton.click();
    }
}
