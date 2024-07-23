package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;


public class MainPageVacancies {
    private SelenideElement
            content = $("#content"),
            catImage = $(".vacancies_header__cat"),
            texst1 = $(".vacancies_header__title_1"),
            texst2 = $(".vacancies_header__title_2"),
            searchInput = $(".input--search"),
            aboutUs = $(".switch__link");


    public MainPageVacancies openPage() {
        open("/about/vacancies");
        $(".header__logo").shouldBe(visible);

        return this;
    }

    public MainPageVacancies getContent() {
        content.shouldBe(visible);
        return this;
    }

    public MainPageVacancies getCatImage() {
        catImage.shouldBe(visible);
        return this;
    }

    public MainPageVacancies getTexst1() {
        texst1.shouldBe(text("А вот\n" +
                "крутые"));
        return this;
    }

    public MainPageVacancies getTexst2() {
        texst2.shouldBe(text("самые\n" + "вакансии"));
        return this;
    }

    public MainPageVacancies setSearch() {
        searchInput.setValue("QA Engineer").pressEnter();
        return this;
    }

    public MainPageVacancies setNotSearch() {
        searchInput.setValue("Cats").pressEnter();
        return this;
    }

    public MainPageVacancies setAboutUs() {
       aboutUs.shouldHave(text("О КОМПАНИИ"));
        return this;
    }

}