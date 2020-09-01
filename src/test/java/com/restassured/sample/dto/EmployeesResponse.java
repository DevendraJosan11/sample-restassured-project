package com.restassured.sample.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@Accessors (fluent = true,chain = true)
public class EmployeesResponse {

    @JsonProperty("status")
    public String status;
    @JsonProperty("data")
    public List<Data> data = null;
    @JsonProperty("message")
    public String message;

}
