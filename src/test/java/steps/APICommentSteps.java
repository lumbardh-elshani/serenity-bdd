package steps;

import com.google.gson.JsonObject;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.jetbrains.annotations.NotNull;

/**
 * @author lumba
 * @project uiautomation
 * @date 7/15/2020, @time 15:42
 */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class APICommentSteps {
    @Step("Create comment with content: {0}, and note: {1}")
    public void createComment(String content, String note, String postId) {
        JsonObject commentObj = getCommentObject(content, note);
        SerenityRest
                .rest()
                .contentType(ContentType.JSON)
                .header(new Header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiI0MTdjOTQ2MC1jM2I2LTExZWEtODdkMC0wMjQyYWMxMzAwMDMiLCJleHAiOjE1OTY0OTU1NDR9.DPu5NaUghcIYkLx1d5NzTCJWrVwVsI_OrsaS9YvqNymMkhtJEAsQ2CzXM9IqADzSKFJaZml98OdAmuZYIbrZjQ"))
                .queryParam("postId",postId)
                .body(commentObj.toString())
                .when()
                .post(GlobalConstants.COMMENT_ENDPOINT);
    }

    @Step("This is response validation for comment creation")
    public void verifyCommentCreation(){
        SerenityRest.lastResponse()
                .then()
                .assertThat()
                .body("id", Matchers.notNullValue())
                .statusCode(200);
    }

    @NotNull
    private JsonObject getCommentObject(String content, String note) {
        JsonObject commentObj = new JsonObject();
        commentObj.addProperty("note", note);
        commentObj.addProperty("content", content);
        return commentObj;
    }

    public void editCommentWithID(String commentID, String postId) {
        JsonObject commentObj = new JsonObject();
        commentObj.addProperty("note", "EDITED COMMENT");
        commentObj.addProperty("content", "Ky koment eshte i edituar");

        SerenityRest
                .rest()
                .contentType(ContentType.JSON)
                .header(new Header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiI0MTdjOTQ2MC1jM2I2LTExZWEtODdkMC0wMjQyYWMxMzAwMDMiLCJleHAiOjE1OTY0OTU1NDR9.DPu5NaUghcIYkLx1d5NzTCJWrVwVsI_OrsaS9YvqNymMkhtJEAsQ2CzXM9IqADzSKFJaZml98OdAmuZYIbrZjQ"))
                .queryParam("postId",postId)
                .body(commentObj.toString())
                .when()
                .put(GlobalConstants.COMMENT_ENDPOINT + "/" + commentID)
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Step("This is response validation for comment modification")
    public void verifyCommentModification(){
        SerenityRest.lastResponse()
                .then()
                .assertThat()
                .body("id", Matchers.notNullValue())
                .statusCode(200);
    }

    public void getCommentWithID(String commentID, String postId) {
        SerenityRest
                .rest()
                .contentType(ContentType.JSON)
                .header(new Header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiI0MTdjOTQ2MC1jM2I2LTExZWEtODdkMC0wMjQyYWMxMzAwMDMiLCJleHAiOjE1OTY0OTU1NDR9.DPu5NaUghcIYkLx1d5NzTCJWrVwVsI_OrsaS9YvqNymMkhtJEAsQ2CzXM9IqADzSKFJaZml98OdAmuZYIbrZjQ"))
                .queryParam("postId",postId)
                .when()
                .get(GlobalConstants.COMMENT_ENDPOINT + "/" + commentID)
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Step("This is response validation for comment fetch")
    public void verifyCommentFetch(String commentID){
        SerenityRest.lastResponse()
                .then()
                .assertThat()
                .body("id", Matchers.equalTo(commentID))
                .statusCode(200);
    }

    public void deleteCommentWithID(String commentID, String postId) {
        SerenityRest
                .rest()
                .contentType(ContentType.JSON)
                .header(new Header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiI0MTdjOTQ2MC1jM2I2LTExZWEtODdkMC0wMjQyYWMxMzAwMDMiLCJleHAiOjE1OTY0OTU1NDR9.DPu5NaUghcIYkLx1d5NzTCJWrVwVsI_OrsaS9YvqNymMkhtJEAsQ2CzXM9IqADzSKFJaZml98OdAmuZYIbrZjQ"))
                .queryParam("postId",postId)
                .when()
                .delete(GlobalConstants.COMMENT_ENDPOINT + "/" + commentID)
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Step("This is response validation when a comment is removed")
    public void verifyCommentIsRemoved(){
        SerenityRest.lastResponse()
                .then()
                .assertThat()
                .statusCode(200);
    }
}
