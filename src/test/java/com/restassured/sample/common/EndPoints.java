package com.restassured.sample.common;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@RequiredArgsConstructor
public class EndPoints {
    @Value("${baseURI}")
    private String baseURI;

    public String getEmployeesServiceFullPath() {return  baseURI;}
}

