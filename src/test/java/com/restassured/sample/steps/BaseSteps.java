package com.restassured.sample.steps;
import com.restassured.sample.apicalls.ApiCalls;
import com.restassured.sample.common.EndPoints;
import com.restassured.sample.dto.EmployeeResponse;
import com.restassured.sample.dto.EmployeesResponse;
import io.restassured.response.Response;
import org.springframework.beans.factory.annotation.Autowired;


public abstract class BaseSteps<T extends BaseSteps<T>> {
    public Response response;
    EmployeesResponse employeesResponse;
    EmployeeResponse employeeResponse;
    String              endPoint;

    @Autowired
    protected EndPoints endPoints;

    @Autowired
    ApiCalls apiCalls;

}
