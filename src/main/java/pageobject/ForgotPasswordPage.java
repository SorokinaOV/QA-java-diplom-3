package pageobject;

import config.Config;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
    WebDriver driver;

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div//a[text()='Войти']")
    private WebElement loginButton;

    @Step("Нажать кнопку Войти")
    public void clickLoginButton() {
        loginButton.click();
    }

    @Step("Открыть страницу восстановления пароля")
    public void openForgotPage() {
        driver.get(Config.FORGOT_PASSWORD_PAGE_URL);
    }
}
