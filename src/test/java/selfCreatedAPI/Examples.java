package selfCreatedAPI;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
//import 

public class Examples {
	
@Test
	public void test_Get() {
		
		baseURI =  "http://localhost:3000";
		given().
			param("name", "Automation").
			get("/subjects").
		then().
			statusCode(200).
			log().all();
			
	}
//	@Test
	public void test_Post() {
		baseURI =  "http://localhost:3000";
		
		JSONObject request = new JSONObject();
		
		request.put("firstName", "Tom");
		request.put("lastName", "Jerry");
		request.put("subjectId", "1");
		
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			header("Content-Type","application/json").
			body(request.toJSONString()).
		when()
			.post("/users").
		then().statusCode(201).
			log().all();
			
		
	}
//	@Test
	public void test_Patch() {
		baseURI =  "http://localhost:3000";
		
		JSONObject request = new JSONObject();
		
		
		request.put("lastName", "Sahil");
		
		
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			header("Content-Type","application/json").
			body(request.toJSONString()).
		when()
			.patch("/users/4").
		then().statusCode(200).
			log().all();
			
		
	}
//	@Test
	public void test_Put() {
		baseURI =  "http://localhost:3000";
		
		JSONObject request = new JSONObject();
		
		
		request.put("firstName", "Rahul");
		request.put("lastName", "Pandey");
		request.put("subjectId", "1");
		
		
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			header("Content-Type","application/json").
			body(request.toJSONString()).
		when()
			.put("/users/4").
		then().statusCode(200).
			log().all();
			
		
	}
//	@Test
	public void test_delete() {
		baseURI =  "http://localhost:3000";
		
		when().
			delete("/users/4").
		then().
			statusCode(200);
			
		
	}

}
