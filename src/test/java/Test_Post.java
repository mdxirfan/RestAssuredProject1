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

public class Test_Post {
	
	@Test
	public void test_post1() {
		Map<String,Object> map = new HashMap<String, Object>();
		
	//	map.put("\"name\"", "morpheus");
		map.put("name", "morpheus");
		map.put("job", "leader");
		
		System.out.println("Map Values"+map);
		
		// This is Example for converting the Map to Json
		JSONObject request = new JSONObject(map);
		System.out.println("Map Values"+request.toJSONString());
		
		// This is the example for directly initilizing the Header to Json
		JSONObject request1 = new JSONObject(map);
		
		request.put("name", "morpheus");
		request.put("job", "leader");
		
		System.out.println("Map Values Derect Assignment :-"+request.toJSONString());
		
		given().
			headers("content-Type"," application/json").
			contentType(ContentType.JSON).accept(ContentType.JSON).
			body(request1.toJSONString()).
		when().
			post("https://reqres.in/api/users?page=2").
		then().
			statusCode(201);
		
	}
/*	@Test	
	public void test2_PUT() {
		
		JSONObject put1 = new JSONObject();
		put1.put("name", "Mohd Irfan");
		put1.put("job", "Tester");
		
		given().
			headers("content-Type"," application/json").
			contentType(ContentType.JSON).accept(ContentType.JSON).
			body(put1.toJSONString()).
		when().
			put("https://reqres.in/api/users/2").
		then().
			statusCode(200).
			log().all();
		
	}*/

}
