package selfCreatedAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

import java.util.HashMap;

public class TC_VedioGameAPI {
//	@Test(priority = 1)
	public void test_getAllVedioGames() {
		
		given()		
		
		.when()
			.get("").
			
		then().statusCode(200);
	
		
	}
	@Test(priority = 2)
	public void test_addNewVedioGame() {
		
		HashMap data = new HashMap();
		
		data.put("id", "100");
		data.put("name", "Spider-Man");
		data.put("releaseDate", "2019-09-20T08:55XXX");
		data.put("reviewScore", "Adventure");
		data.put("rating", "Universal");
		
		Response res =
		given().
			contentType("application/json").
			body(data).
		when().
			post().
		then().
			statusCode(200).
			log().body().
			extract().
			response();
		
		String jsonString = res.asString();
		
		Assert.assertEquals(jsonString.contains("Record Added Succesfull"), true);
		
		
	}
	@Test(priority =3)
	public void getVedioGame() {
		
		given().
		
		when().
			get("").
		then().
			statusCode(200).
			body("vedioGame.id", equalTo("100")).
			body("vedioGame.name", equalTo("SpiderMan"));
			
		
	}
	@Test
	public void putUpdateGame() {
	HashMap data = new HashMap();
		
		data.put("id", "100");
		data.put("name", "BAT-Man");
		data.put("releaseDate", "2019-09-20T08:55XXX");
		data.put("reviewScore", "Adventure");
		data.put("rating", "Universal");
		
		given().
			contentType(ContentType.JSON).
			accept("application/json").
		when().
			post("http").
		then().
			statusCode(200).
			log().body().body("vediogame.id",equalTo("100") );
		
		
		
	}

}
