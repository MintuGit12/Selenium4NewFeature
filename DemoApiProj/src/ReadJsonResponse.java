import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
public class ReadJsonResponse {

	public static void main(String[] args) {
	RestAssured.baseURI="https://rahulshettyacademy.com/";
	String res = given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
	.body(Payload.addPlacePalyload()).when().post("maps/api/place/add/json").then().log()
	.all().assertThat().statusCode(200).body("scope", equalTo("APP")).header("Connection", "Keep-Alive")
	.extract().response().asString();
	System.out.println(res);
	JsonPath js=new JsonPath(res);
	String placeId = js.getString("place_id");
	System.out.println(placeId);
	
	//update place API using put()
	String address="quick summer walk,USA";
	given().log().all().queryParam("key", "qaclick123").header("Content_Type","application/json")
	.body("{\r\n"
			+ "    \"place_id\": \""+placeId+"\",\r\n"
			+ "    \"address\": \""+address+"\",\r\n"
			+ "    \"key\": \"qaclick123\"\r\n"
			+ "}").when().put("maps/api/place/add/json").then().log().all()
	.assertThat().statusCode(200).body("msg", equalTo("Address Successfully updated"));
	
	//get the place name and asert that if its updated or not
	String res2 = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId)
	.when().get("maps/api/place/get/json").then().log().all().assertThat().statusCode(200)
	.extract().response().asString();
	JsonPath js1=new JsonPath(res2);
	String add = js1.getString("address");
	System.out.println(add+".....................");
	//Assert.assertEquals(add, address);
	}
}
