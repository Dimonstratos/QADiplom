# Дипломный проект професси "Тестировщик"

#### Цель дипломного проекта:

    Автоматизация тестирования веб-сервиса, который предлагает купить тур по определённой цене двумя способами:

1. Обычная оплата по дебетовой карте.
1. Уникальная технология: выдача кредита по данным банковской карты.

#### Тестовая документация

1. [План тестирования](https://github.com/Dimonstratos/QADiplom/blob/main/Documents/Plan.md)
1. [Отчет по итогам тестирования](https://github.com/Dimonstratos/QADiplom/blob/main/Documents/Report.md)
1. [Отчет по итогам автоматизации](https://github.com/Dimonstratos/QADiplom/blob/main/Documents/Summary.md)

# Начало работы

#### Установка необходимого ПО:
1. Приложение [IntelliJ IDEA](https://www.jetbrains.com/ru-ru/idea/)
1. Приложение [Docker Desktop](https://www.docker.com/products/docker-desktop/)
1. Приложение [Git](https://gitforwindows.org/)
1. Браузер [Google Chrome](https://www.google.ru/intl/ru/chrome/browser-tools/)

#### Запуск:
1. Клонировать проект с помощью Git.
1. Запустить Docker Desktop.
1. Открыть клонированный проект в IDEA.

    - В окне Terminal запустить контейнеры командой:
      docker-compose up

    - Проверить запуск контейнеров командой:
      docker-compose ps

    - Запустить приложение:

      для MySQL:   java "-Dspring.datasource.url=jdbc:mysql://localhost:3306/app" -jar artifacts/aqa-shop.jar

      для PostgreSQL:   java "-Dspring.datasource.url=jdbc:postgresql://localhost:5432/app" -jar artifacts/aqa-shop.jar

    - Запустить тесты:

      для MySQL:   .\gradlew clean test "-Ddb.url=jdbc:mysql://localhost:3306/app"

      для PostgreSQL:   .\gradlew clean test "-Ddb.url=jdbc:postgresql://localhost:5432/app"

    - Сгенерировать отчет по результатам тестирования:
      .\gradlew allureServe

    - Остановить тесты, приложение и allureServe можно с помощью "Ctrl+C",
      остановить контейнеры - docker-compose down.

    - После работы с отчетом, остановить allureServe: "Ctrl+C", подтвердить действие - "Y".