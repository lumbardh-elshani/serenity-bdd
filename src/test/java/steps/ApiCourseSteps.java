package steps;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ApiCourseSteps extends ScenarioSteps {

    private final String GET_COURSES_BY_STUDENT_ID = "http://localhost:8662/course/course/student";
    private final String GET_COURSES_BY_TEACHER_ID = "http://localhost:8662/course/course/teacher";
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

    @Step("Get courses by teacher id")
    public void getCoursesByTeacherId() {
        SerenityRest
                .rest()
                .contentType(ContentType.JSON)
                .header(new Header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiI1OGZkNjJjMS0wYjU4LTQ1NmYtOGMzYi0yMWJkZjU3MzlkMzciLCJleHAiOjE1OTY1NjI3OTF9.pgs_wXTVvuHcDiQz39vdK6wSlH3Gi9bJlGS_pnapOVBIEPbg517NdqS4f6pMSFUmEmBkvC1GlvIQW-p_HEQQ9Q"))
                .when()
                .get(GET_COURSES_BY_TEACHER_ID)
                .then()
                .assertThat()
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
                .header(new Header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiI2ODU0NmMwMS1jZDM2LTRjMWUtOTEzYi03ZTM1Y2JjZDU3ZGIiLCJleHAiOjE1OTQ4NDQwNzl9.H_uUke8e9ATh4OB-ahJJFnRmpSCboEHyVVMYfvdDrF2qXsMjoZBXlyBlgpFRzmptKvhos8_g7k2nuLZMTjyiGg"))
                .body(forumPostObj.toString())
                .when()
                .post(CREATE_FORUM_POST)
                .then()
                .assertThat()
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

}
