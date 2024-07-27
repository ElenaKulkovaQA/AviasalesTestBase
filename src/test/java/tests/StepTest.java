package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import pages.MainPageVacancies;
import pages.CheckResultMainPage;
import static com.codeborne.selenide.logevents.SelenideLogger.step;

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

        step("Открываем главную страницу и ожидаем появление контента", () -> {
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

    @Tags({
            @Tag("smoke"),
            @Tag("step")
    })
    @DisplayName("Проверка соответствия результатов поиска страницы с вакансиями")
    @Test
    void resultSearchVacanciesTest() {

        step("Открываем главную страницу и ожидаем появление контента", () -> {
            mainPage
                    .openPage()
                    .getContent();
        })
        ;
        step("Заполняем поле поиска вакансии", () -> {
            mainPage
                    .setSearch();
        })
        ;
        step("Проверяем, что контейнер с вакансиями виден", () -> {
            results
                    .getContainer();
        })
        ;
        step("Проверяем, что результат поиска по вакансии соответствует имени вакансии в запросе", () -> {
            results
                    .getVacancyName().equals(mainPage.setSearch());
        })
        ;
        step("Проверяем, что в футере имеется текст _\"Отправь нам резюме на почту \" ", () -> {
            results
                    .getNoSuitable();
        });
    }
}


