package restAPITestPost;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class PostRestAssuredTest {
	@Test
	public void PostJsonData() 
	{ 
//		 RestAssured.baseURI ="http://restapi.demoqa.com/customer";
//		 RequestSpecification request = RestAssured.given();
//		 
//		 JSONObject requestParams = new JSONObject();
//		 requestParams.put("FirstName", "qVirender"); // Cast
//		 requestParams.put("LastName", "qSingh");
//		 requestParams.put("UserName", "93userf2d3d2011");
//		 requestParams.put("Password", "password2"); 
//		 requestParams.put("Email",  "ld26dff39@gmail.com");
//		 
//		 request.body(requestParams.toJSONString());
//		 Response response = request.post("/register");
//		 
//		 ResponseBody body = response.getBody();
//		 
//		 // Deserialize the Response body into RegistrationSuccessResponse
//		 RegistrationSuccessResponse responseBody = body.as(RegistrationSuccessResponse.class);
//		 
//		 // Use the RegistrationSuccessResponse class instance to Assert the values of 
//		 // Response.
//		 Assert.assertEquals("OPERATION_SUCCESS", responseBody.SuccessCode);
//		 Assert.assertEquals("Operation completed successfully", responseBody.Message);
		
		
		 RestAssured.baseURI ="http://restapi.demoqa.com/customer";
		 RequestSpecification request = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("FirstName", "kgkjhgkj"); // Cast
		 requestParams.put("LastName", "hh");
		 requestParams.put("UserName", "993userf2d3d2011");
		 requestParams.put("Password", "password65"); 
		 requestParams.put("Email",  "ed26dff55@gmail.com");
		 
		 request.body(requestParams.toJSONString());
		 Response response = request.post("/register");
		 
		 ResponseBody body = response.getBody();
		 
		 System.out.println(response.getStatusCode());
		 System.out.println(response.getBody().asString());
		
		
		
		
		
		}
}
