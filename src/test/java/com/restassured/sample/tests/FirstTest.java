package com.restassured.sample.tests;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.test.annotation.Repeat;

@Epic("Employee Details")
@Feature("Retrieve Employee Details")
@DisplayName("Employees details tests")
public class FirstTest extends BaseTest {

    @Repeat(5)
    @Test
    @DisplayName("Retrieve employees details and validated profile image is blank for all employees")
    @Description("First Test")
    void firstTest(){
        steps
                .givenIHaveEmployeesServiceEndpoint()
                .whenIRetrieveEmployeesDetails("employees")
                .thenIVerifyProfileImageIsBlankForAllEmployees();
    }


}
