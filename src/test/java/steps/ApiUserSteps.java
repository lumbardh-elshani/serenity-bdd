package steps;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import java.io.File;

public class ApiUserSteps extends ScenarioSteps {

    final String CREATE_USER = "https://reqres.in/api/users";
    final String GET_USER = "https://reqres.in/api/users?page=2";

    @Step("Creat user with credentials {0} & {1}")
    public void createUser(String firstName, String lastName) {

        String req = "{\"name\":\"morpheus\",\"job\":\"leader\"}";

        File file = new File("");

        SerenityRest
                .rest()
                .contentType(ContentType.JSON)
                .body(file)
                .when()
                .post(CREATE_USER)
                .then()
                .assertThat()
                .statusCode(2088);
    }

    public void getUsers() {

        SerenityRest
                .rest()
                .when()
                .get(GET_USER)
                .then()
                .assertThat()
                .statusCode(200);
    }
}
