package com.restassured.sample.tests;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

@Epic("Employee Details")
@Feature("Retrieve Employee Details")
@DisplayName("Employees details tests- To pick request data from external file")

public class SecondTest extends BaseTest{

    private static final String employeesData = "/TestData.csv";

    @ParameterizedTest
    @CsvFileSource(resources = employeesData,numLinesToSkip = 1)
    @DisplayName("Retrieve employee details for all the employees available in external file and validate success message")
    void shouldRetrieveEmployeeDetailsForEmployeeIdsInFile(String EmployeeIDs){
        steps
                .givenIHaveEmployeesServiceEndpoint()
                .whenIRetrieveEmployeesDetails("employee/"+EmployeeIDs)
                .thenIVerifyEmployeeDetailsAndMessageForAllEmployees();
    }
}
