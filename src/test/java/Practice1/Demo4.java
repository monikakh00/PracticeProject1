package Practice1;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo4 {

	public static void main(String[] args) {
		
		//Use json-simple library to create response body by creating object of JSONObject class 
		
		RestAssured.baseURI="http://localhost:3000/employees";
		RequestSpecification httpRequest=RestAssured.given();
		httpRequest.header("Content-Type","application/json");
		
		JSONObject json=new JSONObject();
		json.put("fname", "monika");
		json.put("lname", "patil");
		json.put("mobileNo", "9623232754");
		json.put("address", "pune");
		json.put("emailId", "monikaadsul1292@gmail.com");
		
		String resqBody=json.toString();
		httpRequest.body(resqBody);
		
		Response response =httpRequest.post();
		int statusCode=response.getStatusCode();
		System.out.println(statusCode);
		
		String statusLine=response.getStatusLine();
		System.out.println(statusLine);
		
		long respTime=response.getTime();
		System.out.println(respTime);
		
		String respBody=response.getBody().asString();
		System.out.println(respBody);
		
		

	}

}
