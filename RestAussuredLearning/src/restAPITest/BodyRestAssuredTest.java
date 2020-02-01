package restAPITest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BodyRestAssuredTest {
  @Test
  public void GetWeatherDetails() 
  {
	  RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
	  RequestSpecification httpRequest = RestAssured.given();
	  
//	  Response response = httpRequest.request(Method.GET, "/Indore");
//	  
//	  ResponseBody body = response.getBody();
//	  
//	  System.out.println(body.asString());
	  
	  Response response = httpRequest.get("/Indore");
	  
	  String body = response.asString();
	  
//    Assert.assertEquals(body.contains("Indore"),true ,"Response body contains Indore");
	
	// convert the body into lower case and then do a comparison to ignore casing.
	  Assert.assertEquals(body.toLowerCase().contains("indore"), true , "Response body contions Indore");
	  
  }
}
