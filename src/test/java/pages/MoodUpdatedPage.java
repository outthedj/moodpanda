package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class MoodUpdatedPage {

    private SelenideElement moodUpdatedinscription = $(By.xpath("//p[@class='title']"));

    public String text;

    public boolean isMoodUpdatedDisplayed() {
        moodUpdatedinscription.shouldBe(Condition.enabled, Duration.ofSeconds(200));
        return moodUpdatedinscription.isDisplayed();
    }
}
