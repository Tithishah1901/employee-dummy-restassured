package com.restapiexample.dummy.dummyrestinfo;

import com.restapiexample.dummy.model.EmployeePojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DummyPutUpDateTest extends TestBase {

    @Test
    public void updateEmployeeAge(){
        EmployeePojo employeePojo = new EmployeePojo();
        employeePojo.setName("Krishna Kumar");
        employeePojo.setSalary(125000);
        employeePojo.setAge(50);
        employeePojo.setImage(" ");

        Response response = given()
                .header("Content-Type","application/json")
                .header("cookie","humans_21909=1")
                .pathParam("age","51")
                .when()
                .body(employeePojo)
                .put("/update/{age}");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}
