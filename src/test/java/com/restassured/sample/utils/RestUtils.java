package com.restassured.sample.utils;


import io.restassured.response.Response;
import org.springframework.stereotype.Component;

import static io.restassured.RestAssured.given;

@Component
public class RestUtils {

    public Response get (String endPointUrl) {
        return given()
                .when().log().all()
                .get(endPointUrl);
    }
}
