package restAPITestPost;

import org.testng.annotations.Test;

@Test
public class RegistrationSuccessResponse 
{
	public String SuccessCode;

	public String getSuccessCode() {
		return SuccessCode;
	}

	public void setSuccessCode(String successCode) {
		SuccessCode = successCode;
	}

	public String Message;
}
