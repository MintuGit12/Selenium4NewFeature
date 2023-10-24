	import io.restassured.RestAssured;
	import static io.restassured.RestAssured.*;
	import static org.hamcrest.Matchers.*;

public class AssertHeader_Body {

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
			.body("{\"location\": {\r\n"
					+ "    \"lat\": -38.383494,\r\n"
					+ "    \"lng\": 33.427362 \r\n"
					+ "},\r\n"
					+ "\"accuracy\": 50,\r\n"
					+ "\"name\": \"Frontline house1\",\r\n"
					+ "\"phone_number\": \"(+91) 983 893 3937\",\r\n"
					+ "\"address\": \"29, side layout, cohen 09\",\r\n"
					+ "\"types\": [\r\n"
					+ "    \"shoe park\",\r\n"
					+ "    \"shop\"\r\n"
					+ "     ],\r\n"
					+ "     \"website\": \"http://google.com\",\r\n"
					+ "     \"language\": \"French-IN\"\r\n"
					+ "     }").when().post("maps/api/place/add/json").then()
			.log().all().assertThat().statusCode(200).body("scope", equalTo("APP")).header("User-Agent", "PostmanRuntime/7.29.0")
			.extract().response().toString();
		}

	}
