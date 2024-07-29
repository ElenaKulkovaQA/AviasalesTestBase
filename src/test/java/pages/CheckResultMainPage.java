package pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class CheckResultMainPage {

    private SelenideElement
            conteyner = $(".vacancies"),
            noSuiitable = $(".vacancies_no_suitable_vacancies_hint__description"),
            vacancyName = $(".vacancies_vacancy__name"),
            notSearchResult = $(".vacancies_no_suitable_vacancies_hint__title");

    @Step("Прверяем,что контейнер для поиска вакансий видимый")
    public CheckResultMainPage getContainer() {
        conteyner.shouldBe(visible);
        return this;
    }

    @Step("Прверяем,что в футере результатов поиска по вакансии имеется текст \"Отправь нам резюме на почту\"")
    public CheckResultMainPage getNoSuitable() {
        noSuiitable.shouldBe();
        text("Отправь нам резюме на почту ");
        return this;
    }

    @Step("Прверяем,что поле для ввода искомой вакансий видимый")
    public CheckResultMainPage getVacancyName() {
        vacancyName.shouldBe(visible);
        return this;
    }

    @Step("Прверяем,что при отсутствии результатов поиска по вакансии имеется текст \"Нет подходящих вакансий\"")
    public CheckResultMainPage getSearchNotresult() {
        notSearchResult.shouldHave(text("Нет подходящих вакансий"));
        return this;
    }


}