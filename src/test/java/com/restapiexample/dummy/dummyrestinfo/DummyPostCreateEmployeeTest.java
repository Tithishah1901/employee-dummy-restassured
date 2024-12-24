package com.restapiexample.dummy.dummyrestinfo;

import com.restapiexample.dummy.model.EmployeePojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DummyPostCreateEmployeeTest extends TestBase {


    @Test
    public void verifyCreateEmployee() {
        EmployeePojo employeePojo = new EmployeePojo();
        employeePojo.setName("Krishna Kumar");
        employeePojo.setSalary(125000);
        employeePojo.setAge(50);
        employeePojo.setImage(" ");

        Response response = given().log().all()
                .header("Content-Type","application/json")
                .header("cookie","humans_21909=1")
                .when()
                .body(employeePojo)
                .post("/create");
        response.prettyPrint();
        response.then().statusCode(200);

    }
}
