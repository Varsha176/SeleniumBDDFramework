package com.test.API;



import com.test.base.ConfigHelper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class WhetherAPI {
	

	static String BaseUrl=ConfigHelper.INSTANCE.getProperty("Api_endpoint");
	 static String key=ConfigHelper.INSTANCE.getProperty("AccessKey");
	 
	public static Response CheckWhetherDetails(String city)
	{
		RestAssured.baseURI =BaseUrl; 
		 RequestSpecification request = RestAssured.given();
		 
		 Response response = request.queryParam("q", city) 
		                    .queryParam("appid", key) 
		                    .get("/weather");
		 
		return response; 
		 
		 }
	
	public static float ConvertFromKelvinToCelcius(float temp)
	{
		float celsius = temp - 273.15F;
		System.out.println("Celsius: "+ celsius);
		return celsius;
	}
	public static double getDoubleFromNoisyString(String s) {
	    return Double.valueOf(
	               s.replaceAll(
	                   "^.*?(-?\\d+(\\.\\d+)?).*$",
	                   "$1"));
	}
	
	
	}

