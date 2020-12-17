import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
//import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class StaticLiabirary_GET2 {
	
	@Test
	void test_01() {
		
		Response response = get("https://reqres.in/api/users?page=2");
		
		System.out.println("Response in String:-"+response.asString());
		System.out.println("Body of Response\n"+ response.getBody().asString());
	//s	System.out.println("Body Response :- " +response.getBody());
		System.out.println("Body Response :- " +response.getStatusCode());
		//System.out.println("Cookies Response :- " +response.getCookie());
		System.out.println("Status Line Response :- " +response.getStatusLine());
		System.out.println("Time  Response :- "+  response.getTime());
		System.out.println("Header: "+response.getHeader("content-type"));
		
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
				
	}

	@Test
	void test_02() {
		given().
			get("https://reqres.in/api/users?page=2").
		then().
			statusCode(200)
			.body("data.id[0]", equalTo(9));
	}
}
