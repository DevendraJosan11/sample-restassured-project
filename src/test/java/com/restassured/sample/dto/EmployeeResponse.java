package com.restassured.sample.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors (fluent = true,chain = true)
public class EmployeeResponse {

    @JsonProperty("status")
    public String status;
    @JsonProperty("data")
    public Data data ;
    @JsonProperty("message")
    public String message;

}
