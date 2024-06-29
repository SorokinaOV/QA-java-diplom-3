import api.DeleteApi;
import api.GetApi;
import api.PostApi;
import browser.GetBrowser;
import model.LoginCard;
import model.RegistrationCard;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import pageobject.*;
import random.RandomIndex;


import java.util.concurrent.TimeUnit;

public class StartQuitTest {
    WebDriver driver;
    DeleteApi deleteApi = new DeleteApi();
    RegistrationCard registrationCard;
    GetApi getApi = new GetApi();
    PostApi postApi = new PostApi();
    LoginPage loginPage;
    MainPage mainPage;
    ForgotPasswordPage forgotPasswordPage;
    RegistrationPage registrationPage;
    LoginCard loginCard;
    String accessToken;
    ProfilePage profilePage;

    GetBrowser browser = new GetBrowser();

    @Before
    public void setUp() {
        driver = browser.getWebDriver();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

        mainPage = new MainPage(driver);
        loginPage = new LoginPage(driver);
        profilePage = new ProfilePage(driver);
        registrationPage = new RegistrationPage(driver);
        forgotPasswordPage = new ForgotPasswordPage(driver);

        registrationCard = new RegistrationCard(
                "test_user" + RandomIndex.getRandomIndex() + "@a.com",
                RandomIndex.getRandomIndex(),
                "test_user" + RandomIndex.getRandomIndex());
    }

    @After
    public void cleanUp() {
        driver.quit();
        deleteApi.deleteUser(accessToken);
    }
}
