package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import drivers.BrowserstackDriver;
import drivers.LocalMobileDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.*;

public class BaseTest {

    public static String deviceHost = System.getProperty("deviceHost");

    @BeforeAll
    static void beforeAll() {
        switch (deviceHost) {
            case "android":
            case "ios":
                Configuration.browser = BrowserstackDriver.class.getName();
                break;
            case "emulator":
                Configuration.browser = LocalMobileDriver.class.getName();
                break;
        }
        Configuration.browserSize = null;
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    void afterEach() {
        String sessionId = sessionId().toString();
        Attach.pageSource();
        if (!deviceHost.equals("emulator")) {
            Attach.addVideo(sessionId);
        }
        Selenide.closeWebDriver();
    }
}