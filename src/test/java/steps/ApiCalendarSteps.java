package steps;

import com.google.gson.JsonObject;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ApiCalendarSteps extends ScenarioSteps {

    @Step("Create new event")
    public void createEvent(){
        JsonObject eventTransportObj = new JsonObject();
        eventTransportObj.addProperty("type","User");
        eventTransportObj.addProperty("description","User event test description");
        eventTransportObj.addProperty("title","User event title test");
        eventTransportObj.addProperty("date","2020-26-07");
        eventTransportObj.addProperty("startingTime","16:00:00");
        eventTransportObj.addProperty("endingTime","17:00:00");

        SerenityRest
                .rest()
                .contentType(ContentType.JSON)
                .body(eventTransportObj.toString())
                .when()
//                .header(new Header("Authorization","Bearer TOKEN_HERE"))
                .post(GlobalConstants.CALENDAR_URL+"/events?schoolId='123'")
                .then()
                .assertThat()
                .statusCode(201);
    }

    @Step("Get school events    ")
    public void getEventsBySchoolId(){
        SerenityRest
                .rest()
                .contentType(ContentType.JSON)
//                .header(new Header("Authorization","Bearer TOKEN_HERE"))
                .when()
                .get(GlobalConstants.CALENDAR_URL+"/events?schoolId='123'")
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Step("Delete event by event id")
    public void deleteEventByEventId(){
        SerenityRest.rest()
                .contentType(ContentType.JSON)
                //                .header(new Header("Authorization","Bearer TOKEN_HERE"))
                .when()
                .delete(GlobalConstants.CALENDAR_URL+"/events/8612255a-fb09-4599-a80e-fff70f415409")
                .then()
                .assertThat()
                .statusCode(204);
    }
}
