package test;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import service.WebServiceInfo;
import service.WebServiceMap;

import static org.testng.Assert.assertEquals;

public class ServicesTests {

    String apiKey = "b40a4049-05e4-4389-8ea6-68db9b3194f8";
    String baseUrl = "https://pro-api.coinmarketcap.com";

    @Test
    public void verifyMapHealthCheck(){
        WebServiceMap webServiceMap = new WebServiceMap(baseUrl, apiKey);
        Assert.assertEquals(webServiceMap.get().getStatusCode(), 200);
    }

    @Test
    public void verifyInfoHealthCheck(){
        WebServiceInfo webServiceInfo = new WebServiceInfo(baseUrl, apiKey);
        Assert.assertEquals(webServiceInfo.get("1").getStatusCode(), 200);
    }
}
