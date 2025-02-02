package Practice1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {

	public static void main(String[] args) {


		//1.Set BaseURI in Rest Assured 
		RestAssured.baseURI="http://localhost:3000/employees/1";
		
		//2.Get RequestSpecification interface object name by using given() method 
		RequestSpecification resp=RestAssured.given();

		//3.Select HTTP GET Request from RequestSpecification object 
		Response response =resp.get();
		
		//4.Capture status code by using getStatusCode() method 
		int statuscode=response.getStatusCode();
		int statuscode1=response.statusCode();
		System.out.println(statuscode);
		System.out.println(statuscode1);
		
		//5.Capture statusline by using getStatusLine() method 
		String statusline =response.getStatusLine();
		String statusline1=response.statusLine();
		System.out.println(statusline);
		System.out.println(statusline1);
		
		//6.Capture response time by using getTime() method 
		long resptime=response.getTime();
		long resptime1=response.time();
		System.out.println(resptime);
		System.out.println(resptime1);
		
		//7.Capture respose body by using getBody().asString() method 
		String respBody=response.getBody().asString();
		//String respBody1 = response.body();
		System.out.println(respBody);
	}

}
