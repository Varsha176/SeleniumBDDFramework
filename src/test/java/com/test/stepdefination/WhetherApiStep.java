package com.test.stepdefination;

import org.testng.Assert;

import com.test.API.WhetherAPI;
import com.test.base.ConfigHelper;
import com.test.base.base;

import io.cucumber.java.en.Given;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class WhetherApiStep extends base{
	
	float celcius;
	Response response;
	int Rangeval=Integer.parseInt(ConfigHelper.INSTANCE.getProperty("Magnitude"));
	
	@Given("Launch Whether Api for {string}")
	public void Launch_whether_api(String city) throws Throwable {
		
		 response =WhetherAPI.CheckWhetherDetails(city);

		
	}
	
	@Given("Fetch Temp data for {string}")
	public void Fetch_Temp_data(String city) throws Throwable {
		
		Assert.assertEquals(response.getStatusCode(),200);
		JsonPath jsonPathEvaluator = response.jsonPath();
		
		 Temp=jsonPathEvaluator.get("main.temp");
		System.out.print("-------"+Temp);
		
	}
	
	@Given("Convert temp from kelvin to celcius")
	public void Convert_Temp() throws Throwable {
		try
		{
			 celcius=WhetherAPI.ConvertFromKelvinToCelcius(Temp);
			System.out.print(celcius);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			ex.getCause();
		}
		
	}
	@Given("Check variance in temprature")
	public void Check_variance() throws Throwable {
		try
		{
			
			double val=WhetherAPI.getDoubleFromNoisyString(WhetherObj1);
			
			if(celcius-val>Rangeval)
			{
				System.out.println("Temp variance is morte than 2");
			}
			else
			{
				System.out.println("Temp matched from both the UI and API");
			}
		}
		catch(NumberFormatException ex)
		{
			 System.out.println("not a number"); 
			ex.printStackTrace();
		}
		
	}
	

}
