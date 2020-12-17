package dataDrivenPractice;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.restassured.http.ContentType;

public class DataDrivenP extends DataForTest {


	
//	@Test(dataProvider = "DataForPost")
	public void test_Post(String firstName, String lastName, int subjectId) {
		baseURI = "http://localhost:3000";

		JSONObject request = new JSONObject();

		request.put("firstName", firstName);
		request.put("lastName", lastName);
		request.put("subjectId",subjectId);

		given().contentType(ContentType.JSON).accept(ContentType.JSON).header("Content-Type", "application/json")
				.body(request.toJSONString()).when().post("/users").then().statusCode(201).log().all();
	}
	
	
	
//	@Test (dataProvider = "dataForDel")
	public void test_delete(int userId) {
		baseURI =  "http://localhost:3000";
		
		when().
			delete("/users/"+userId).
		then().
			statusCode(200);
			
		
	}

	@Parameters({"userId"})
	@Test
	public void test_delete2(int userId) {
		
		System.out.println("Value for UserID:-"+userId);
		baseURI =  "http://localhost:3000";
		
		when().
			delete("/users/"+userId).
		then().
			statusCode(200);
			
		
	}
}
