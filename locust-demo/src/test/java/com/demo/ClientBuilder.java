package com.demo;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.specification.RequestSpecification;

public class ClientBuilder {

    public static RequestSpecification useDefault() {
        return RestAssured.given()
                .baseUri("http://jmeter.apache.org/")
                .relaxedHTTPSValidation();

    }
}
