package com.github.savkk.hooks;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
import config.ServerConfig;
import org.aeonbits.owner.ConfigFactory;

public class Hooks {

    ServerConfig cfg = ConfigFactory.create(ServerConfig.class);

    @Before
    public void beforeTests(Scenario scenario) {
        System.out.println("Запуск выполнения сценария: " + scenario.getName());
        open(cfg.url());
    }

    @After
    public void afterTests() {
        clearBrowserLocalStorage();
        clearBrowserCookies();
        System.out.println("Сценарий завершен");
    }
}
