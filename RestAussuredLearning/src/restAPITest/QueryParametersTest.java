package restAPITest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class QueryParametersTest {
	@Test
	public void GetWeatherDetails() {

		RestAssured.baseURI = "https://samples.openweathermap.org/data/2.5/";

		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.queryParam("q", "London,UK")
									   .queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8")
									   .get("/weather");

		String jsonString = response.asString();
		System.out.println(response.getStatusCode());
		System.out.println(response.getContentType());
		System.out.println(response.getBody().asString());
		Assert.assertEquals(jsonString.contains("London"), true);

	}
}
