package service;


import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class WebServiceMap extends WebService {

    private static final String URL = "/v1/cryptocurrency/map";

    public WebServiceMap(String baseUrl,String apiKey) {
        super(baseUrl, apiKey);
    }

    public Response get() {
        return given()
                .when()
                .header(getApiKeyName(), getApiKey())
                .get(getBaseUrl() + URL)
                .then().extract().response();
    }

}
