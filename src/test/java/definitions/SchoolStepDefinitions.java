package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.ApiSchoolSteps;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/15/2020, @time 14:07
 */
public class SchoolStepDefinitions {
    @Steps
    ApiSchoolSteps apiSchoolSteps;

    @Given("^System administrator wants to create a school with name \"([^\"]*)\", address \"([^\"]*)\", city \"([^\"]*)\", school type \"([^\"]*)\", and created date \"([^\"]*)\"$")
    public void systemAdministratorWantsToCreateASchoolWithNameAddressCitySchoolTypeAndCreatedDate(String schoolName, String address, String city, String schoolType, String createdDate){
        apiSchoolSteps.createSchool(schoolName, address, city, schoolType, createdDate);
    }

    @Then("^This school should be create in system$")
    public void thisSchoolShouldBeCreateInSystem() {
    }

    @Given("^System administrator wants to delete a school with id \"([^\"]*)\"$")
    public void systemAdministratorWantsToDeleteASchoolWithId(String schoolID) {
        apiSchoolSteps.deleteSchoolWithID(schoolID);
    }

    @Then("^This school should be deleted$")
    public void thisSchoolShouldBeDeleted() {
    }

    @Given("^System administrator want to update school with id \"([^\"]*)\"$")
    public void systemAdministratorWantToUpdateSchoolWithId(String schoolID)  {
        apiSchoolSteps.updateSchoolWithID(schoolID);
    }

    @Then("^This school should be updated$")
    public void thisSchoolShouldBeUpdated() {
    }
}
