package steps;

import com.google.gson.JsonObject;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class  ApiUserSteps extends ScenarioSteps {

    final String CREATE_USER = "http://localhost:8662/user/users";

    final String GET_USER = "http://localhost:8662/user/users";

//    @Step("Create user with credentials {0} & {1}")
//    public void createUser(String firstName, String lastName) {
//
//        String req = "{\"name\":\"morpheus\",\"job\":\"leader\"}";
//
//        SerenityRest
//                .rest()
//                .contentType(ContentType.JSON)
//                .body(req)
//                .when()
//                .post(CREATE_USER)
//                .then()
//                .assertThat()
//                .statusCode(201);
//    }

    @Step("Get use by id")
    public void getUserById() {

        SerenityRest
                .rest()
                .contentType(ContentType.JSON)
                .header(new Header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiI2ODU0NmMwMS1jZDM2LTRjMWUtOTEzYi03ZTM1Y2JjZDU3ZGIiLCJleHAiOjE1OTQ4NDQwNzl9.H_uUke8e9ATh4OB-ahJJFnRmpSCboEHyVVMYfvdDrF2qXsMjoZBXlyBlgpFRzmptKvhos8_g7k2nuLZMTjyiGg"))
                .when()
                .get(CREATE_USER)
                .then()
                .assertThat()
                .statusCode(200);

    }

    @Step("Register")
    public void register() {
        JsonObject userObj = new JsonObject();
        userObj.addProperty("email", "kobe@bryant.com");
        userObj.addProperty("firstName", "Kobe");
        userObj.addProperty("lastName", "Bryant");
        userObj.addProperty("birthDate", "1980-09-09");
        userObj.addProperty("gender", "MALE");
        userObj.addProperty("role", "STUDENT");
        userObj.addProperty("password", "rinori123");
        SerenityRest
                .rest()
                .contentType(ContentType.JSON)
                .body(userObj.toString())
                .when()
                .post(CREATE_USER)
                .then()
                .assertThat()
                .statusCode(201);

    }
}
