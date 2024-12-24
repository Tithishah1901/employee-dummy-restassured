package com.restapiexample.dummy.dummyrestinfo;

import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DummyGetEmployeeAndIDTest extends TestBase {

    @Test
    public void getEmployeeList(){
        Response response = given()
                .header("cookie","humans_21909=1")
                .when()
                .get("/employees");
        response.prettyPrint();
        response.then().statusCode(200);
    }
    @Test
    public void getEmployeeId(){
        Response response = given()
                .pathParam("id","2")
                .when()
                .get("/{id}");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}
