package restAPITest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ValidateTest 
{
  @Test
  public void GetWeatherDetails() 
  {
	  RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
	  RequestSpecification httpRequest = RestAssured.given();
	  
		/*
		 * Response response = httpRequest.get("/Indore");
		 * 
		 * int statusCode = response.getStatusCode(); System.out.println(statusCode);
		 * Assert.assertEquals(statusCode, 200 ,"Correct status code return");
		 */
	  //System.out.println(response.getBody().asString());
  
	  Response response = httpRequest.get("/123325645645874");
		 
	  int statusCode = response.getStatusCode();
	  System.out.println(statusCode);
	  Assert.assertEquals(statusCode, 200 ,"Correct status code return");
  }
  
}
