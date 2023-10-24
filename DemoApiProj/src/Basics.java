import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//validate add plasce api working as expected
		//conditions
		//Given-what and all input are given
		//when-when the API is submitted
		//then-verify the responces
		//Given the input When request is submitted and Then the respose is verified
		RestAssured.baseURI="https://rahulshettyacademy.com/";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(Payload.addPlacePalyload()).then()
		.log().all().assertThat().statusCode(200);
	}

}
 