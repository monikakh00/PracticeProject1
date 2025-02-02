package Practice1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo2 {

	public static void main(String[] args) {

//*******************Add Query Parameter -  queryParam() method*************************
		RestAssured.baseURI="http://localhost:3000/employees";
		RequestSpecification httpRequest=RestAssured.given();
		httpRequest.queryParam("address", "Mumbai");
		Response response =httpRequest.get();
		int statusCode=response.statusCode();
		String statusLine=response.statusLine();
		long respTime =response.time();
		String respBody=response.body().asString();
		System.out.println(statusCode);
		System.out.println(statusLine);
		System.out.println(respTime);
		System.out.println(respBody);
		

	}

}
