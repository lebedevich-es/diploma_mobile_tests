package tests.browserstack;

import tests.BaseTest;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

@Tag("ios")
public class IosSampleTests extends BaseTest {

    @Test
    @DisplayName("Authorization test")
    void loginTest() {
        step("Click button", () ->
                $(AppiumBy.accessibilityId("Text Button")).click());

        step("Type email", () -> {
            $(AppiumBy.id("Text Input")).sendKeys("hello@browserstack.com");
            $(AppiumBy.id("Text Input")).pressEnter();
        });
        step("Check output", () ->
                $(AppiumBy.id("Text Output")).shouldHave(text("hello@browserstack.com")));
    }
}