package service;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public abstract class WebService {

    private String apiKey;
    private String baseUrl;

    private static final String API_KEY_NAME = "X-CMC_PRO_API_KEY";
    public WebService(String baseUrl, String apiKey) {
        this.apiKey = apiKey;
        this.baseUrl = baseUrl;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getApiKeyName(){
        return API_KEY_NAME;
    }

}
