package steps;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class  ApiUserSteps extends ScenarioSteps {

    final String CREATE_USER = "https://reqres.in/api/users";

    @Step("Create user with credentials {0} & {1}")
    public void createUser(String firstName, String lastName) {

        String req = "{\"name\":\"morpheus\",\"job\":\"leader\"}";

        SerenityRest
                .rest()
                .contentType(ContentType.JSON)
                .body(req)
                .when()
                .post(CREATE_USER)
                .then()
                .assertThat()
                .statusCode(201);
    }

}
