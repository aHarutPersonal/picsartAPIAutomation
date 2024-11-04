package com.picsart.clients;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public abstract class BaseApi {
    protected RequestSpecification requestSpecification;

    protected BaseApi(String path) {
        requestSpecification = RestAssured.given().basePath(path).log().all();
    }
}
