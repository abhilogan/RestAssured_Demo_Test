package restAPITest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class JSONPathTest {
  @Test
  public void GetWeatherDetails() 
  {
	  RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
	  RequestSpecification httpResponse = RestAssured.given();
	  Response response = httpResponse.get("/Indore");
	  
	  System.out.println("\n" + response.asString() +"\n" );
	  
	  // First get the JsonPath Object instance from the Response interface..
	  JsonPath jsonPathEvaluator = response.jsonPath();
	  
	  //Then simply query the JsonPath Object to get a String
	  //value of the node specified by JsonPath : city 
	  //(Note :: You should not put $. in the java code)
	  String city = jsonPathEvaluator.get("City");
	  System.out.println("City recieved from the response :: \t"+ city);
	  System.out.println("Temperature recieved from the response :: \t"+ jsonPathEvaluator.get("Temperature"));
	  System.out.println("Humidity recieved from the response :: \t"+ jsonPathEvaluator.get("Humidity"));
	  System.out.println("WeatherDescription recieved from the response :: \t"+ jsonPathEvaluator.get("WeatherDescription"));
	  System.out.println("WindSpeed recieved from the response :: \t"+ jsonPathEvaluator.get("WindSpeed"));
	  System.out.println("WindDirectionDegree recieved from the response :: \t"+ jsonPathEvaluator.get("WindDirectionDegree"));
	 
	 // Assert.assertEquals(city,"Indore" , "Correct city name received in the response");
  }
}
