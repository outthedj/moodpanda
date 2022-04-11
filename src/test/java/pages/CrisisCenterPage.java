package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CrisisCenterPage {

    private SelenideElement crisisCenterInscription = $(By.xpath("//div[@class='container']/p[@class='title']"));

    public boolean isCrisisCenterDisplayed() {
        return crisisCenterInscription.isDisplayed();
    }
}
