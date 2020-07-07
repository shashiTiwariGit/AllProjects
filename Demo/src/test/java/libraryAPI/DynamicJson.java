package libraryAPI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import API.Demo.ReUsableMethods;
import static io.restassured.RestAssured.given;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import files.Payload;

public class DynamicJson {

	@Test(dataProvider = "BooksData")

	public void addBook(String isbn, String aisle)

	{

		RestAssured.baseURI = "http://216.10.245.166";

		String response = given().

				header("Content-Type", "application/json").

				body(Payload.addBook(isbn, aisle)).

				when().

				post("/Library/Addbook.php").

				then().assertThat().statusCode(200).

				extract().response().asString();

		JsonPath js = ReUsableMethods.rawToJson(response);

		String id = js.get("ID");

		System.out.println(id);

		// deleteBOok

	}

@DataProvider(name="BooksData")

public Object[][]  getData()

{

//array=collection of elements

//multidimensional array= collection of arrays

	return new Object[][] {{"asdf","123"},{"asdf","234"},{"asdf","345"}};

}

}
