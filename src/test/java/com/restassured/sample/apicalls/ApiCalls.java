package com.restassured.sample.apicalls;

import com.restassured.sample.utils.RestUtils;
import io.restassured.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ApiCalls {
    @Autowired
    RestUtils restUtils;

    public Response getEmployeesDetails(String endPointUrl) {
        return restUtils.get(endPointUrl);
    }
}
