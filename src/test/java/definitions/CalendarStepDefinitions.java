package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.ApiCalendarSteps;

public class CalendarStepDefinitions {

    @Steps
    ApiCalendarSteps apiCalendarSteps;

    @Given("^User wants to add new event to his calendar$")
    public void userWantsToAddNewEventToHisCalendar(){
        apiCalendarSteps.createEvent();
    }

    @Then("^Event should be saved to the database and returned$")
    public void eventShouldBeSavedToTheDatabsaeAndReturned(){
    }

    @Given("^User wants to get the school's events$")
    public void userWantsToGetEvents(){
        apiCalendarSteps.getEventsBySchoolId();
    }

    @Then("^Events are returned$")
    public void eventsAreReturned(){
    }

    @Given("^User wants to delete an event$")
    public void userWantsToDeleteAnEvent(){
    }

    @Then("^Event should be deleted$")
    public void eventShouldBeDeleted(){
    }
}
