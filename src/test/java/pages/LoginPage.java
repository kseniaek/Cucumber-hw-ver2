package pages;

import com.codeborne.selenide.SelenideElement;
import config.ServerConfig;
import org.aeonbits.owner.ConfigFactory;

public class LoginPage extends Locators{
    ServerConfig cfg = ConfigFactory.create(ServerConfig.class);

    public void fillData(String placeholder, SelenideElement element){
        if (placeholder.equals("Электронная почта")) {
            element.sendKeys(cfg.login());
            System.out.println("Заполнено поле " + placeholder);
        }
        if (placeholder.equals("Введите пароль")) {
            element.sendKeys(cfg.password());
            System.out.println("Заполнено поле "+ placeholder);
        }
        else {
            System.out.println("Неверный placeholder");
        }
    }
}
