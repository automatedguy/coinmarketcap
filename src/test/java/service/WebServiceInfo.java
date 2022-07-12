package service;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class WebServiceInfo extends WebService {

    private static final String URL = "/v1/cryptocurrency/info";

    public WebServiceInfo(String baseUrl,String apiKey) {
        super(baseUrl, apiKey);
    }

    public Response get(String id) {
        return given()
                .when()
                .queryParam("id", "1")
                .header(getApiKeyName(), getApiKey())
                .get(getBaseUrl() + URL)
                .then().extract().response();
    }
}
