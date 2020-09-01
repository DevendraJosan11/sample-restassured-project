package com.restassured.sample.tests;

import com.restassured.sample.common.EndPoints;
import com.restassured.sample.config.Config;
import com.restassured.sample.steps.EmployeeDetailsSteps;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ContextConfiguration(classes = Config.class)
@ExtendWith(SpringExtension.class)
@TestPropertySource({ "classpath:endpoints.properties" })
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public abstract class BaseTest {
    @Autowired
    public EmployeeDetailsSteps steps;

    @Autowired
    public EndPoints endPoints;
}
