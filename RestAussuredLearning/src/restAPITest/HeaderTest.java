package restAPITest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class HeaderTest 
{
  @Test
  public void GetWeatherDetails() 
  {
	  RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
	  RequestSpecification httpRequest = RestAssured.given();
	  
	  Response response = httpRequest.get("/Indore");
	  
		/*
		 * String contentType = response.header("Content-Type");
		 * System.out.println(contentType);
		 * 
		 * String serverType = response.header("server");
		 * System.out.println(serverType);
		 * 
		 * String acceptedLanguage = response.header("Content-Encoding");
		 * System.out.println(acceptedLanguage);
		 */
	  
	  Headers headers = response.headers();
	  
	  for(Header headers2 : headers)
	  {
		  System.out.println("Key :: " +headers2.getName() + "\t\t  Value :: "+headers2.getValue());
	  }
  }
}
