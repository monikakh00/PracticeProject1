package Practice1;

import java.util.concurrent.TimeUnit;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo3 {

	public static void main(String[] args) {

		
		//Retrieve all Entity whose price is 100
		//https://api.escuelajs.co/api/v1/products?price=100
		
		
		RestAssured.baseURI="https://api.escuelajs.co/api/v1/products";
		RequestSpecification httpRequest=RestAssured.given();
		httpRequest.queryParam("price", 1100);
		Response response =httpRequest.get();
		int statusCode=response.statusCode();
		String statusLine=response.statusLine();
		long responseTime=response.getTime();
		//long responseTime1=response.getTimeIn(TimeUnit.SECONDS);
		//long responseTime2=response.timeIn(TimeUnit.SECONDS);
		String respBody=response.getBody().asString();
		
		System.out.println(statusCode);
		System.out.println(statusLine);
		System.out.println(responseTime);
		System.out.println(respBody);
		
	
		
		
		
		
		
		
		

	}

}
