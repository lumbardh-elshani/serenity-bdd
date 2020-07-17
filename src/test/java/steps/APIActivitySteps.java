package steps;

import com.google.gson.JsonObject;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.serenitybdd.rest.SerenityRest;
import org.jetbrains.annotations.NotNull;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/15/2020, @time 19:52
 */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class APIActivitySteps {

    public void getActivityWithID(String activityID) {
        SerenityRest
                .rest()
                .contentType(ContentType.JSON)
                .header(new Header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiI0MTdjOTQ2MC1jM2I2LTExZWEtODdkMC0wMjQyYWMxMzAwMDMiLCJleHAiOjE1OTY0OTU1NDR9.DPu5NaUghcIYkLx1d5NzTCJWrVwVsI_OrsaS9YvqNymMkhtJEAsQ2CzXM9IqADzSKFJaZml98OdAmuZYIbrZjQ"))
                .when()
                .get(GlobalConstants.ACTIVITY_ENDPOINT + "/" + activityID)
                .then()
                .assertThat()
                .statusCode(200);
    }

    public void createActivity(String name, String description) {

        JsonObject activityObj = getActivityObject(name, description);
        SerenityRest
                .rest()
                .contentType(ContentType.JSON)
                .header(new Header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiI0MTdjOTQ2MC1jM2I2LTExZWEtODdkMC0wMjQyYWMxMzAwMDMiLCJleHAiOjE1OTY0OTU1NDR9.DPu5NaUghcIYkLx1d5NzTCJWrVwVsI_OrsaS9YvqNymMkhtJEAsQ2CzXM9IqADzSKFJaZml98OdAmuZYIbrZjQ"))
                .body(activityObj.toString())
                .when()
                .post(GlobalConstants.ACTIVITY_ENDPOINT)
                .then()
                .assertThat()
                .statusCode(200);
    }

    @NotNull
    private JsonObject getActivityObject(String name, String description) {
        JsonObject commentObj = new JsonObject();
        commentObj.addProperty("name", name);
        commentObj.addProperty("description", description);
        return commentObj;
    }

    public void editActivityWithID(String activityID) {
        JsonObject activityObj = new JsonObject();
        activityObj.addProperty("name", "EDITED Automatic Activity");
        activityObj.addProperty("description", "EDITED Automatic Activity from serenity-bdd");

        SerenityRest
                .rest()
                .contentType(ContentType.JSON)
                .header(new Header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiI0MTdjOTQ2MC1jM2I2LTExZWEtODdkMC0wMjQyYWMxMzAwMDMiLCJleHAiOjE1OTY0OTU1NDR9.DPu5NaUghcIYkLx1d5NzTCJWrVwVsI_OrsaS9YvqNymMkhtJEAsQ2CzXM9IqADzSKFJaZml98OdAmuZYIbrZjQ"))
                .body(activityObj.toString())
                .when()
                .put(GlobalConstants.ACTIVITY_ENDPOINT + "/" + activityID)
                .then()
                .assertThat()
                .statusCode(200);
    }

    public void deleteActivityWithID(String activityID) {
        SerenityRest
                .rest()
                .contentType(ContentType.JSON)
                .header(new Header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiI0MTdjOTQ2MC1jM2I2LTExZWEtODdkMC0wMjQyYWMxMzAwMDMiLCJleHAiOjE1OTY0OTU1NDR9.DPu5NaUghcIYkLx1d5NzTCJWrVwVsI_OrsaS9YvqNymMkhtJEAsQ2CzXM9IqADzSKFJaZml98OdAmuZYIbrZjQ"))
                .when()
                .delete(GlobalConstants.ACTIVITY_ENDPOINT + "/" + activityID)
                .then()
                .assertThat()
                .statusCode(200);
    }
}

