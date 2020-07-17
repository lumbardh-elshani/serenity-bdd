package steps;

import com.google.gson.JsonObject;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.hamcrest.Matchers;

public class ApiCalendarSteps extends ScenarioSteps {

    @Step("Create new event")
    public void createEvent() {
        JsonObject eventTransportObj = new JsonObject();
        eventTransportObj.addProperty("type", "User");
        eventTransportObj.addProperty("description", "User event test description");
        eventTransportObj.addProperty("title", "User event title test");
        eventTransportObj.addProperty("date", "2020-26-07");
        eventTransportObj.addProperty("startingTime", "16:00:00");
        eventTransportObj.addProperty("endingTime", "17:00:00");

        SerenityRest
                .rest()
                .contentType(ContentType.JSON)
                .body(eventTransportObj.toString())
                .when()
                .header(new Header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiI0MTdjOTQ2MC1jM2I2LTExZWEtODdkMC0wMjQyYWMxMzAwMDMiLCJleHAiOjE1OTY0OTU1NDR9.DPu5NaUghcIYkLx1d5NzTCJWrVwVsI_OrsaS9YvqNymMkhtJEAsQ2CzXM9IqADzSKFJaZml98OdAmuZYIbrZjQ"))
                .post(GlobalConstants.CALENDAR_URL + "/events?schoolId='08a88645-bbd4-461b-bafe-4cfe289072da'");

    }

    @Step("Response validation for creating an event")
    public void verifyEventCreation() {
        SerenityRest.lastResponse().then()
                .assertThat()
                .body("id", Matchers.notNullValue())
                .statusCode(201);
    }

    @Step("Get school events")
    public void getEventsBySchoolId() {
        SerenityRest
                .rest()
                .contentType(ContentType.JSON)
                .header(new Header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiI0MTdjOTQ2MC1jM2I2LTExZWEtODdkMC0wMjQyYWMxMzAwMDMiLCJleHAiOjE1OTY0OTU1NDR9.DPu5NaUghcIYkLx1d5NzTCJWrVwVsI_OrsaS9YvqNymMkhtJEAsQ2CzXM9IqADzSKFJaZml98OdAmuZYIbrZjQ"))
                .when()
                .get(GlobalConstants.CALENDAR_URL + "/events?schoolId='08a88645-bbd4-461b-bafe-4cfe289072da'");

    }

    @Step("Response validation for school event list reception")
    public void verifyEventListReception() {
        SerenityRest
                .lastResponse()
                .then()
                .assertThat()
                .body("eventTransportList", Matchers.notNullValue())
                .statusCode(200);
    }

    @Step("Delete event by event id")
    public void deleteEventByEventId() {
        SerenityRest.rest()
                .contentType(ContentType.JSON)
                .header(new Header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiI0MTdjOTQ2MC1jM2I2LTExZWEtODdkMC0wMjQyYWMxMzAwMDMiLCJleHAiOjE1OTY0OTU1NDR9.DPu5NaUghcIYkLx1d5NzTCJWrVwVsI_OrsaS9YvqNymMkhtJEAsQ2CzXM9IqADzSKFJaZml98OdAmuZYIbrZjQ"))
                .when()
                .delete(GlobalConstants.CALENDAR_URL + "/events/9bcfaf40-ec3e-4042-83c7-0754808313da");

    }

    @Step("Response validation for event deletion")
    public void verifyEventDeletion() {
        SerenityRest
                .lastResponse()
                .then()
                .assertThat()
                .body(Matchers.isEmptyOrNullString())
                .statusCode(204);
    }

}
