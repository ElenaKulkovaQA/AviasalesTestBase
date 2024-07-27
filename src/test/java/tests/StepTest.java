package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPageVacancies;
import static io.qameta.allure.Allure.step;
import org.junit.jupiter.api.*;
import pages.CheckResultMainPage;

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

