package com.restassured.sample.steps;
import com.restassured.sample.dto.EmployeeResponse;
import com.restassured.sample.dto.EmployeesResponse;
import io.qameta.allure.Step;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.springframework.stereotype.Component;

import static org.junit.jupiter.api.Assertions.*;

@Component
public class EmployeeDetailsSteps extends BaseSteps<EmployeeDetailsSteps> {

    @Step
    public EmployeeDetailsSteps givenIHaveEmployeesServiceEndpoint() {
        endPoint = endPoints.getEmployeesServiceFullPath();
        return this ;
    }

    @Step
    public  EmployeeDetailsSteps whenIRetrieveEmployeesDetails(String pathParam) {
        response = apiCalls.getEmployeesDetails(endPoint + pathParam);
        return this;
    }

    @Step
    public EmployeeDetailsSteps thenIVerifyProfileImageIsBlankForAllEmployees() {
        validateStatusCode();
        assertTrue(response.getContentType().equals("application/json"));
        employeesResponse = response.getBody().as(EmployeesResponse.class);
        System.out.println("Response========"+response.getBody().asString());
        assertEquals("Successfully! All records has been fetched.",employeesResponse.message,"Verify records fetched successfully");
        employeesResponse
                .data()
                .forEach(data -> assertTrue(data.profileImage.isEmpty(),"Verify profile image is blank"));
        return this;
    }

    public EmployeeDetailsSteps validateStatusCode() {
        assertNotNull(response);
        assertEquals(200,response.getStatusCode());
        return this;
    }

    @Step
    public EmployeeDetailsSteps thenIVerifyEmployeeDetailsAndMessageForAllEmployees() {
        validateStatusCode();
        employeeResponse = response.getBody().as(EmployeeResponse.class);
        System.out.println("Response========"+response.getBody().asString());
        assertEquals("success",employeeResponse.status,"verify status");
        assertNotNull(employeeResponse.data.id,"verify id");
        assertNotNull(employeeResponse.data.employeeSalary,"verify employee salary");
        assertNotNull(employeeResponse.data.employeeName,"verify employee name");
        assertNotNull(employeeResponse.data.employeeAge,"verify employee age");
        Assertions.assertTrue(employeeResponse.data.profileImage.isEmpty(), "verify profile image is blank");
        assertEquals("Successfully! Record has been fetched.",employeeResponse.message,"Verify record fetched successfully");
        return this;
    }

}

