import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class Test_GET {
	
	@Test
	public void test_1() {
		// Get the Response from server.
		given().
		//header("Content-Type", "application/json").
		//accept(contentType)
			get("https://reqres.in/api/users?page=2").
		then().
			statusCode(200).
			body("data.id[1]", equalTo(8)).
			body("data.first_name", hasItems("Michael","Lindsay","Tobias","Byron","George","Rachel"));
			
		//	log().all();
			
		
	}

}
