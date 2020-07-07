package oAuth2Example;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OAuthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(Integer.parseInt("10")==10);
	int i=10;
	
		
		
		String accessTokenResponse=given()
		.queryParams("code","")
		.queryParams("client_id","692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		.queryParams("client_sceret","erZOWM9g3UtwNRj340YYaK_W")
		.queryParams("redirect_uri","https://rahulshettyacademy.com/getCourse.php")
		.queryParams("grant_type","authorization_code")
		.when().log().all()
		.post("https://www.googleapis.com/oauth2/v4/token").asString();
		
		JsonPath js=new JsonPath(accessTokenResponse);
		String accessToken = js.getString("access_token");
		
		String response=given().log().all().queryParam("access_token",accessToken )
		.when().get("https://rahulshettyacademy.com/getCourse.php").asString();
		System.out.println(response);

	}

}
