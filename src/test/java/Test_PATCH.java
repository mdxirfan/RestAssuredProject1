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

public class Test_PATCH {
	@Test
	public void test_DELETE() {
		
		when().
			delete("https://reqres.in/api/users/2").
		then().
			statusCode(204).
			log().all();
	}
	

	
	
	
	
		
	

}
