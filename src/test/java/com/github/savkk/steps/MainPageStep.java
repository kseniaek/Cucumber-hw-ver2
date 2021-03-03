package com.github.savkk.steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.$;

public class MainPageStep {

    MainPage mainPage = new MainPage();

    @And("Click to point of menu {string}")
    public void clickToPointOfMenu(String menuPointName) {
        SelenideElement element = $(By.xpath(String.format(mainPage.menuPoints, menuPointName)));
        element.click();
        System.out.println("Клик по элементу "+ menuPointName);
    }

    @And("Click to point of dropdown {string}")
    public void clickToPointOfDropdown(String menuDropdownPointName) {
        SelenideElement element = $(By.xpath(String.format(mainPage.menuDropdownPoints, menuDropdownPointName)));
        element.click();
        System.out.println("Клик по элементу "+ menuDropdownPointName);
    }

    @And("Click to button {string}")
    public void clickToButton(String button) {
        SelenideElement element = $(By.xpath(String.format(mainPage.buttonName, button)));
        element.click();
        System.out.println("Клик по элементу "+ button);
    }

    @Then("Page with header {string} opened")
    public void pageWithHeaderOpened(String header) {
        SelenideElement element = $(mainPage.headTextCategories);
        element.shouldHave(Condition.text(header));
    }

    @Then("Tooltip with text {string}")
    public void tooltipWithText(String expectedTooltipText) {
        SelenideElement element = $(mainPage.errorTooltip);
        element.shouldHave(Condition.text(expectedTooltipText));
    }

    @Then("Page with title {string} opened")
    public void pageWithTitleOpened(String pageTitleExpected) {
        SelenideElement element = $(By.xpath(String.format(mainPage.pageTitle, pageTitleExpected, pageTitleExpected)));
        element.shouldBe(Condition.visible);
        System.out.println(element.getText());
    }

    @And("Click to {string} of menu {string}")
    public void clickToOfMenu(String courseName, String block) {
        SelenideElement element = $(By.xpath(String.format(mainPage.courseTitleBlock, block, courseName)));
        element.scrollIntoView(true).click();
    }
}
