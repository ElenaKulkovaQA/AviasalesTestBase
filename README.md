# **Проект по автоматизации тестовых сценариев для сайта компании AVIASALES**  
> Aviasales - компания, которая помогает сравнить билеты
и купить самый дешёвый
Бесплатно    
>   

## СОДЕРЖАНИЕ  

- Стек технологий
- Сборка в Jenkins
- Запуск тестов из терминала
- Пример Allure-отчета
- Интеграция с Allure TestOps
- Интеграция с Jira
- Видео примера запуска тестов в Selenoid 
___
### Стек технологий  
<p align="left">
<img align="center"src="src/test/resources/java-original.svg" height="40" width="40"/>  
<img align="center"src="src/test/resources/intellij-original.svg" height="40" width="40"/>  
<img align="center"src="src/test/resources/jenkins-original.svg" height="40" width="40"/>  
<img align="center"src="src/test/resources/jira-original.svg" height="40" width="40"/>  
<img align="center"src="src/test/resources/github-original-wordmark.svg" height="40" width="40"/>  
<img align="center"src="src/test/resources/gradle-original.svg" height="40" width="40"/>  
<img align="center"src="src/test/resources/junit-original.svg" height="40" width="40"/>
<img align="center"src="src/test/resources/Selenide.svg" height="40" width="40"/>
<img align="center"src="src/test/resources/Selenoid.svg" height="40" width="40"/>
<img align="center"src="src/test/resources/Allure.svg" height="40" width="40"/>
<img align="center"src="src/test/resources/AllureTestops.svg" height="40" width="40"/>
</p>  

  
Тесты в данном проекте написаны на языке `Java` с использованием фреймворка для `Selenide`, сборщик - `Gradle`. `JUnit 5` 
задействован в качестве фреймворка модульного тестирования. 
При прогоне тестов для запуска браузеров используется `Selenoid`. 
Для удаленного запуска реализована джоба в `Jenkins` с формированием `Allure`-отчета. 
Так же реализована интеграция с `Allure TestOps` и `Jira`.
___
### Сборка в Jenkins  
<img src="src/test/resources/сборка Jenkins.png" height="500" width="1000"/>



___
### Запуск тестов из терминала
`gradle :clean :test -Dtype=${TAG} -Dremote_url=${REMOTE_URL} -Dbrowser_type=${BROWSER_TYPE}  -Dbrowser_version=${BROWSER_VERSION} -Dbrowser_size=${BROWSER_SIZE} --info` 
___
### Пример Allure-отчета  
<img src="src/test/resources/аллюр репорт.png" height="900" width="1500"/>  

#### Allure- отчет состоит из:  
Шаги теста  
<img src="src/test/resources/шаги теста в аллюр-отчете.png" height="900" width="1500"/>  
Скриншот страницы на последнем шаге  
<img src="src/test/resources/скриншот с последнего шага теста.png" height="900" width="1500"/>  
Page Source  
Логи браузерной консоли  
Видео выполнения автотеста  

___
### Интеграция с Allure TestOps  
<img src="src/test/resources/интеграция с аллюр тестопс.png" height="900" width="1500"/>    

___
### Интеграция с Jira  

<img src="src/test/resources/интеграция с Jira.png" height="900" width="1500"/>  

___  
### Видео примера запуска тестов в Selenoid   
<img src="src/test/resources/Гиф теста поиска вакансии Авиасейлс.gif" height="200" width="400"/>   



