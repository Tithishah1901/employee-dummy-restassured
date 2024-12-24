package com.restapiexample.dummy.dummyrestinfo;

import com.restapiexample.dummy.testbase.TestBase;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DummyDeleteTest extends TestBase {


    @Test
    public void verifyThatDeleteEmployee(){
        given().log().all()
                .header("Content-Type", "application/json")
                .header("cookie","humans_21909=1")
                .pathParam("id",8485)
                .when()
                .delete("/{id}")
                .then().log().all()
                .statusCode(204);
    }
}
