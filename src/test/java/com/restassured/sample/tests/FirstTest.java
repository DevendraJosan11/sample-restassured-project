package com.restassured.sample.tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Epic("Employee Details")
@Feature("Retrieve Employee Details")
@DisplayName("Employees details tests - To Pick API link from config file")
public class FirstTest extends BaseTest {

    @Test
    @DisplayName("Retrieve employees details and verify profile image is blank for all employees")
    void shouldGetRetrieveDetailsSuccessfully(){
        steps
                .givenIHaveEmployeesServiceEndpoint()
                .whenIRetrieveEmployeesDetails("employees")
                .thenIVerifyProfileImageIsBlankForAllEmployees();
    }


}
