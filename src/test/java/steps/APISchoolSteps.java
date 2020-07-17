package steps;

import com.google.gson.JsonObject;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.openqa.selenium.json.Json;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/15/2020, @time 14:09
 */
public class APISchoolSteps {
    public void createSchool(String schoolName, String address, String city, String schoolType, String createdDate) {

        JsonObject schoolObj = new JsonObject();
        schoolObj.addProperty("name", schoolName);
        schoolObj.addProperty("address", address);
        schoolObj.addProperty("city", city);
        schoolObj.addProperty("schoolType", schoolType);
        schoolObj.addProperty("schoolCreationDate", createdDate);

        SerenityRest
                .rest()
                .contentType(ContentType.JSON)
                .header(new Header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiI0MTdjOTQ2MC1jM2I2LTExZWEtODdkMC0wMjQyYWMxMzAwMDMiLCJleHAiOjE1OTY0OTU1NDR9.DPu5NaUghcIYkLx1d5NzTCJWrVwVsI_OrsaS9YvqNymMkhtJEAsQ2CzXM9IqADzSKFJaZml98OdAmuZYIbrZjQ"))
                .body(schoolObj.toString())
                .when()
                .post(GlobalConstants.SCHOOL_ENDPOINT);
    }

    @Step("This is response validation for school creation")
    public void verifySchoolCreation(){
        SerenityRest.lastResponse()
                .then()
                .assertThat()
                .body("recordStatus", Matchers.equalTo("ACTIVE"))
                .statusCode(200);
    }

    public void updateSchoolWithID(String schoolID) {
        JsonObject newSchoolObj = new JsonObject();
        newSchoolObj.addProperty("name", "PUT Rasim Kicina");
        newSchoolObj.addProperty("address", "Rruga Tahir Meha");
        newSchoolObj.addProperty("city", "Drenas");
        newSchoolObj.addProperty("schoolType", "PRIVATE");
        newSchoolObj.addProperty("schoolCreationDate", "2020-07-15");

        SerenityRest
                .rest()
                .contentType(ContentType.JSON)
                .header(new Header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiI0MTdjOTQ2MC1jM2I2LTExZWEtODdkMC0wMjQyYWMxMzAwMDMiLCJleHAiOjE1OTY0OTU1NDR9.DPu5NaUghcIYkLx1d5NzTCJWrVwVsI_OrsaS9YvqNymMkhtJEAsQ2CzXM9IqADzSKFJaZml98OdAmuZYIbrZjQ"))
                .body(newSchoolObj)
                .when()
                .put(GlobalConstants.SCHOOL_ENDPOINT +"/"+schoolID);
    }

    @Step("This is response validation for school update")
    public void verifySchoolUpdate(String schoolID){
        SerenityRest.lastResponse()
                .then()
                .assertThat()
                .body("id", Matchers.equalTo(schoolID))
                .statusCode(200);
    }

    public void deleteSchoolWithID(String schoolID) {
        SerenityRest
                .rest()
                .contentType(ContentType.JSON)
                .header(new Header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiI0MTdjOTQ2MC1jM2I2LTExZWEtODdkMC0wMjQyYWMxMzAwMDMiLCJleHAiOjE1OTY0OTU1NDR9.DPu5NaUghcIYkLx1d5NzTCJWrVwVsI_OrsaS9YvqNymMkhtJEAsQ2CzXM9IqADzSKFJaZml98OdAmuZYIbrZjQ"))
                .when()
                .delete(GlobalConstants.SCHOOL_ENDPOINT +"/"+schoolID);
    }

    public void verifySchoolDeletion() {
        SerenityRest.
                lastResponse()
                .then()
                .assertThat()
                .body(Matchers.isEmptyOrNullString())
                .statusCode(200);
    }
}
