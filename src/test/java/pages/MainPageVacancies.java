package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPageVacancies {
    private SelenideElement
            content = $("#content"),
            catImage = $(".vacancies_header__cat"),
            texst1 = $(".vacancies_header__title_1"),
            texst2 = $(".vacancies_header__title_2"),
            searchInput = $(".input--search"),
            aboutUs = $(".switch__link");

    @Step("Открываем главную страницу")
    public MainPageVacancies openPage() {
        open("/about/vacancies");
        $(".header__logo").shouldBe(visible);

        return this;
    }

    @Step("Проверяем видимость контейнера с контентом")
    public MainPageVacancies getContent() {
        content.shouldBe(visible);
        return this;
    }

    @Step("Проверяем, что в контенте есть картинка с котиком")
    public MainPageVacancies getCatImage() {
        catImage.shouldBe(visible);
        return this;
    }

    @Step("Проверяем, что в контенте есть текст \"А вот\\n\" +\n" +
            "                \"крутые\" ")
    public MainPageVacancies getTexst1() {
        texst1.shouldBe(text("А вот\n" +
                "крутые"));
        return this;
    }

    @Step("Проверяем, что в контенте есть текст \"самые\\n\" + \"вакансии\"")
    public MainPageVacancies getTexst2() {
        texst2.shouldBe(text("самые\n" + "вакансии"));
        return this;
    }

    @Step("Вводим в поле поиска вакансии \"QA Engineer")
    public MainPageVacancies setSearch() {
        searchInput.setValue("QA Engineer").pressEnter();
        return this;
    }

    @Step("Вводим в поле поиска вакансии несуществующую вакансию \"Cats")
    public MainPageVacancies setNotSearch() {
        searchInput.setValue("Cats").pressEnter();
        return this;
    }

    @Step("Проверяем, что в хедере страницы имеется вкладка О Компании")
    public MainPageVacancies setAboutUs() {
        aboutUs.shouldHave(text("О КОМПАНИИ"));
        return this;
    }


}