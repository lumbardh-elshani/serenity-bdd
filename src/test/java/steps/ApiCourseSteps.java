package steps;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.hamcrest.Matchers;

public class ApiCourseSteps extends ScenarioSteps {

    private final String GET_COURSES_BY_STUDENT_ID = "http://localhost:8662/course/course/student";
    private final String GET_COURSES_BY_TEACHER_ID = "http://localhost:8662/course/course/teacher?teacherId=6619afe0-f0ef-4aa5-a1e4-a597e8174bbf";
    private final String CREATE_FORUM_POST = "http://localhost:8662/course/forum-post";
    private final String GET_FORUM_POSTS_BY_COURSE_ID = "http://localhost:8662/course/forum-post?courseId=858e7eac-e125-4f27-97be-17eeb9d1efa5";

    @Step("Get courses by student id")
    public void getCoursesByStudentId() {
        SerenityRest
                .rest()
                .contentType(ContentType.JSON)
                .header(new Header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiI1OGZkNjJjMS0wYjU4LTQ1NmYtOGMzYi0yMWJkZjU3MzlkMzciLCJleHAiOjE1OTY1NjI3OTF9.pgs_wXTVvuHcDiQz39vdK6wSlH3Gi9bJlGS_pnapOVBIEPbg517NdqS4f6pMSFUmEmBkvC1GlvIQW-p_HEQQ9Q"))
                .when()
                .get(GET_COURSES_BY_STUDENT_ID)
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Step("Receive courses")
    public void verifyCoursesReception() {
        SerenityRest
                .lastResponse()
                .then()
                .assertThat()
                .body("name[0]", Matchers.equalTo("MAth 1"))
                .statusCode(200);
    }

    @Step("Get courses by teacher id")
    public void getCoursesByTeacherId() {
        SerenityRest
                .rest()
                .contentType(ContentType.JSON)
                .header(new Header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiI1OGZkNjJjMS0wYjU4LTQ1NmYtOGMzYi0yMWJkZjU3MzlkMzciLCJleHAiOjE1OTY1NjI3OTF9.pgs_wXTVvuHcDiQz39vdK6wSlH3Gi9bJlGS_pnapOVBIEPbg517NdqS4f6pMSFUmEmBkvC1GlvIQW-p_HEQQ9Q"))
                .when()
                .get(GET_COURSES_BY_TEACHER_ID);
    }

    @Step("Receive teacher courses")
    public void verifyCoursesReceptionForTeacher() {
        SerenityRest
                .lastResponse()
                .then()
                .assertThat()
                .body("name[0]", Matchers.equalTo("Biology"))
                .statusCode(200);
    }

    @Step("Create forum post")
    public void createForumPost() {
        JsonObject forumPostObj = new JsonObject();
        forumPostObj.addProperty("title", "New post");
        forumPostObj.addProperty("content", "my new post");
        JsonObject courseObj = new JsonObject();
        courseObj.addProperty("id", "858e7eac-e125-4f27-97be-17eeb9d1efa5");
        forumPostObj.add("courseId", courseObj);
        JsonObject authorObj = new JsonObject();
        authorObj.addProperty("id", "58fd62c1-0b58-456f-8c3b-21bdf5739d37");
        forumPostObj.add("authorId", authorObj);
        SerenityRest
                .rest()
                .contentType(ContentType.JSON)
                .header(new Header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiI1OGZkNjJjMS0wYjU4LTQ1NmYtOGMzYi0yMWJkZjU3MzlkMzciLCJleHAiOjE1OTY1NjI3OTF9.pgs_wXTVvuHcDiQz39vdK6wSlH3Gi9bJlGS_pnapOVBIEPbg517NdqS4f6pMSFUmEmBkvC1GlvIQW-p_HEQQ9Q"))
                .body(forumPostObj.toString())
                .when()
                .post(CREATE_FORUM_POST);
    }

    @Step("Get created post")
    public void verifyForumPostCreation() {
        SerenityRest
                .lastResponse()
                .then()
                .assertThat()
                .body("title", Matchers.equalTo("New post"))
                .statusCode(201);
    }

    @Step("Get forum posts by course id")
    public void getForumPostsByCourseId() {
        SerenityRest
                .rest()
                .contentType(ContentType.JSON)
                .header(new Header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiI1OGZkNjJjMS0wYjU4LTQ1NmYtOGMzYi0yMWJkZjU3MzlkMzciLCJleHAiOjE1OTY1NjI3OTF9.pgs_wXTVvuHcDiQz39vdK6wSlH3Gi9bJlGS_pnapOVBIEPbg517NdqS4f6pMSFUmEmBkvC1GlvIQW-p_HEQQ9Q"))
                .when()
                .get(GET_FORUM_POSTS_BY_COURSE_ID)
                .then()
                .assertThat()
                .statusCode(200);
    }

    public void verifyForumPostsReception() {
        SerenityRest
                .lastResponse()
                .then()
                .assertThat()
                .body("id[0]", Matchers.equalTo("1454defd-b8bd-49e9-9ce3-5733fb5a4b60"));
    }

}
