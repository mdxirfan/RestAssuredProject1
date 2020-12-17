import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test01_GET {
	
	@Test
	void test_01() {
		
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		
		System.out.println("Response in String:-"+response.asString());
		System.out.println("Body of Response\n"+ response.getBody().asString());
	//s	System.out.println("Body Response :- " +response.getBody());
		System.out.println("Body Response :- " +response.getStatusCode());
		//System.out.println("Cookies Response :- " +response.getCookie());
		System.out.println("Status Line Response :- " +response.getStatusLine());
		System.out.println("Time  Response :- "+  response.getTime());
		System.out.println("Header: "+response.getHeader("content-type"));
		
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 201);
			
	}

}
