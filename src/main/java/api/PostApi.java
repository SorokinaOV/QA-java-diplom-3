package api;

import config.Config;
import io.qameta.allure.Step;
import io.restassured.response.Response;

public class PostApi extends BaseClient{
    public Response doPost(String path, Object body) {
        return postRequest(path, body).thenReturn();
    }

    @Step("Авторизация")
    public Response authorization(Object loginCard) {
        Response response = doPost(Config.LOGIN, loginCard);
        return response;
    }

    @Step("Регистрация")
    public Response registration(Object registerCard) {
        Response response = doPost(Config.REGISTER, registerCard);
        return response;
    }
}
