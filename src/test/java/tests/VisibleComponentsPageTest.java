package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import pages.CheckResultMainPage;
import pages.MainPageVacancies;

public class VisibleComponentsPageTest extends TestBaseAvia {
    MainPageVacancies mainPage = new MainPageVacancies();
    CheckResultMainPage result = new CheckResultMainPage();

    @Tags({
            @Tag("regression"),
            @Tag("smoke")
    })
    @DisplayName("Проверка видимости основных элементов страницы с вакансиями")
    @Test
    void successVisibleMainComponentsTest(){
        mainPage
                .openPage()
                .getContent()
                .setAboutUs()
                .getCatImage()
                .getTexst1()
                .getTexst2()
                .setSearch();
    }

    @Tag("regression")
    @DisplayName("Проверка соответствия результатов поиска страницы с вакансиями")
    @Test
    void succsessResultsearchVacanciesTest(){
        mainPage
                .openPage()
                .setSearch();
        result
                .getContainer()
                .getNoSuitable()
                .getVacancyName().equals(mainPage.setSearch());
    }

    @Tags({
            @Tag("regression"),
            @Tag("smoke"),
            @Tag("negativ") })
    @DisplayName("Проверка текста при отсутствии результатов поиска по вакансии")
    @Test
    void CheckTextWhenNotSearchResultsTest(){
        mainPage
                .openPage()
                .setNotSearch();
        result
                .getContainer()
                .getNoSuitable()
                .getSearchNotresult();

    }

}