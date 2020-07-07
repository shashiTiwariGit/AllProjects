package API.Demo;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.asserts.Assertion;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// vAalidate any one of the API
		// given : all input Details
		// when : Submit the API- Resource and http post
		// then - validate the response
		String response;
		String newAddress = "70 Summer walk, USA";
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		response = given().log().all().queryParam("key", "qaclick123").header("Contenet-Type", "application/json")
				.body("{\r\n" + "  \"location\": {\r\n" + "    \"lat\": -38.383494,\r\n" + "    \"lng\": 33.427362\r\n"
						+ "  },\r\n" + "  \"accuracy\": 50,\r\n" + "  \"name\": \"Frontline house\",\r\n"
						+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
						+ "  \"address\": \"29, side layout, cohen 09\",\r\n" + "  \"types\": [\r\n"
						+ "    \"shoe park\",\r\n" + "    \"shop\"\r\n" + "  ],\r\n"
						+ "  \"website\": \"http://google.com\",\r\n" + "  \"language\": \"French-IN\"\r\n" + "}\r\n"
						+ "")
				.when().post("/maps/api/place/add/json").then().assertThat().statusCode(200)
				.body("scope", equalTo("APP")).header("server", "Apache/2.4.18 (Ubuntu)").extract().asString();

		System.out.println(response);

		// Add place
		// update Address
		// Get place and Validate New Address is Present in Response
		JsonPath js = ReUsableMethods.rawToJson(response);
		String placeId = js.getString("place_id");
		System.out.println(placeId);
		// Update place
		given().log().all().queryParam("key", "qaclick123").header("Contenet-Type", "application/json")
				.body("{\r\n" + "\"place_id\":\"" + placeId + "\",\r\n" + "\"address\":\"" + newAddress + "\",\r\n"
						+ "\"key\":\"qaclick123\"\r\n" + "}\r\n" + "")
				.when().put("/maps/api/place/update/json").then().log().all().assertThat().statusCode(200)
				.body("msg", equalTo("Address successfully updated"));

		// Get Place
		String getPlaceResponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId)
				.when().get("/maps/api/place/get/json").then().log().all().assertThat().statusCode(200).extract()
				.response().asString();
		JsonPath js1 = ReUsableMethods.rawToJson(getPlaceResponse);
		String actualAdderess = js1.getString("address");
		System.out.println(actualAdderess);
		System.out.println(actualAdderess.equals(newAddress));
		Assert.assertTrue(actualAdderess.equals(newAddress));
	}
}
