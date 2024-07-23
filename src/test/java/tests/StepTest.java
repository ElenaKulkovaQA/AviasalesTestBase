package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Allure;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPageVacancies;

import java.nio.charset.StandardCharsets;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import org.openqa.selenium.devtools.v115.page.model.FrameAttached;
import pages.CheckResultMainPage;
import pages.MainPageVacancies;

import static com.codeborne.selenide.Condition.visible;
import static io.qameta.allure.Allure.step;

public class StepTest extends TestBaseAvia {

    private MainPageVacancies mainPage = new MainPageVacancies();
    private CheckResultMainPage results = new CheckResultMainPage();

    @BeforeEach
    void setUp() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @Tags({
            @Tag("smoke"),
            @Tag("step")
    })
    @DisplayName("Проверка видимости основных элементов страницы с вакансиями")
    @Test

    void visibleComponentsTest() {

        step("Открываем главную страницу и ожидаем появление баннера", () -> {
            mainPage
                    .openPage()
                    .getContent();
        })
        ;
        step("Проверяем, что среди контента есть картинка с котиком", () -> {
            mainPage
                    .getCatImage();
        })
        ;
        step("Проверяем, что среди контента есть текст А вот\\n\" +\n" +
                "                \"крутые", () -> {
            mainPage
                    .getTexst1();
        })
        ;
        step("Проверяем, что среди контента есть текст самые\\n\" + \"вакансии", () -> {
            mainPage
                    .getTexst2();
        })
        ;
        step("Проверяем, что в хэдере есть текст _О КОМПАНИИ_", () -> {
            mainPage
                    .setAboutUs();
        })
        ;

    }
}

