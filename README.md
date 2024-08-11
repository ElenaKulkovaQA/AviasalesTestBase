# **Проект по автоматизации тестовых сценариев для сайта компании [AVIASALES](https://www.aviasales.ru/)**  
> Aviasales - компания, которая помогает сравнить билеты
и купить самый дешёвый
Бесплатно    
>
## СОДЕРЖАНИЕ

- [Стек технологий](https://github.com/ElenaKulkovaQA/AviasalesTestBase/blob/main/README.md#%D1%81%D1%82%D0%B5%D0%BA-%D1%82%D0%B5%D1%85%D0%BD%D0%BE%D0%BB%D0%BE%D0%B3%D0%B8%D0%B9)
- [Сборка в Jenkins](https://github.com/ElenaKulkovaQA/AviasalesTestBase/blob/main/README.md#%D1%81%D0%B1%D0%BE%D1%80%D0%BA%D0%B0-%D0%B2-jenkins)  
- [Запуск тестов из терминала](https://github.com/ElenaKulkovaQA/AviasalesTestBase/blob/main/README.md#%D0%B7%D0%B0%D0%BF%D1%83%D1%81%D0%BA-%D1%82%D0%B5%D1%81%D1%82%D0%BE%D0%B2-%D0%B8%D0%B7-%D1%82%D0%B5%D1%80%D0%BC%D0%B8%D0%BD%D0%B0%D0%BB%D0%B0)  
- [Пример Allure-отчета](https://github.com/ElenaKulkovaQA/AviasalesTestBase/blob/main/README.md#%D0%BF%D1%80%D0%B8%D0%BC%D0%B5%D1%80-allure-%D0%BE%D1%82%D1%87%D0%B5%D1%82%D0%B0)  
- [Интеграция с Allure TestOps](https://github.com/ElenaKulkovaQA/AviasalesTestBase/blob/main/README.md#%D0%B8%D0%BD%D1%82%D0%B5%D0%B3%D1%80%D0%B0%D1%86%D0%B8%D1%8F-%D1%81-allure-testops)  
- [Интеграция с Jira](https://github.com/ElenaKulkovaQA/AviasalesTestBase/blob/main/README.md#%D0%B8%D0%BD%D1%82%D0%B5%D0%B3%D1%80%D0%B0%D1%86%D0%B8%D1%8F-%D1%81-jira)  
- [Видео примера запуска тестов в Selenoid](https://github.com/ElenaKulkovaQA/AviasalesTestBase/blob/main/README.md#%D0%B2%D0%B8%D0%B4%D0%B5%D0%BE-%D0%BF%D1%80%D0%B8%D0%BC%D0%B5%D1%80%D0%B0-%D0%B7%D0%B0%D0%BF%D1%83%D1%81%D0%BA%D0%B0-%D1%82%D0%B5%D1%81%D1%82%D0%BE%D0%B2-%D0%B2-selenoid)  
___
### Стек технологий
<p align="left">
<a href="https://www.java.com/ru/"><img align="center"src="src/test/resources/java-original.svg" height="40" width="40"/>   
<a href="https://www.jetbrains.com/idea/"><img align="center"src="src/test/resources/intellij-original.svg" height="40" width="40"/>  
<a href="https://www.jenkins.io/"><img align="center"src="src/test/resources/jenkins-original.svg" height="40" width="40"/>  
<a href="https://www.atlassian.com/ru/software/jira"><img align="center"src="src/test/resources/jira-original.svg" height="40" width="40"/>  
<a href="https://github.com/"><img align="center"src="src/test/resources/github-original-wordmark.svg" height="40" width="40"/>  
<a href="https://gradle.org/"><img align="center"src="src/test/resources/gradle-original.svg" height="40" width="40"/>  
<a href="https://junit.org/junit5/"><img align="center"src="src/test/resources/junit-original.svg" height="40" width="40"/>
<a href="https://selenide.org/"><img align="center"src="src/test/resources/Selenide.svg" height="40" width="40"/>  
<a href="https://aerokube.com/selenoid/"><img align="center"src="src/test/resources/Selenoid.svg" height="40" width="40"/>  
<a href="https://allurereport.org/"><img align="center"src="src/test/resources/Allure.svg" height="40" width="40"/>
<a href="https://qameta.io/"><img align="center"src="src/test/resources/AllureTestops.svg" height="40" width="40"/>
</p>  

___  

Тесты в данном проекте написаны на языке `Java` с использованием фреймворка для `Selenide`, сборщик - `Gradle`. `JUnit 5`
задействован в качестве фреймворка модульного тестирования.
При прогоне тестов для запуска браузеров используется `Selenoid`.
Для удаленного запуска реализована джоба в `Jenkins` с формированием `Allure`-отчета.
Так же реализована интеграция с `Allure TestOps` и `Jira`.
___
### [Сборка в Jenkins](https://jenkins.autotests.cloud/job/AviasalesVacanciesTest/7/)   
<img src="src/test/resources/сборка Jenkins.png" height="500" width="9000"/>  

___
### Запуск тестов из терминала  
`gradle :clean :test -Dtype=${TAG} -Dremote_url=${REMOTE_URL} -Dbrowser_type=${BROWSER_TYPE}  -Dbrowser_version=${BROWSER_VERSION} -Dbrowser_size=${BROWSER_SIZE} --info`
___
### [Пример Allure-отчета](https://jenkins.autotests.cloud/job/AviasalesVacanciesTest/7/allure/)    
<img src="src/test/resources/аллюр репорт.png" height="500" width="9000"/>  

#### Allure- отчет состоит из:  
Шаги теста  
<img src="src/test/resources/шаги теста в аллюр-отчете.png" height="500" width="9000"/>    
Скриншот страницы на последнем шаге  
<img src="src/test/resources/скриншот с последнего шага теста.png" height="500" width="9000"/>    
Page Source  
Логи браузерной консоли  
Видео выполнения автотеста

___
### Интеграция с Allure TestOps  
<img src="src/test/resources/интеграция с аллюр тестопс.png" height="500" width="9000"/>     

___
### [Интеграция с Jira](https://jira.autotests.cloud/browse/HOMEWORK-1300)  
<img src="src/test/resources/интеграция с Jira.png" height="500" width="9000"/>    

___  
### Видео примера запуска тестов в Selenoid
<img src="src/test/resources/Гиф теста поиска вакансии Авиасейлс.gif" height="200" width="400"/>  
  
___  
