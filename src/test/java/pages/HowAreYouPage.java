package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HowAreYouPage {

    private SelenideElement updateButton = $(By.xpath("//a[@class='button is-rounded is-pulled-right is-warning']"));
    private SelenideElement textArea = $(By.xpath("//textarea"));

    public void updatingMood() {
        textArea.sendKeys("I'm fine!!!!!!!!!!!!!!!!!!!!!!!!");
        updateButton.click();
    }


}
