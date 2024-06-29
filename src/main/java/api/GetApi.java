package api;

import config.Config;

public class GetApi extends BaseClient{
    public String apiGetUser(String accessToken) {
        return getRequest(Config.USER, accessToken).getBody().path("user.email");
    }
}
