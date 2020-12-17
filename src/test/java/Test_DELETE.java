import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

/// gson
//Jackson
//Json
//simple json
//https://reqres.in/api/users?page=2

public class Test_DELETE {
	@Test
	public void test_Patch() {
		
		JSONObject patch = new JSONObject();
		
		patch.put("name", "Mohd Irfan");
		patch.put("job", "Tester");
		
		given().
			header("content-Type","application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(patch.toJSONString()).
		when().
			patch("https://reqres.in/api/users/2").
		then().
			statusCode(200).
			log().all();
	}
	

	
	
	
	
		
	

}
