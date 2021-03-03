package com.github.savkk.steps;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.$;

public class LoginPageSteps {
    LoginPage loginPage = new LoginPage();

    @And("Fill in the field with placeholder {string}")
    public void fillInTheFieldWithPlaceholder(String placeholder) {
        SelenideElement element = $(By.xpath(String.format(loginPage.placeholderText, placeholder)));
        loginPage.fillData(placeholder, element);
    }
}
