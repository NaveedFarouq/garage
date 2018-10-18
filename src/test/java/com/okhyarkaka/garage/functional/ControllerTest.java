package com.okhyarkaka.garage.functional;

import com.jayway.restassured.http.ContentType;
import com.okhyarkaka.garage.GarageApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GarageApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ControllerTest {

    @LocalServerPort
    private String serverPort;


    @Test
    public void testingGetMethod() {
        given().
                contentType(ContentType.JSON).accept(ContentType.JSON).
                when().get("http://localhost:" + serverPort + "/").
                then().statusCode(200).
                and().body(equalTo("naveed"));
    }
}
