package pages;

import org.openqa.selenium.By;

public class Locators {
    //универсальные локаторы

    //меню
    public String menuPoints = "//p[@class = 'header2-menu__item-text' and text()='%s']";
    public String menuDropdownPoints = "//div[@class = 'header2-menu__dropdown']//a[@title='%s']";
    public String buttonName = "//button[contains(text(),'%s')]";
    public String placeholderText = "//*[@action='/login/']//input[@placeholder='%s']";
    public String pageTitle = "//div[contains(text(),'%s')] | //h1[contains(text(),'%s')]";
    public String courseTitleBlock = "//div[text()='Популярные курсы']//following-sibling::div//div[contains(text(), 'Administrator')]";


    //простые локаторы
    public By headTextCategories = By.tagName("h1");
    public By errorTooltip = By.xpath("//div[@class='new-input-error new-input-error_top new-input-error_form js-text']");
}
