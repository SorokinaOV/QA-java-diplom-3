package api;

import config.Config;

public class DeleteApi extends BaseClient{
    public void deleteUser(String token) {
        if (token != null) {
            deleteRequest(Config.USER, token)
                    .then().statusCode(202);
        }
    }
}
