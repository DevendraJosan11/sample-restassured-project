package com.restassured.sample.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(fluent = true,chain = true)
public class Data {

    @JsonProperty("id")
    public Integer id;
    @JsonProperty("employee_name")
    public String employeeName;
    @JsonProperty("employee_salary")
    public Integer employeeSalary;
    @JsonProperty("employee_age")
    public Integer employeeAge;
    @JsonProperty("profile_image")
    public String profileImage;

}