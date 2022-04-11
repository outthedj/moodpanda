package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private ElementsCollection globalFeedTitle = $$(By.xpath("//p[text()='Global feed']"));
    private SelenideElement logOutButton = $x("//a[contains(text(),'Logout')]");
    private SelenideElement postUpdatedButton = $(By.xpath("//div[@class='buttons']/a[contains(.,'Post update')]"));
    private SelenideElement buttonCrisis = $(By.xpath("//a[text() = ' I am in crisis ']"));

    public int getTitleQuantity() {
        globalFeedTitle.get(1).shouldBe(Condition.visible);
        return globalFeedTitle.size();
    }
    public void clickOnLogOutButton() {
        logOutButton.shouldBe(Condition.exist).click();
    }

    public void clickonpostUpdatedButton() {
        postUpdatedButton.click();
    }

    public void clickOnCrisisButton() {
        buttonCrisis.click();
    }
}
